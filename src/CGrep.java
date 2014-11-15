import akka.actor.*;

import java.io.File;

public class  CGrep {

    public static void main(String[] args) {

        // Make sure at least the pattern argument is given
        if (args.length < 1) {
            System.out.println("usage: java CGrep pattern [file . . .]");
            return;
        }

        // Create the CollectionActor
        ActorSystem system = ActorSystem.create();
        ActorRef collection = system.actorOf( new Props(CollectionActor.class) );

        // set the pattern for later use
        String pattern = args[0];

        int fc = 0;

        // Iterate each filename
        for (int i = 1; i < args.length; i++) {
            File f = new File(args[i]);
            if (f.exists()) {
                fc++;
            } else {
                System.out.println("File " + args[i] + " not found!");
            }
        }

        FileCount fCount = new FileCount(fc);
        collection.tell(fCount, null);

        for (int i = 1; i < args.length; i++) {
            File f = new File(args[i]);
            if (f.exists()) {
                ActorRef scan = system.actorOf(new Props((ScanActor.class)));
                scan.tell(
                        new Configure(collection, args[i]),
                        null
                );
            }
        }

    }
}

