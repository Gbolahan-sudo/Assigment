package dsa;

import org.junit.jupiter.api.Test;

public class MyStack {

    public int Counter;
    private String[] eliments;

    public MyStack (int sizeOStack){

    }
    public  boolean isEmpty(){
        return Counter == 0;
    }
    public  void push(String elements){
        Counter ++;
    }
    public void pop(){
        Counter --;
    }
}
