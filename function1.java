import java.util.*;
public class function1 {
    public static int printSum(int x,int y){
        return(x+y);
    }
    public static void main(String[] args){
        System.out.println("enter two no");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printSum( a,b));
    }
}
