import akka.actor.UntypedActor;


/**
 * Created by jcdesimp on 11/14/14.
 * Actor to
 */
public class CollectionActor extends UntypedActor {
    private int FileCount;

    //number of "Found" messages
    private int fileFound = 0;

    @Override
    public void onReceive(Object o) throws Exception {

        //if message is FileCount (count of number of objects)
        if (o.getClass() == FileCount.class) {
            this.FileCount = ((FileCount) o).numFiles;
        }

        //if message is Found object
        else if (o.getClass() == Found.class) {

            Found foundObj = (Found) o;

            if (!foundObj.matchingLines.equals("")) {
                //print out contents and check to see if all found
                //messages are processed
            } else {
                System.out.println("No matching lines for file" + foundObj.fileName + ".");
            }

            //TODO System shut down after finding all messages
        }
    }
}
