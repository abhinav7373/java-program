import java.util.*;
public class function {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){ 
        System.out.println("enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);
    }
}