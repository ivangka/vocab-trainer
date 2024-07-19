package ivangka.main;

public class WordPair {
    private String wholeString;
    private final int index;
    private final String inEnglish;
    private final String transcription;
    private final String inRussian;
    private int rating;

    public WordPair(String wholeString, int index, String inEnglish,
                    String transcription, String inRussian, int rating) {
        this.wholeString = wholeString;
        this.index = index;
        this.inEnglish = inEnglish;
        this.transcription = transcription;
        this.inRussian = inRussian;
        this.rating = rating;
    }

    public int getIndex() {
        return index;
    }

    public String getInEnglish() {
        return inEnglish;
    }

    public String getInRussian() {
        return inRussian;
    }

    public String getTranscription() {
        return transcription;
    }

    public String getWholeString() {
        return wholeString;
    }

    public void setWholeString(String wholeString) {
        this.wholeString = wholeString;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return index + "." + inEnglish + "-" + inRussian;
    }
}
