import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<num;i++)
            sum+=sc.nextInt();
        System.out.println(sum);

    }
}