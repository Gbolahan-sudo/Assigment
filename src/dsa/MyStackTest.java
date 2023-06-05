package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    @Test
    public void stackExistTest(){
        MyStack stack = new MyStack(5);
    }
    @Test public void  newStackIsEmptyTest(){
        MyStack stack = new MyStack(5);
        assertTrue(stack.isEmpty());
    }
    @Test public void  pushx_stackSholdNotBeEmpty(){
        MyStack stack = new MyStack(5);
        stack.push("G_String");
        assertFalse(stack.isEmpty());
    }
    @Test public  void pushx_stackShouldNotBeEmpty(){
        MyStack stack = new MyStack(5);
        stack.push("E-String");
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test public  void pushx_stackShouldNutBeEmpty(){
        MyStack stack = new MyStack(5);
        stack.push("G-String");
        stack.push("E-String");
        stack.pop();
        assertFalse(stack.isEmpty());
    }

}
