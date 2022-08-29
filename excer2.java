import java.util.*;
public class excer2 {
    public static void main(String[] args){
        System.out.println("enter no");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i); 
            }
        }
    }
}
