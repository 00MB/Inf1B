package animals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void idkTest()
    {
        Gazelle gazelle = new Gazelle();
        assertEquals(true, gazelle.isCompatibleWith(new Zebra()));
        assertEquals(false, gazelle.isCompatibleWith(new Seal()));
    }

    private static int add(int x, int y) {
        return x + y;
    };
}
