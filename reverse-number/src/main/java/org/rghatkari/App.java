package org.rghatkari;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("Reverse number: " + reverseNumber(123));
    }

    private static int reverseNumber(int n) {
        int result = 0;
        while (n > 0) {
            result *= 10;
            result += n % 10;
            n = n / 10;
        }
        return result;
    }
}
