import java.util.*;
public class condition3 {
    public static void main(String[] args){
        Scanner no = new Scanner(System.in);
        System.out.println("enter button no");
        int button = no.nextInt();
        switch(button){
            case 1:{
                System.out.println("hello");
                break;
            }
            case 2:{
                System.out.println("namaste");
                break;
            }
            case 3:{
                System.out.println("bye");
                break;
            }
            default:{
                System.out.println("invalid");
            }
        }
    }
}
