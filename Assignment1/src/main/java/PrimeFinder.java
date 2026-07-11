import java.util.logging.Logger;

/**Class that contains a method to determine if a number is prime or not
 */
public class PrimeFinder {
    private static final Logger loggy = Logger.getLogger(PrimeFinder.class.getName());
    /**
     * Method that returns true or false depending on if the parameter is prime.
     * @param n The integer we wish to check as prime or not.
     * @return Returns true or false depending on result.
     */
    public boolean IsPrime(int n)
    {
        loggy.info("IsPrime() initialized...");
        if (n < 2) {loggy.info("Integer given is less than 2");return false;}

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {loggy.info("Integer given is not prime");return false;}
        }

        loggy.info("Integer given is prime");
        return true;
    }
}
