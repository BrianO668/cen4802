/**
 * The Main method that is used to find the Fibonacci Sequence term.
 * This method instantiates a FiboFinder class, hard assigns an int to n,
 * and then runs the FiboFinder's FindTerm method to returns the integer that corresponds
 * with the nth term of the Fibonacci Sequence.
 */
public class Main {
    public static void main(String[] args) {
        FiboFinder fibo = new FiboFinder();
        PrimeFinder pf = new PrimeFinder();

        int n = 34;

        System.out.println("THIS PROGRAM HAS, ONCE AGAIN, BEEN MODIFIED SLIGHTLY\n" + "The " + n + "th term of the Fibonacci sequence is: " +
                fibo.FindTerm(n) + ".\nIs this number a prime number?: " + pf.IsPrime(fibo.FindTerm(n)));
    }
}