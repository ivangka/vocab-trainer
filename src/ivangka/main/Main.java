package ivangka.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class for the application that manages word pairs for learning foreign languages.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // file containing word pairs
        File file = new File(Path.PATH);
        Scanner scannerFile = new Scanner(file);

        // pattern to match word pairs in the file
        Pattern wordPairPattern = Pattern.compile("((\\d+)(.+)(\\[.+])(.+)(\\d*))");

        List<WordPair> allWordPairs = new ArrayList<>();
        Matcher matcher;

        // read the file and populate the list of word pairs
        while (scannerFile.hasNextLine()) {

            matcher = wordPairPattern.matcher(scannerFile.nextLine().replace("\t", " "));

            if (matcher.find()) {
                if (!matcher.group(6).isEmpty()) {
                    allWordPairs.add(new WordPair(matcher.group(1), Integer.parseInt(matcher.group(2)),
                            matcher.group(3), matcher.group(4), matcher.group(5), Integer.parseInt(matcher.group(6))));
                } else {
                    allWordPairs.add(new WordPair(matcher.group(1), Integer.parseInt(matcher.group(2)),
                            matcher.group(3), matcher.group(4), matcher.group(5), 0));
                }
            }

        }
        scannerFile.close();

        // interact with the user for different operations
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nENTER RANGE OF WORD PAIRS (current quantity = " + allWordPairs.size() + ")" + ":");
            System.out.println("[\"all\" to select all]");
            System.out.println("[\"dict\" to view whole dictionary]");
            System.out.println("[\"exit\" to close the program]\n");
            System.out.print("Starts with ");
            String startString = scanner.nextLine();

            if (startString.equals("exit")) {
                break;
            } else if (startString.equals("dict")) {
                DoSomethingWithWordPair.viewWholeDictionary(allWordPairs);
                continue;
            } else if (startString.equals("all")) {
                DoSomethingWithWordPair.getAllPairs(allWordPairs);
                System.out.println();
                continue;
            }

            int start = Integer.parseInt(startString);
            System.out.print("Ends with ");
            int end = Integer.parseInt(scanner.nextLine());
            DoSomethingWithWordPair.getSubPairs(allWordPairs, start, end);
            System.out.println();

        }

        // write the updated word pairs back to the file
        PrintWriter pw = new PrintWriter(file);
        for (WordPair wordPair : allWordPairs) {
            pw.println(wordPair.getWholeString());
        }

        pw.close();
    }

}
