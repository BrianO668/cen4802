import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboFinderTest {
    FiboFinder fibo = new FiboFinder();

    @Test
    void findTerm() {
        assertAll(
                () -> assertEquals(0, fibo.FindTerm(0)),
                () -> assertEquals(1, fibo.FindTerm(2)),
                () -> assertEquals(2, fibo.FindTerm(3)),
                () -> assertEquals(3, fibo.FindTerm(4)),
                () -> assertEquals(5, fibo.FindTerm(5)),
                () -> assertEquals(8, fibo.FindTerm(6)),
                () -> assertEquals(13, fibo.FindTerm(7)),
                () -> assertEquals(21, fibo.FindTerm(8)),
                () -> assertEquals(34, fibo.FindTerm(9)),
                () -> assertEquals(55, fibo.FindTerm(10)),
                () -> assertEquals(5702887, fibo.FindTerm(34)));
    }
}