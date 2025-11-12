package labs.lab6.Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class CopyFile {
    // Declaring throws IOException in the method signature
    public static void main(String[] args) throws IOException { 
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // This line might throw FileNotFoundException (a type of IOException)
            in = new FileInputStream("input.txt"); 
            out = new FileOutputStream("output.txt");
            int c;

            // read() and write() might throw IOException
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            
        } finally {
            // The close() calls also throw IOException, which are now handled 
            // by the main method's throws declaration.
            if (in != null) {
                in.close(); 
            }

            if (out != null) {
                out.close();
            }
        }
    }
}
