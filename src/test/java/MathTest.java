import static org.junit.Assert.*;
public class MathTest {

    @org.junit.Test
    public void add() {
        int result = PracticeJUnitTesting.add(5,5);
        int correct = 10;

        assertEquals(10,result);
    }


    @org.junit.Test
    public void subtract() {
        int result = PracticeJUnitTesting.subtract(20,10);
        int correct = 10;
        assertEquals(10,result);
    }




}