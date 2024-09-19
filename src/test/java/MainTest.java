import org.example.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MainTest {
    Main.Calculator calculator = new Main.Calculator();

    private String currentTestName;
    private boolean testFailed;

    @AfterEach
    public void logAfterTest() {
        if (testFailed) {
            System.out.println("Executing Test " + currentTestName + " with result: FAILURE");
        } else {
            System.out.println("Executing Test " + currentTestName + " with result: SUCCESS");
        }
    }
    @Test
    public void testAdd() {
        currentTestName = "testAdd";
        try {
            Thread.sleep(5000);
            assertEquals(4, calculator.add(2, 2));
        } catch (AssertionError e) {
            testFailed = true;
            throw e; // rethrow to ensure test fails properly
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testSubtract() {
        currentTestName = "testSubtract";
        try {
            Thread.sleep(5000);
            assertEquals(2, calculator.subtract(5, 3));
        } catch (AssertionError e) {
            testFailed = true;
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testMultiply() {
        currentTestName = "testMultiply";
        try {
            Thread.sleep(5000);
            assertEquals(15, calculator.multiply(5, 3));
        } catch (AssertionError e) {
            testFailed = true;
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDivide() {
        currentTestName = "testDivide";
        try {
            Thread.sleep(5000);
            assertEquals(2, calculator.divide(6, 3));
        } catch (AssertionError e) {
            testFailed = true;
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDivideByZero() {
        currentTestName = "testDivideByZero";
        try {
            Thread.sleep(5000);
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
        } catch (AssertionError e) {
            testFailed = true;
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testRandomBehaviour(){
        currentTestName = "testRandomBehaviour";
        try {
            Thread.sleep(5000);
            int random = (int)(Math.random()*3+1);
            assertEquals(3,random);
        }
        catch (AssertionError e) {
            testFailed = true;
            throw e;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
