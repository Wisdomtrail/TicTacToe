import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,3};
        int target = 10;
        System.out.println(Arrays.toString(sum(array, target)));
    }

    public static int[] sum(int[] array, int target){
        int[] answer = new int[2];
        int count = 0;
        int r = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j]== target){
                    answer[count] = i;
                  r = j;
                }

            }

        }
       answer[1] = r;
        return answer;
    }
}
