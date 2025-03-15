package Simulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Simulator {
    public static void main(String[] args) {

        List<String> data = new ArrayList<String>();

        if (args.length != 1) {
            System.out.println("Usage: java src Simulator.Simulator scenarioFile.txt");
            return;
        }

        try {
            File scnearioFile = new File(args[0]);
            if (!scnearioFile.exists()) {
                throw new FileNotFoundException(args[0]);
            }
            Scanner reader = new Scanner(scnearioFile);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
            exit(1);
        }

        Parsing parser = new Parsing();
        try {
            parser.fileParsing(data);
        } catch (ParsingErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
