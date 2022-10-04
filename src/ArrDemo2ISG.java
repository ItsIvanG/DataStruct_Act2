public class ArrDemo2ISG {
    public static void main(String[] args) {
        // create an array
        int[] age = {12, 7, 25, 9, 23};
        // access each array elements
        System.out.println("Accessing Elements of Array:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Element " + (i+1)+": "+age[i]);
        }
    }
}
