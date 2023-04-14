import java.util.Arrays;

public class ReverseArrayString {
    public static void main(String[] args) {
        String[] array = {"tayo", "chinelo"};

        String[] newArray = new String[array.length];
        int count = 0;
        for (int i = array.length-1; i >= 0; i--) {
            newArray[count] = array[i];
            count++;
        }
        System.out.print(Arrays.toString(newArray));
    }
}
