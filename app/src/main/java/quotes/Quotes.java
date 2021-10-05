package quotes;

public class Quotes {

    private String  author,likes,text;
    private String[] tags;


    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
