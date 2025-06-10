public class NumberPattern {
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 3; i++) {
            // Print leading spaces
            for (int s = 3 - i; s > 0; s--) {
                System.out.print("   ");
            }

            // Store numbers in a temporary array to allow reversal for the second row
            int len = 2 * i - 1;
            int[] arr = new int[len];

            for (int j = 0; j < len; j++) {
                arr[j] = count++;
            }

            // For 2nd row, reverse the array before printing
            if (i == 2) {
                for (int j = len - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
            } else {
                for (int j = 0; j < len; j++) {
                    System.out.print(arr[j] + " ");
                }
            }

            System.out.println();
        }
    }
}