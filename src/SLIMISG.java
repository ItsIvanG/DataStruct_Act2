import java.util.Scanner;
import java.util.LinkedList;
public class SLIMISG {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of nodes (3 or more): ");
        int nodes = scan.nextInt();
        for (int i = 0; i < nodes; i++) {
            System.out.print("Data for node "+(i+1)+": ");
            ll.add(scan.nextInt());
        }
        System.out.println("\nData entered in the list: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data = "+ll.get(i));
        }
        System.out.print("\nData to insert in the middle of the list: ");
        int insertData = scan.nextInt();
        System.out.print("\nInput the position to insert new node : ");
        int insertIndex = scan.nextInt();
        ll.add(insertIndex-1,insertData);
        System.out.println("Insertion completed successfully.");
        System.out.println("\nThe new list are: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data = "+ll.get(i));
        }
    }
}
