package ivangka.main;

import java.util.*;

/**
 * Utility class for operations on word pairs.
 */
public class DoSomethingWithWordPair {

    /**
     * Scanner for user input.
     */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Random number generator.
     */
    private static final Random RANDOM = new Random();

    /**
     * Displays the whole dictionary of word pairs.
     *
     * @param wordPairs list of word pairs
     */
    public static void viewWholeDictionary(List<WordPair> wordPairs) {

        int i = 0;
        System.out.println("\n\n");
        System.out.println("=============================================");
        for (WordPair wordPair : wordPairs) {
            System.out.println(wordPair);
            if (++i % 100 == 0) System.out.println();
        }
        System.out.println("=============================================");
        System.out.println();

    }

    /**
     * Shuffles and displays all word pairs.
     *
     * @param allWordPairs list of all word pairs
     */
    public static void getAllPairs(List<WordPair> allWordPairs) {

        List<WordPair> allPairsCopy = new LinkedList<>(allWordPairs);
        Collections.shuffle(allPairsCopy);
        pairsIterator(allPairsCopy);

    }

    /**
     * Shuffles and displays a sublist of word pairs.
     *
     * @param allWordPairs list of all word pairs
     * @param start        starting index
     * @param end          ending index
     */
    public static void getSubPairs(List<WordPair> allWordPairs, int start, int end) {

        List<WordPair> subWordPairs = new LinkedList<>(allWordPairs.subList(start - 1, end));
        Collections.shuffle(subWordPairs);
        pairsIterator(subWordPairs);

    }

    /**
     * Iterates through a list of word pairs for user interaction.
     *
     * @param wordPairs list of word pairs
     */
    private static void pairsIterator(List<WordPair> wordPairs) {

        int count = 0;
        List<WordPair> wordPairsToRepeat = new LinkedList<>();
        System.out.println("\n[Press Enter if you know the translation]");
        System.out.println("[\"0\" if you don't know the translation]");
        System.out.println("[\"-1\" if you don't know the translation of the previous word]");
        System.out.println("[\"stop\" to stop this range]");
        System.out.println("---------------------------------------------");

        WordPair previousWordPair = null;

        for (WordPair wordPair : wordPairs) {

            System.out.println(">> " + (++count) + "/" + wordPairs.size() + " <<");
            int temp = RANDOM.nextInt(2);

            if (temp == 0) {

                System.out.print(wordPair.getIndex() + "." + wordPair.getInFirstLanguage() + "- ");
                String tempString = SCANNER.nextLine();

                if (tempString.equals("-1")) {
                    if (previousWordPair != null) wordPairsToRepeat.add(previousWordPair);
                    System.out.print(wordPair.getIndex() + "." + wordPair.getInFirstLanguage() + "- ");
                    tempString = SCANNER.nextLine();
                }

                if (tempString.equals("stop")) {
                    return;
                } else if (tempString.equals("0")) {
                    wordPairsToRepeat.add(wordPair);
                }

                System.out.println(wordPair.getInSecondLanguage());

            } else {

                System.out.print(wordPair.getIndex() + "." + wordPair.getInSecondLanguage() + " - ");
                String tempString = SCANNER.nextLine();

                if (tempString.equals("-1")) {
                    if (previousWordPair != null) wordPairsToRepeat.add(previousWordPair);
                    System.out.print(wordPair.getIndex() + "." + wordPair.getInSecondLanguage() + " - ");
                    tempString = SCANNER.nextLine();
                }

                if (tempString.equals("stop")) return;
                else if (tempString.equals("0")) wordPairsToRepeat.add(wordPair);
                System.out.println(wordPair.getInFirstLanguage());

            }

            System.out.println("---------------------------------------------");
            previousWordPair = wordPair;

        }

        if (!wordPairsToRepeat.isEmpty()) {

            count = 0;
            System.out.println("\nWord pairs to repeat:");
            System.out.println("---------------------------------------------");

            for (WordPair wordPair : wordPairsToRepeat) {

                System.out.println(">> " + (++count) + "/" + wordPairsToRepeat.size() + " <<");
                int temp = RANDOM.nextInt(2);

                if (temp == 0) {

                    System.out.print(wordPair.getIndex() + "." + wordPair.getInFirstLanguage() + "- ");
                    String tempString = SCANNER.nextLine();
                    if (tempString.equals("stop")) return;
                    System.out.println(wordPair.getInSecondLanguage());

                } else {

                    System.out.print(wordPair.getIndex() + "." + wordPair.getInSecondLanguage() + " - ");
                    String tempString = SCANNER.nextLine();
                    if (tempString.equals("stop")) return;
                    System.out.println(wordPair.getInFirstLanguage());

                }

                System.out.println("---------------------------------------------");

            }

        }

    }

}
