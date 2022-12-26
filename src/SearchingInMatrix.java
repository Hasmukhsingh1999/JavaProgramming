import java.util.*;
public class SearchingInMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[row][cols];

        for(int i = 0 ; i<row ;i++){
            for(int j=0 ; j<cols ;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0 ;i<row;i++){
            for(int j= 0; i<cols;j++){
                if(arr[i][j] == x){
                    System.out.println("x found at locations (" + i + ", " + " )");
                }

            }

        }
    }
}
