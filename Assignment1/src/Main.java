public class Main {
    public static void main(String[] args) {
        FiboFinder fibo = new FiboFinder();

        int n = 10;

        System.out.println("The " + n + "th term of the Fibonacci sequence is: " +
                fibo.FindTerm(n) + ".");
    }
}