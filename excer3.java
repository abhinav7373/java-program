import java.util.*;
public class excer3 {
    public static void greaterNo(int a,int b){
           if(a>b){
            System.out.println("a is greater than b");
           }
           else{
            System.out.println(" a is less than b");
           }
           return;
        }
    public static void main(String[] args){
        System.out.println("enter two no");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y = sc.nextInt();
        greaterNo(x,y);
    }
}
