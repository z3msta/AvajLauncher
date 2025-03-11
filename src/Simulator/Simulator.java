package Simulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        List<String> data = new ArrayList<String>();

        if (args.length != 1) {
            System.out.println("Usage: java Simulator.Main scenarioFile.txt");
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

        Parsing parser = new Parsing();
        if (parser.fileParsing(data) == -1) {
            System.out.println("Parsing failed");
        }
    }
}
