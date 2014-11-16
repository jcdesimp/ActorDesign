import akka.actor.UntypedActor;
import com.sun.xml.internal.bind.v2.model.annotation.FieldLocatable;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jcdesimp on 11/14/14.
 * Scans for occurrences of a pattern in a single file
 */
public class ScanActor extends UntypedActor {


    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof Configure) {

            String fileName = ((Configure) o).getFileName();
            File f = new File(fileName);
            String pattern = ((Configure) o).getPattern();
            String line = "";
            String complete_pattern = ".*" + pattern + ".*";
            int line_num = 1;
            ArrayList<String> found_lines = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                while((line = reader.readLine()) != null)
                {
                    if (line.matches(complete_pattern))
                    {
                        String result = Integer.toString(line_num) + " " + line;
                        found_lines.add(result);

                    }
                    line_num++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Found result = new Found(fileName, found_lines);
            ((Configure) o).getTheCollection().tell(result, self());


        } else {
            unhandled(o);
        }

    }
}
