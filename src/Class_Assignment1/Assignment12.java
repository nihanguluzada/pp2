import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        double sum=0;
        int k=0;
        double product=1;
        double average=0;
        int count=0;
        if (a<0){
            a=a*(-1);
        }
        while(a>0){
            k=a%10;
            sum=sum+k;
            product=product*k;
            a=a/10;
            count=count+1;
        }
        average=sum/count;
        System.out.println("Sum="+sum);
        System.out.println("product="+product);
        System.out.println("average="+average);
    }
}