import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIn {
    
    public static void tryFileRead()
    {
            try {
                ArrayList<String> names = FileRead();
                CreatFighter.creatFighter(names);
            } catch (FileNotFoundException e) {
                System.out.println("Hiba! File nem találhato!");
            }
    }

    public static ArrayList<String> FileRead() throws FileNotFoundException
    {
            ArrayList<String> names = new ArrayList<String>();
            File f = new File("nevek.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine().trim();
                names.add(line);
            };
            return (names);
    }




}
