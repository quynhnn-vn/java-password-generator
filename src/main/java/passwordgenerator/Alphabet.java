package passwordgenerator;

public class Alphabet {
    // public: access from anywhere in the program
    // static: belong to class rather than to instances of the class
    // finale: can not be changed once the variable is assigned
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\\\/~?";

    // private: access within the class
    private final StringBuilder stringBuilder = new StringBuilder();

    public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
        if (uppercaseIncluded) stringBuilder.append(UPPERCASE_LETTERS);
        if (lowercaseIncluded) stringBuilder.append(LOWERCASE_LETTERS);
        if (numbersIncluded) stringBuilder.append(NUMBERS);
        if (specialCharactersIncluded) stringBuilder.append(SYMBOLS);
    }

    public String getAlphabet() {
        return stringBuilder.toString();
    }
}
