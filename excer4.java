import java.util.*;
public class excer4 {
    public static Double calculateCircum(Double x){
        return(2*3.14*x);
    }
    public static void main(String[] args){
        System.out.println("enter a no");
        Scanner sc = new Scanner(System.in);
            Double r = sc.nextDouble();
            System.out.println(calculateCircum(r));
    }
}