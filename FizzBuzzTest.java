public class FizzBuzzTest {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) { // First check if divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Then check if divisible by just 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Then check if divisible by just 5
                System.out.println("Buzz");
            } else
                System.out.println(i); // Otherwise just print the integer
        }
    }
}
