/* Save file class
The goal is to save all of the progress that the player has acheived.
Attempt 1: Create a text file with all of the information and then encrypt it. 
           The issue would be to decrypt it. 
           They key would have to be the saved as well (it will also have to be randomly generated each save).
*/
import java.util.*;
public class savefile
{
  public static void main(String [] args)
  { 
           PrintWriter writer = new PrintWriter("savefile.txt*, "UTF-8");
           writer.println("Hello Word");
           writer.println("Ethan_T");
           writer.close();
  }
}
