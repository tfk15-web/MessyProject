import java.io.*;
import java.util.*;

public class Persister
{
    public static void save(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt"); // Create file

        FileWriter fw = new FileWriter(file); // Create file writer

        BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter

        for(User user : users) // løb igennem alle brugere
        {
            bw.write(user.toString());
            bw.newLine();
        }

        bw.close();
        fw.close();
    }
}
