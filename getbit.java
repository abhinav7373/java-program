public class getbit {
    public static void main(String []args){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n)!=0){
            System.out.println("non zero no");
        }
        else{
            System.out.println("zero");
        }
    }
}