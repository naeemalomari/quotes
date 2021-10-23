package quotes;

public class QuotesAPI {
    private String quoteText;
    private String quoteAuthor;
    private final String senderName;
    private final String senderLink;
    private final String quoteLink;

    public QuotesAPI(String quoteText, String quoteAuthor, String senderName, String senderLink, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.senderLink = senderLink;
        this.quoteLink = quoteLink;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderLink() {
        return senderLink;
    }

    public String getQuoteLink() {
        return quoteLink;
    }
}
