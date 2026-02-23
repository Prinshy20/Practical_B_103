public class FullPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            // Print leading spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars with space
            for (int star = 0; star < i; star++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
