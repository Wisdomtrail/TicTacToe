public class Example {
    public static void main(String[] args) {
        int count = 1;
        int increase = 5;
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 0; j < increase; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
            increase--;
        }
    }
}
