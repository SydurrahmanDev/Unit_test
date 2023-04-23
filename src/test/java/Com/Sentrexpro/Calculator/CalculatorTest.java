package Com.Sentrexpro.Calculator;

import Com.sentexpro.Calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class CalculatorTest {
private Calculator obj;
@BeforeEach
public void setup(){
     obj=new Calculator();
        }

    @Test

    public void test1() {
      //  Calculator obj = new Calculator();
        // obj.goodafternoon();
        // Assertions.
        assertEquals("welcome to java class", obj.goodmorning());
    }

    @Test
    public void test2() {
       // Calculator obj = new Calculator();

        assertEquals("welcome to python class", obj.goodafternoon());
    }

    @Test
    public void test3() {
       // Calculator obj = new Calculator();

        assertEquals("welcome to javascript class", obj.goodnight());


    }


}
