/**
 * Recursion
 */
public class Recursion {

    public static double fatorial(int n) throws IllegalArgumentException {
        if(n < 0){
            throw new IllegalArgumentException("Negative numbers aren't allowed.");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static double somatory(int n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException("Negative numbers aren't allowed");
        }
        if( n == 0){
            return 0;
        }
        return n + somatory(n-1);
    }

    public static int fibonacci(int n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException("Negative numbers aren't allowed");
        }
        if (n == 0 || n == 1 ){
            return n;
        }
        return  fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean palindrome(String word){
        if(word.equals("")){
            return false;
        }
        word = word.toLowerCase();
        return palindrome(word, 0, word.length() - 1);
    }
    private static boolean palindrome(String word, int i, int j){
        if(i == j){
            return true;
        }
        if(word.charAt(i) != word.charAt(j)){
            return false;
        }
        return palindrome(word, i + 1, j - 1);
    }

    public static String decimalToBinary(int decimal){
        return decimalToBinary(decimal, "");
    }
    private static String decimalToBinary(int decimal, String binary){
        if(decimal == 0){
            return binary;
        }
        int quotient = decimal/2;
        int reminder = decimal%2;
        binary.concat(Integer.toString(reminder));
        return decimalToBinary(quotient, binary);
    }
}