import java.util.*;
public class arr2 {
    public static void main(String args[]){
        System.out.println("enter no of rows and colms");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        int userArr[][] = new int[rows][colms];
        System.out.println("enter no");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                int val = sc.nextInt();
                userArr[i][j] = val;
            }
        }
        System.out.println("we have to find x");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                if(userArr[i][j]==x){
                    System.out.println("x find at index (" + i +" "+j+ ")");
                }
            }
    }
}
}