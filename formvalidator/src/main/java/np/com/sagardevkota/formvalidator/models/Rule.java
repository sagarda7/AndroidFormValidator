package np.com.sagardevkota.formvalidator.models;

/**
 * Created by Dell on 5/27/2015.
 */
public class Rule {
    int type;
    String value;
    String message;

    public String getMessage() {
        return message;
    }

    public Rule setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getType() {
        return type;
    }

    public Rule setType(int type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Rule setValue(String value) {
        this.value = value;
        return this;
    }
}
