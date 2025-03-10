import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> data = new ArrayList<String>();

        if (args.length != 1) {
            System.out.println("Usage: java Main scenarioFile.txt");
            return;
        }
        try {
            File scnearioFile = new File(args[0]);
            if (!scnearioFile.exists()) {
                throw new FileNotFoundException(args[0]);
            }
            Scanner reader = new Scanner(scnearioFile);
            int i = 0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
        }

        int i = 0;
        while (i < data.size()) {
            System.out.println(data.get(i));
            i++;
        }
    }
}


