public class ClassWork {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        add(numbers);
    }

    public static int add(int...numbers){
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        return total;
    }

}