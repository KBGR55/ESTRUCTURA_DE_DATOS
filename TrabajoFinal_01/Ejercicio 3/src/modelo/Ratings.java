package modelo;

/**
 *
 * @author K.G
 */
public class Ratings {
    private String source;
    private String value;

    public Ratings(String source, String value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String Source) {
        this.source = Source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}