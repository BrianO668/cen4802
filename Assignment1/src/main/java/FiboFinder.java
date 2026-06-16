/**
 * Class that contains the method to find the nth term of the Fibonacci Sequence.
 * Only contains 1 method at this time.
 * Contains no constructors, as attributes are nonexistent.
 */
public class FiboFinder {
    /**
     * Method that returns the nth term of the Fibonacci Sequence.
     * @param n The integer in the sequence that we wish to return a result for.
     * @return Returns the term that corresponds with the nth term of the Fibonacci Sequence.
     */
    public int FindTerm(int n) {
        if (n < 0) {
            System.out.println("Error: Integer must be greater than or equal to zero");
            return -1;
        }
        else if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return FindTerm(n - 1) + FindTerm(n - 2);
        }
    }
}
