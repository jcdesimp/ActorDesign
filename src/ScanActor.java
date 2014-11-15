import akka.actor.UntypedActor;

/**
 * Created by jcdesimp on 11/14/14.
 * Scans for occurrences of a pattern in a single file
 */
public class ScanActor extends UntypedActor {
    private String fileName;
    private CollectionActor collection;


    @Override
    public void onReceive(Object o) throws Exception {

    }
}
