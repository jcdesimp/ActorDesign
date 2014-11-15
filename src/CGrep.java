import akka.actor.Actor;
import akka.actor.TypedActor;

import java.io.File;

public class  CGrep {

    public static void main(String[] args) {

        // Make sure at least the pattern argument is given
        if (args.length < 1) {
            System.out.println("usage: java CGrep pattern [file . . .]");
            return;
        }

        // set the pattern for later use
        String pattern = args[0];

        // Iterate each filename
        for (int i = 1; i < args.length; i++) {
            File f = new File(args[i]);
            if (f.exists()) {
                // start processing file
            } else {
                System.out.println("File " + args[i] + " not found!");
            }
        }

    }
}

