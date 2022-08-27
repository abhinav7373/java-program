import java.util.*;
public class condition2 {
 public static void main(String[] args){
    Scanner no = new Scanner(System.in);
    System.out.println("enter two no");
    int a = no.nextInt();
    int b = no.nextInt();
    if(a==b){
        System.out.println("a equal to b");
    }
    else if(a<b){
        System.out.println("a is less than b");
    }
    else{
        System.out.println("a is greater than b");
    }

 }   
} 