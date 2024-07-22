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
     * The word in first language.
     */
    private final String firstLanguage;

    /**
     * The transcription of the word.
     */
    private final String transcription;

    /**
     * The word in second language.
     */
    private final String secondLanguage;

    /**
     * The rating of the word pair.
     */
    private int rating;

    /**
     * Constructs a new WordPair with the specified details.
     *
     * @param wholeString    the whole string representation of the word pair
     * @param index          the index of the word pair
     * @param firstLanguage  the word in first language
     * @param transcription  the transcription of the word
     * @param secondLanguage the word in second language
     * @param rating         the rating of the word pair
     */
    public WordPair(String wholeString, int index, String firstLanguage,
                    String transcription, String secondLanguage, int rating) {

        this.wholeString = wholeString;
        this.index = index;
        this.firstLanguage = firstLanguage;
        this.transcription = transcription;
        this.secondLanguage = secondLanguage;
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
     * Gets the word in first language.
     *
     * @return the word in first language
     */
    public String getInFirstLanguage() {
        return firstLanguage;
    }

    /**
     * Gets the word in second language.
     *
     * @return the word in second language
     */
    public String getInSecondLanguage() {
        return secondLanguage;
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
        return index + "." + firstLanguage + "-" + secondLanguage;
    }

}
