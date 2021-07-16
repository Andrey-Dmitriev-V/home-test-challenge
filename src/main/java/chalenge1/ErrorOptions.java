package chalenge1;

public enum ErrorOptions {
    NULL_EXCEPTION_MESSAGE("Null is not a valid input");

    private final String ErrorMessage;

    ErrorOptions(String anErrorMessage) {
        ErrorMessage = anErrorMessage;
    }

    @Override
    public String toString() {
        return ErrorMessage;
    }
}
