package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();
    @Test
    public void TestNumberAddition(){
        calculator.addition(6, 8);
        assertEquals(14, calculator.getAddition());
    }
    @Test
    public void TestSubtraction(){
        calculator.subtraction(4, 2);
        assertEquals(2, calculator.getSubtraction());
    }
    @Test
    public void  TestIfWaterOrFireCanSpoilCalculator(){
        calculator.getWaterOrFire(true);
        assertEquals(true,calculator.getWaterOrFire());
    }
//    @Test
//    public void TestIfCalculatorCanAddArraysIndex() {
//        calculator.calculatorIndex();
//        assertEquals(,calculator.calculatorIndex());
    }

