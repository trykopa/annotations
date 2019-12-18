package ua.kiev.prog;

import java.io.File;
import java.io.PrintWriter;

@SaveTo(path = "/Users/at/Downloads/stringfile.txt")
public class TextCont {
    String myString = "Very important line";

    public TextCont(){

    }

    @Save
    public void saveToFile(String file){
        try {
            File f = new File(file);
            if (f.createNewFile()) {
                System.out.println("File created:" + file.toString());

            }
            else {
                System.out.println("File already exists, start rewrite " + file.toString());
            }

            PrintWriter out = new PrintWriter(file);
            out.println(myString);
            System.out.println("String saved to file: " + f.toString());
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
