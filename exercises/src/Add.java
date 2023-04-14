import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5};
        int[] array2 = {9,7,5,5};
        System.out.println(Arrays.toString(addArray(array1, array2)));
    }

    public static int[] addArray(int[] array1, int[] array2){
      int length = Math.max(array1.length, array2.length);
       int[] answer = new int[length];
       int count =  length-1;
        for (; count>= 0 ; count--) {
            if (count == 0){
                answer[count] = (array1[count] + array2[count]);
            }
            else
            if ( array1[count] + array2[count] > 9){
                answer[count] = (array1[count] + array2[count]) %10;
                if (array1.length >= array2.length){
                    array1[count-1] +=1;
                }
                else array2[count-1]+=1;
            }
            else
                answer[count] = array1[count] + array2[count];

        }
        return answer;
    }
}