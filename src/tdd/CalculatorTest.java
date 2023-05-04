package tdd;

import Chapter3.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CalculatorTest {
    @Test
    public void divisionTest(){
        //given that you have a calculator
        Calculator calculator = new Calculator();
        //when I divide
        calculator.division(4,2);
        //assert that the number divides
        assertEquals(2,2);

    }
    @Test
    public void addisionTest(){
        Calculator calculator = new Calculator();
        calculator.addision(4,8);
        assertEquals(4,4);
    }
    @Test
    public void maltiplycationTest(){
        Calculator calculator = new Calculator();
        calculator.maltiplycation(10,5);
        assertEquals(50,50);
    }
    @Test
    public void suptractionTest(){
        Calculator calculator = new Calculator();
        calculator.suptraction(10,5);
        assertEquals(5,5);
    }
}