import akka.actor.ActorRef;

/**
 * Created by jcdesimp on 11/14/14.
 * Configure message to be sent to ScanActor
 */
public class Configure {
    private String fileName;
    private ActorRef theCollection;

    public Configure(ActorRef theCollection, String fileName) {
        this.theCollection = theCollection;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public ActorRef getTheCollection() {
        return theCollection;
    }
}
