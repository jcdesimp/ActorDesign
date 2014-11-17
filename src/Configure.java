import akka.actor.ActorRef;

/**
 * Created by jcdesimp on 11/14/14.
 * Configure message to be sent to ScanActor
 */
public class Configure {
    private String fileName;
    private String pattern;
    private ActorRef theCollection;

    /**
     * Constructor
     * @param theCollection collection actor
     * @param pattern pattern to search for
     * @param fileName name of file to search
     */
    public Configure(ActorRef theCollection, String pattern, String fileName) {
        this.theCollection = theCollection;
        this.pattern = pattern;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getPattern() {
        return pattern;
    }

    public ActorRef getTheCollection() {
        return theCollection;
    }

}
