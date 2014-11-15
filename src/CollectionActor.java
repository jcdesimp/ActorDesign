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
    if (o.getClass()==FileCount.class){
       //TODO
       // this.fileFound = ((FileCount)o).numFiles;
    }


    //if message is Found object

    }
}
