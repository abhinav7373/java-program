import java.util.*;
public class excer1 {
      public static void main(String[] args){
        System.out.println("enter  three no");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int sum = a+b+c;
        int average= sum/3;
        System.out.println(average);
      }
}
