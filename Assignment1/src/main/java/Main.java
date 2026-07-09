/**
 * The Main method that is used to find the Fibonacci Sequence term.
 * This method instantiates a FiboFinder class, hard assigns an int to n,
 * and then runs the FiboFinder's FindTerm method to returns the integer that corresponds
 * with the nth term of the Fibonacci Sequence.
 */
import java.util.logging.Logger;

public class Main {
    private static final Logger loggy = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        loggy.info("Application starting...");

        loggy.info("FiboFinder instantiating...");
        FiboFinder fibo = new FiboFinder();
        loggy.info("PrimeFinder instantiating...");
        PrimeFinder pf = new PrimeFinder();

        loggy.info("Assigning value to int n...");
        int n = 34;

        loggy.info("Printing results to console...");
        System.out.println("THIS PROGRAM HAS, ONCE AGAIN, BEEN MODIFIED SLIGHTLY\n" + "The " + n + "th term of the Fibonacci sequence is: " +
                fibo.FindTerm(n) + ".\nIs this number a prime number?: " + pf.IsPrime(fibo.FindTerm(n)));
    }
}