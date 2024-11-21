package anudip;
public class Pyramid {
    public static void main(String[] args) {
        int i, j, k, n;
        n = 5;
        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print the numbers
            for (k = 1; k <= i; k++) {
                System.out.print(" " + i);
            }
            // Move to the next line
            System.out.println("");
        }
    }
}



