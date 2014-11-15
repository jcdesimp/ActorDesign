import akka.actor.UntypedActor;

/**
 * Created by jcdesimp on 11/14/14.
 * Scans for occurrences of a pattern in a single file
 */
public class ScanActor extends UntypedActor {

    private String fileName;


    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof Configure) {
            fileName = ((Configure) o).getFileName();

        } else {
            unhandled(o);
        }

    }
}
