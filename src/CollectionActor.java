import akka.actor.UntypedActor;
import akka.actor.Actor;


/**
 * Created by jcdesimp on 11/14/14.
 * Actor to
 */
public class CollectionActor extends UntypedActor {
    private int fileCount;

    //number of "Found" messages
    private int fileFound = 0;

    /**
     * Handle action being received
     * @param o message being recieved
     * @throws Exception
     */
    @Override
    public void onReceive(Object o) throws Exception {
        //if message is FileCount (count of number of objects)
        if (o instanceof FileCount){
           fileCount = ((FileCount) o).getNumFiles();
        } else if (o instanceof Found) {
            System.out.println(((Found) o).getFileName());
            for (String s : ((Found) o).getMatchingLines()) {
                System.out.println(s);
            }


            fileFound++;
            if (fileFound == fileCount) {
                getContext().system().shutdown();
            }


        } else {
            unhandled(o);
        }

    }
}
