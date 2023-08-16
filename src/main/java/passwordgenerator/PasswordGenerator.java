package passwordgenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static Scanner keyboard = new Scanner(System.in);

    private boolean isValidUserInput(String userInput) {
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n");
    }

    private boolean setParams(String type) {
        String input;
        boolean paramValue = false;

        do {
            String question = String.format("Do you want to use %s ?", type);
            System.out.println(question);
            input = keyboard.next();
            if (!isValidUserInput(input)) {
                System.out.println("You have entered something incorrect let's go over it again");
                };
        } while (!isValidUserInput(input));

        if (input.equalsIgnoreCase("y"))  {
            paramValue = true;
        }
        return paramValue;
    }

    private Password generatePassword(int length, Alphabet alphabet) {
        final StringBuilder newPassword = new StringBuilder("");
        final int alphabetLength = alphabet.getAlphabet().length();

        int max = alphabetLength - 1;
        int min = 0;
        int range = max - min + 1;

        Random random = new Random();

        for (int i=0; i <length; i++) {
            int randomCharIdx = random.nextInt(range) + min;
            newPassword.append(alphabet.getAlphabet().charAt(randomCharIdx));
        }

        return new Password(newPassword.toString());
    }

    public void setParamsToGeneratePassword() {
        System.out.println("Please answer the following questions by Y or N");

        boolean uppercaseIncluded = false;
        boolean lowercaseIncluded = false;
        boolean numbersIncluded = false;
        boolean specialCharactersIncluded = false;

        boolean isParamsCorrect = false;
        do {
            uppercaseIncluded = setParams("uppercase letters");
            lowercaseIncluded = setParams("lowercase letters");
            numbersIncluded = setParams("numbers");
            specialCharactersIncluded = setParams("special characters");            
            
            if (!uppercaseIncluded && !lowercaseIncluded && !numbersIncluded && !specialCharactersIncluded) {
                System.out.println("You have to choose at least one Yes");
                isParamsCorrect = false;
            } else isParamsCorrect = true;
        } while (!isParamsCorrect);

        System.out.println("Greate ! Now enter the length of your password: ");
        int length = keyboard.nextInt();

        final Alphabet alphabet = new Alphabet(uppercaseIncluded, lowercaseIncluded, numbersIncluded, specialCharactersIncluded);
        final PasswordGenerator passwordGenerator = new PasswordGenerator();
        final Password password = passwordGenerator.generatePassword(length, alphabet);
    
        System.out.println("----Your generated password-----: " + password.toString());
    }

    public void renderGenerator() {
        System.out.println("Welcome to Password Services");
        setParamsToGeneratePassword();
    }
}
