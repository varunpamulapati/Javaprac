// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      char vowels[] = {'e','u','a','o','i'};
        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.fill(vowels, startingIndex, endingIndex,'x');
        System.out.println(Arrays.toString(vowels));


        ArrayList<Integer> numbers = new ArrayList<Integer>( );

        numbers. add(1);
        numbers. add (2);
        numbers. add(3);
        numbers. add(4);
        numbers. add(5);
        numbers. remove(2);
        System.out.println(numbers);
        }
    }

