import java.util.Scanner;
class Assignment9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum=0.0;
        long count=0L;
        while(scanner.hasNext()){
            double number=scanner.nextDouble();
            sum=sum+number;
            count++;
        }
        System.out.println(sum/count);
    }
}
