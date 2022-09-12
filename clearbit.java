public class clearbit {
    public static void main(String []args){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int newNo = ~(bitMask);
        int no = n & newNo;
        System.out.println(no);
    }
}