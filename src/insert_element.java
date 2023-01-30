import java.util.ArrayList;
import java.util.Scanner;

public class insert_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,x;

        System.out.println("Enter the size of the arraylist");
        n=sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Enter the element of the arraylist");

        for (int i=0; i<n; i++)
        {
            int ele =sc.nextInt();
            arrayList.add(ele);
        }
        System.out.println("Enter the element to insert");
        x=sc.nextInt();

        arrayList.add(0,x);

        System.out.println(arrayList);
    }
}
