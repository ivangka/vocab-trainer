package ivangka.main;

/**
 * Represents a word pair with its details and rating.
 */
public class WordPair {

    /**
     * The whole string representation of the word pair.
     */
    private String wholeString;

    /**
     * The index of the word pair.
     */
    private final int index;

    /**
     * The word in English.
     */
    private final String inEnglish;

    /**
     * The transcription of the word.
     */
    private final String transcription;

    /**
     * The word in Russian.
     */
    private final String inRussian;

    /**
     * The rating of the word pair.
     */
    private int rating;

    /**
     * Constructs a new WordPair with the specified details.
     *
     * @param wholeString   the whole string representation of the word pair
     * @param index         the index of the word pair
     * @param inEnglish     the word in English
     * @param transcription the transcription of the word
     * @param inRussian     the word in Russian
     * @param rating        the rating of the word pair
     */
    public WordPair(String wholeString, int index, String inEnglish,
                    String transcription, String inRussian, int rating) {

        this.wholeString = wholeString;
        this.index = index;
        this.inEnglish = inEnglish;
        this.transcription = transcription;
        this.inRussian = inRussian;
        this.rating = rating;

    }

    /**
     * Gets the index of the word pair.
     *
     * @return the index of the word pair
     */
    public int getIndex() {
        return index;
    }

    /**
     * Gets the word in English.
     *
     * @return the word in English
     */
    public String getInEnglish() {
        return inEnglish;
    }

    /**
     * Gets the word in Russian.
     *
     * @return the word in Russian
     */
    public String getInRussian() {
        return inRussian;
    }

    /**
     * Gets the transcription of the word.
     *
     * @return the transcription of the word
     */
    public String getTranscription() {
        return transcription;
    }

    /**
     * Gets the whole string representation of the word pair.
     *
     * @return the whole string representation of the word pair
     */
    public String getWholeString() {
        return wholeString;
    }

    /**
     * Sets the whole string representation of the word pair.
     *
     * @param wholeString the whole string representation of the word pair
     */
    public void setWholeString(String wholeString) {
        this.wholeString = wholeString;
    }

    /**
     * Gets the rating of the word pair.
     *
     * @return the rating of the word pair
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating of the word pair.
     *
     * @param rating the rating of the word pair
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Returns a string representation of the word pair.
     *
     * @return a string representation of the word pair
     */
    @Override
    public String toString() {
        return index + "." + inEnglish + "-" + inRussian;
    }

}
