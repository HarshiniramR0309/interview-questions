public class FizzBuss {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+" ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
           else {
               System.out.println(i);
           }
        }
    }
}
