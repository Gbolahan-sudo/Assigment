package LordGboli;

public class Enhanced {
    public static void main(String[] args) {
        int [] numbers = { 1, 3, 6, 9};
        add(numbers);
        double [] figures = {2, 4, 5};
        add(figures);
    }
    public static int add(int...numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
        public static double add ( double...figures){
            double total = 0;
            for (double num : figures) {
                total += num;
            }
            return total;
        }
    }
