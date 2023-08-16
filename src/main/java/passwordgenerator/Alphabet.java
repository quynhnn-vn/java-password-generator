package passwordgenerator;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\\\/~?";

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
