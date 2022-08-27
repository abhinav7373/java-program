/*print solid rhombus
    ****
   ****
  ****
 ****
****
                                   */
public class pattern6 {
   
    } public static void main(String[] args){
     for(int i=1;i<=5;i++){
        for(int j=1;j<=8;j++){
            if(j>=6-i && j<=9-i){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }
}
