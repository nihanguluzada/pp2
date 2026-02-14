import java.util.Scanner;
class Assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextFloat()) {
            System.out.println("Error: No input");
            return;
        }
        float min = sc.nextFloat();
        float max = min;
        while (sc.hasNextFloat()) {
            float n = sc.nextFloat();
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}