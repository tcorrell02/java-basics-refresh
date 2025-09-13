import java.util.Arrays;

public class ArrayMethods {
    
    private int[] numbers = {42, 7, 13, 7, 99, 23, 56, 13, 4, 77};
    private int[] newNumbers = {42, 7, 10, 7};
    private String[] words = {"apple", "banana", "pear", "banana", "kiwi", "grape", "pear"};

    public void arrayMethods() {

        //compare(): 0 if they are the same
        
        //equals(): checks if two arrays are equal
        System.out.println("numbers is equal to itself: " + Arrays.equals(numbers, numbers));

        //fill(): replaces subsequent values in an array
        System.out.println(Arrays.toString(words));
        Arrays.fill(words, 1, 3, "banana");
        System.out.println(Arrays.toString(words));

        //mismatch(): returns the index where the first difference occurs between two arrays
        System.out.println("The first difference occurs at index: " + Arrays.mismatch(numbers, newNumbers));

        //sort(): letters/strings alphabetically, numbers acending
        Arrays.sort(numbers);
        Arrays.sort(words);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));

        //length: property of arrays that returns the number of indexes
        System.out.println("Length of numbers array: " + numbers.length);


    }

}
