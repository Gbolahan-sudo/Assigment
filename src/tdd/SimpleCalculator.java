package tdd;

public class SimpleCalculator {
    private int addition;
    private int subtraction;
    private int calculator;
    private int calculatindex;
    private boolean waterOrFire;

    public SimpleCalculator() {
    }

    public void addition(int a,int b) {
        addition = a + b;
    }

    public int getAddition() {
        return addition;
    }

    public void subtraction(int x, int y) {
        subtraction = x - y;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void getWaterOrFire(boolean shout) {
        waterOrFire = shout;
    }
    public boolean getWaterOrFire(){
        return waterOrFire;
    }

//    public void calculatorIndex() {
//        int [] arr = new int[1,5,17,20,10,5];
//        for (int index = 0; index < arr.length; index++) {
//            arr[0] = index;
//        }
//        System.out.println();
    }
