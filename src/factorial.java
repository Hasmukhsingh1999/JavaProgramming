import java.util.*;
public class factorial {
    public static int fact(int num){
        int f = 1;
        for(int i = 1 ; i<=num ; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = fact(num);
        System.out.println(n);
    }
}
