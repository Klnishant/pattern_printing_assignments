import java.util.Scanner;

public class convert_array_to_matrix {

    static void construct_matrix(int[] arr,int[][] mtx,int n,int m)
    {
        int k=0;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                mtx[i][j]=arr[k];
                k++;
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(mtx[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        System.out.println("Enter the row and column of the matrix");
        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n * m];
        int[][] mtx = new int[n][m];

        System.out.println("Enter the element of the array");

        for (int i = 0; i < n*m; i++) {
            arr[i] = sc.nextInt();
        }
        construct_matrix(arr,mtx,n,m);
    }
}
