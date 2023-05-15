public class TryAndCash {
    public static void main(String[] args) {
        try{
            int[] arr = {2, 5, 6, 7};
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
