public class FiboFinder {
    public int FindTerm(int n) {
        if (n < 0) {
            System.out.println("Error: Integer must be greater than or equal to zero");
            return -1;
        }
        else if (n == 0 || n == 1) {
            return n;
        }
        else {
            return FindTerm(n - 1) + FindTerm(n - 2);
        }
    }
}
