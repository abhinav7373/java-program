public class ones {
    public static void main(String []args){
        int no = 01110110;
        int  i =0;
        for(i = 0;i<=7;i++){
            if((no & i) == 1){
                System.out.print( "result below");
            }
        }
        System.out.println("ones are" + i + "times");
    }
}