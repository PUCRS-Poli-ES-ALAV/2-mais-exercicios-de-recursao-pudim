import java.security.InvalidAlgorithmParameterException;

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
}