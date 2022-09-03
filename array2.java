import java.util.*;
public class array2 { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int marks[] = new int[5];
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i = 0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}