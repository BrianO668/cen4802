import com.brian.assignment1.PrimeFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {
    PrimeFinder finder = new PrimeFinder();

    @Test
    void isPrime() {
        assertEquals(true, finder.IsPrime(6311));
    }
}