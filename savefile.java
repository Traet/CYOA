/* Save file class
The goal is to save all of the progress that the player has acheived.
Attempt 1: Create a text file with all of the information and then encrypt it. 
            The issue would be to decrypt it. 
            They key would have to be the saved as well (it will also have to be randomly generated each save).
            Creation of textfile has succeeded!
*/
import java.io.*;
import java.util.*;
public class savefile {
    public static void main(String[] args) {
        String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            output.write("\nya yeet");
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        } 
    }
}
