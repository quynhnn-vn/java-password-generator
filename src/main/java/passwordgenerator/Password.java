package passwordgenerator;

public class Password {
    String value;
    int length;

    public Password(String passwordObj) {
        value = passwordObj;
        length = passwordObj.length();
    }

    @Override
    public String toString() {
        return value;
    }
}
