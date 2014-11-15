import akka.actor.UntypedActor;
import akka.actor.Actor;


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
        if (o instanceof FileCount){
           //TODO handle FileCount message
           // this.fileFound = ((FileCount)o).numFiles;
        } else if (o instanceof Found) {
            //todo handle a Found message
        } else {
            unhandled(o);
        }

    }
}
