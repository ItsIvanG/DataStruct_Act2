import java.util.LinkedList;
import java.util.Scanner;

public class SLDMISG {
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
        System.out.print("\nInput the position of node to delete: ");
        int insertIndex = scan.nextInt();
        ll.remove(insertIndex-1);
        System.out.println("Deletion completed successfully.");
        System.out.println("\nThe new list are: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data = "+ll.get(i));
        }
    }
}
