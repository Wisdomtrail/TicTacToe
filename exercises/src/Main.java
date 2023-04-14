import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] arrays = {6,7,8,9,0};
        int[] gee = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            gee[i] = array[i];
            array[i] = arrays[i];
            arrays[i] = gee[i];
        }
        System.out.print(Arrays.toString(array));
        System.out.print(Arrays.toString(arrays));
    }
}