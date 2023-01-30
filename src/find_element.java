import javax.swing.*;
import java.util.Scanner;

public class find_element {

    static void find_index(int[][] arr,int n,int m,int x)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                if (arr[i][j]==x) {
                    System.out.println( "Row=" +i + " " +"Column=" +j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m,x;

        System.out.println("Enter the row of the matrix");
        n=sc.nextInt();
        System.out.println("Enter the column of the matrix");
        m=sc.nextInt();
        System.out.println("Enter the element to find");
        x=sc.nextInt();

        int[][] arr=new int[n][m];

        System.out.println("Enter the element of the array");

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        find_index(arr,n,m,x);
    }
}
