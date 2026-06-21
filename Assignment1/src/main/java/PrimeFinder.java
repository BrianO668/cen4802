/**Class that contains a method to determine if a number is prime or not
 */
public class PrimeFinder {
    /**
     * Method that returns true or false depending on if the parameter is prime.
     * @param n The integer we wish to check as prime or not.
     * @return Returns true or false depending on result.
     */
    public boolean IsPrime(int n)
    {
        if (n < 2) {return false;}

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {return false;}
        }

        return true;
    }
}
