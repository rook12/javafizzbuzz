/**
 * Created by Steve on 07/01/2017.
 *
 * Implement fizz buzz
 */
public class FizzBuzz {

    private static final int maxCount = 100;

    public static void main(String[] args ) {
        System.out.println("test");

        int counter = 0;

        while(counter < maxCount) {
            counter += 1;

            System.out.println(Integer.toString(counter));

            if (counter % 3 == 0 && counter %5 == 0 ) {
                System.out.println("fizzbuzz");
            }
            else if (counter % 3 == 0) {
                System.out.println("fizz");
            }
            else if(counter % 5 == 0) {
                System.out.println("buzz");
            }
        }

    }
}
