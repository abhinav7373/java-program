import java.util.*;
public class twodarr {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and coloumns");
        int rows= sc.nextInt();
        int coloumns = sc.nextInt();
        int arr[][]= new int[rows][coloumns];
        System.out.println("enter value");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumns;j++){
                int val =sc.nextInt();
                arr[i][j]= val;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumns;j++){
              System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}