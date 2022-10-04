import java.util.LinkedList;
import java.util.Scanner;

public class SLSEISG {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of nodes: ");
        int nodes = scan.nextInt();
        for (int i = 0; i < nodes; i++) {
            System.out.print("Data for node "+(i+1)+": ");
            ll.add(scan.nextInt());
        }
        System.out.println("\nData entered in the list: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data = "+ll.get(i));
        }
        System.out.print("Input the element to be searched: ");
        int elementSearch = scan.nextInt();
        int ans=-1;
        for (int i = 0; i < ll.size(); i++) {
            if(elementSearch==ll.get(i)){
                ans=i+1;
            }
        }
        if (ans != -1) {
            System.out.println("Element found at node "+ans);
        }   else{
            System.out.println("Element not found.");
        }
    }
}
