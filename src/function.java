import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        //Syntax returnType functionName(type arg1,type arg2..){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName("My name is :" + name);

    }
}
