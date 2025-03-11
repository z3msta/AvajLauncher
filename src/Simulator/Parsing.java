package Simulator;

import java.util.List;

import static java.lang.System.exit;


public class Parsing {

    public int fileParsing(List<String> data) {

        int i = 1;

        try {
            int number = Integer.parseInt(data.get(0));
        } catch (NumberFormatException e) {
            return -1;
        }

        while (data.size() > i) {

            System.out.println(data.get(i));
            i++;
        }
        return -1;
    }
}
