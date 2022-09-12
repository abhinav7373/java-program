public class revstr {
    public static void main(String []args){
        StringBuilder sc = new String("akash");
        for(int i=0;i<sb.length()/2;i++){
             int front = i;
             int back = sc.lenght()-1-i;
             char frontChar = sc.charAt(front);
             char backChar = sc.charAt(back);
             sc.setCharAt(front , backChar);
             sc.setCharAt(back , frontChar);
        }
        System.out.println(sc);
    }
}