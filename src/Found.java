import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcdesimp on 11/14/14.
 * Object to hold information on a processed file.
 * Holde the lines that matched the patterns as well as the name of the file that was processed.
 */
public class Found {
    final private String fileName;
    final private List<String> matchingLines;

    public Found(String fileName, List<String> matchingLines) {
        this.fileName = fileName;
        this.matchingLines = matchingLines;
    }

    public List<String> getMatchingLines() {
        return new ArrayList<String>(matchingLines);
    }

    public String getFileName() {
        return fileName;
    }
}
