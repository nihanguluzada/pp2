import java.util.Scanner;
class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}