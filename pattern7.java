/*  print patter 
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
*/
public class pattern7 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
           for(int j=1;j<=9;j++){ 
            if(j%2==0){
                
            }
               if(j>=6-i&&j<=10-i ){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
        }
}
