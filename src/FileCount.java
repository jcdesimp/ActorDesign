/**
 * Created by jcdesimp on 11/14/14.
 * Message that counts the number of files being scanned.
 */
public class FileCount {
    //immutable integer
    private final int numFiles;

    public FileCount(int numFiles){
        this.numFiles = numFiles;
    }

    public int getNumFiles() {
        return numFiles;
    }
}
