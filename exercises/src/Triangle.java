public class Triangle {
    public static void main(String[] args) {
        int count =1;
        int blank = 5;
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 0; j < blank;  j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(count);
            }
            System.out.println();
            count++;
            blank--;
        }
    }
}
