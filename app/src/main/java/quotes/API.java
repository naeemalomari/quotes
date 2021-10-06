package quotes;

public class API {
    String quoteText;
    String quoteAuthor;
    String quoteLink;

    public API(String quoteText, String quoteAuthor, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.quoteLink = quoteLink;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteLink() {
        return quoteLink;
    }
}
