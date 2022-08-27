/*pirnt butterfly pattern
*      *
**    **
***  ***
********

                                                */
public class pattern8 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
           for(int j=1;j<=8;j++){
               if(j<=i ||  j>=9-i){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
        }
       
}
}