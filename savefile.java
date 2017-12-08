/* Save file class
The goal is to save all of the progress that the player has acheived.
Attempt 1: Create a text file with all of the information and then encrypt it. 
            The issue would be to decrypt it. 
            They key would have to be the saved as well (it will also have to be randomly generated each save).
            Creation of textfile has succeeded!
            Encryption success!
*/
import java.io.*;
import java.util.*;
public class savefile {
    public static void main(String[] args) {
        //We will have to concatenate the Strings use \n between each different string.
        String encoded = "Grunt Li has a massive neck\nSteven IPHO Man"; 
        int offset = 17;
        encoded = encode(encoded, offset);
        save(encoded);
    }
    public static void save(String encoded)
    {
        BufferedWriter output = null;
        try {
            File file = new File("Save_File.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(encoded);
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        } 
    }
    public static String encode(String encode, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : encode.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}
