/**
 * Custom Exception for NIRF Data Validation
 */
public class NIRFException extends Exception {

    private String errorCode;

    public NIRFException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() { return errorCode; }

    @Override
    public String toString() {
        return "NIRFException [" + errorCode + "]: " + getMessage();
    }
}