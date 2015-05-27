package np.com.sagardevkota.formvalidator.models;

/**
 * Created by Dell on 5/27/2015.
 */
public class ValidationResponse {
    boolean error=false;
    String message;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
