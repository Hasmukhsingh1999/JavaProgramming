import java.util.*;

public class ConditionalStatement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 18){
            System.out.println("You're good to go!");
        }
        else{
            System.out.println("You're not that bad!");
        }
    }
}
