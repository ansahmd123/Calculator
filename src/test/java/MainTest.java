import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    Main.Calculator calculator = new Main.Calculator();

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testAddition(){
        assertEquals(12,calculator.add(8,4));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(6, 0);
    }

    @Test
    public void testRandomBehaviour(){
        //choose a random number between 1,2,3
        int random = (int)(Math.random()*3+1);
        System.out.println("Random number: "+random);
        assertEquals(3,random);
    }
}
