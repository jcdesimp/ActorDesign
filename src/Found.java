import java.util.List;

/**
 * Created by jcdesimp on 11/14/14.
 */
public class Found {
    private String fileName;
    private List<String> matchingLines;

    public Found(String fileName, List<String> matchingLines) {
        this.fileName = fileName;
        this.matchingLines = matchingLines;
    }
}
