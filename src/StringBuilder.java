import java.util.*;
public class StringBuilder {
    public static void main(String[] args){
    java.lang.StringBuilder str = new java.lang.StringBuilder("Hassukh");
    str.setCharAt(3,'m');
    System.out.println(str);
    str.insert(7,"Singh");
    System.out.println(str);
    str.delete(7,str.length());
    System.out.println(str);
    }
}
