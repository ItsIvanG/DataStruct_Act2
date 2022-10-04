import java.util.LinkedList;
import java.util.Scanner;

public class SLDFISG {
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
        System.out.print("\nData of node 1 which is being deleted is: "+ll.getFirst());
        ll.removeFirst();

        System.out.println("\nData, after deletion of first node: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data = "+ll.get(i));
        }
    }
}
