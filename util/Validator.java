package util;
//Ive imnported the packages here as well as I've also called the function for the validator class as well
public class Validator {
    public static boolean isValid(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
