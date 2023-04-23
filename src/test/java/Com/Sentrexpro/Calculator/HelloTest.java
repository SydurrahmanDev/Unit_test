package Com.Sentrexpro.Calculator;

import Com.sentexpro.Calculator.Hello;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {

private Hello obj;
@BeforeEach
public void setup(){
     obj=new Hello();

}



@Test
    public void test1(){

  //  Hello obj=new Hello();
   // obj.addition(6,2);
    assertEquals(8,obj.addition(6,2));

}
@Test
    public void test2(){
  //  Hello obj=new Hello();

    assertEquals(5,obj.division(10,2));
}
@Test
public void test3(){
  //  Hello obj=new Hello();

    assertEquals(10,obj.subtraction(20,10));

}





}
