import java.util.Scanner;

public class VineyardCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the row: ");
        int r = sc.nextInt();
        
        System.out.print("Enter the amount of space used by post-assembly: ");
        int e = sc.nextInt();
        
        System.out.print("Enter the space between vines: ");
        int s = sc.nextInt();

        int v = calculateVines(r, e, s);
        
        if (v > 0) {
            System.out.println("Number of grapevines that will fit in the row: " + v);
        } else {
            System.out.println("Not enough space for any grapevines.");
        }

        sc.close(); 
    }

    // Logic separated for testing
    public static int calculateVines(int rowLength, int postSpace, int vineSpace) {
        int usableSpace = rowLength - 2 * postSpace;
        if (usableSpace <= 0) return 0;
        return usableSpace / vineSpace;
    }
}
