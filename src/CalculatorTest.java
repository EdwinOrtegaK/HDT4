import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator c ;
        c = Calculator.getInstance();
        assertEquals(5,c.suma(2, 3));

    }
    @Test
    public void test2(){
        Calculator c ;
        c = Calculator.getInstance();
        assertEquals(1,c.resta(3, 2));
    }
    @Test
    public void test3(){
        Calculator c ;
        c = Calculator.getInstance();
        assertEquals(6,c.multiplicacion(3, 2));
    }
    @Test
    public void test4(){
        Calculator c ;
        c = Calculator.getInstance();
        assertEquals(3,c.division(6, 2));
    }
}