import java.util.logging.Logger;

/**
 * Class that contains the method to find the nth term of the Fibonacci Sequence.
 * Only contains 1 method at this time.
 * Contains no constructors, as attributes are nonexistent.
 */
public class FiboFinder {
    private static final Logger loggy = Logger.getLogger(FiboFinder.class.getName());
    /**
     * Method that returns the nth term of the Fibonacci Sequence.
     * @param n The integer in the sequence that we wish to return a result for.
     * @return Returns the term that corresponds with the nth term of the Fibonacci Sequence.
     */
    public int FindTerm(int n) {
        loggy.info("FindTerm() started");
        if (n < 0) {
            loggy.warning("Invalid integer given");
            System.out.println("Error: Integer must be greater than or equal to zero");
            return -1;
        }
        else if (n == 0) {
            loggy.info("Integer 0 given. Returning 0...");
            return 0;
        }
        else if (n == 1 || n == 2) {
            loggy.info("Integer 1 or 2 given. Returning 1...");
            return 1;
        }
        else {
            loggy.info("Entering recursion...");
            return FindTerm(n - 1) + FindTerm(n - 2);
        }
    }
}
