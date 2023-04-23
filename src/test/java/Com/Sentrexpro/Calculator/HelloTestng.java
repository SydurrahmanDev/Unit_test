package Com.Sentrexpro.Calculator;

import Com.sentexpro.Calculator.Hello;
import org.junit.jupiter.api.Assertions;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HelloTestng {



    @Test
    public void test1(){

        Hello hello=new Hello();
        hello.addition(2,3);
        assertEquals(hello.addition(2,4),6);



    }










}
