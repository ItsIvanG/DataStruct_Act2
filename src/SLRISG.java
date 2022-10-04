import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
public class SLRISG {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of nodes: ");
        int nodes = scan.nextInt();
        for (int i = 0 ; i < nodes; i++) {
            System.out.print("Data for node "+(i+1)+": ");
            ll.add(scan.nextInt());
        }
        System.out.println("\nData entered in the list: ");
        for (int i = 0; i < nodes; i++) {
            System.out.println("Data = "+ll.get(i));
        }
        Collections.reverse(ll);
        System.out.println("\nThe list in reverse are: ");
        for (int i = 0; i < nodes; i++) {
            System.out.println("Data = "+ll.get(i));
        }
    }

}
