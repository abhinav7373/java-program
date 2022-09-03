import java.util.*;

public class array {
    public static void main(String[] args){
        int[] arr = { 12, 41, 26, 22, 53, 84 };
        System.out.println("given no are");
        for (int i = 0; i <= 6; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("we have to search no ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for (int i = 0; i <= 6; i++) {
            if (no == arr[i]) {
                System.out.println("no at index " + i);
            }
        }
    }
}