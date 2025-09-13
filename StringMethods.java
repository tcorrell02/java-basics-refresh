import java.util.Arrays;

public class StringMethods {
    
    private String testString = "  Hello, Java World! 123 Programming is FUN.  ";
    private String secondTestString = "  Hello, Java World! 123 Programming is UNFUN.  ";

    public void stringMethods() {
        
        System.out.println("testString: " + testString);

        //charAt(): returns the character at the specified index, starts at 0, does not work with negatives
        System.out.println("Character at testString[3]: " + testString.charAt(3));

        //compareTo(): returns - if first string bigger than second, 0 if both same size, + if first string less than second
        //compareToIgnoreCase(): does the same but ignores case differences
        System.out.println("secondTestString: " + secondTestString);
        System.out.println("Is secondTestString longer than testString? " + ((secondTestString.compareTo(testString) > 0) ? "Yes" : "No"));
    
        //concat(): concatenates a second string to the first
        String newString = testString.concat(secondTestString);
        System.out.println(newString);

        //contains(): checks whether string contains a sequence of characters
        System.out.println("testString contains FUN? " + testString.contains("FUN"));

        //endsWith(): checks whether the string ends with a substring
        System.out.println("testString ends with FUN.: " + testString.trim().endsWith("FUN."));

        //equals(): checks whether the strings are the exact same
        //equalsIgnoreCase(): checks whether the strings are the same without taking case into account
        System.out.println("testString is equal to secondTestString?: " + testString.equals(secondTestString));

        //format(): allows injecting values into a predefined string schema
        String format = "testString is %d characters long. Here's it concatenated with secondTestString: %s";
        System.out.println(String.format(format, testString.length(), newString));

        //getBytes(): turns a string into a Byte array
        byte[] testBytes = testString.getBytes();
        System.out.println("The number of bytes of testString[5] (l): " + testBytes[5]);

        //indexOf(): returns the index of the first occurrence of a string of characters
        System.out.println("The word Java appears at index: " + testString.indexOf("Java"));

        //isEmpty(): checks whether a string has a length of zero
        System.out.println("testString is empty: " + testString.isEmpty());

        //join(): joins one or more strings with a specified separator
        System.out.println(String.join(" != ", testString.trim(), secondTestString.trim()));

        //lastIndexOf(): returns the index of the last occurrence of a string of characters
        System.out.println("Last index of l: " + testString.lastIndexOf("l"));

        //length(): returns the length of the string
        System.out.println("Length of testString: " + testString.length());

        //matches(): checks whether a string matches a regular expression
        String regex = "  Hello, Java World! 123 Programming is FUN.  ";
        System.out.println("testString is equal to the regex: " + testString.matches(regex));

        //replace(): searches string and replaces the specified value
        //replaceFirst(): searches string and replaces the first specified value
        System.out.println("testString without l: " + testString.replace('l', ' '));

        //split(): returns a string array memory reference split based on defined regex
        String newRegex = "\\s";
        System.out.println(Arrays.toString(testString.split(newRegex)));

        //startsWith(): checks if a string starts with the specified substring
        System.out.println("testString starts with Hello after trim: " + testString.trim().startsWith("Hello"));

        //substring(): returns a new string thats a specified substring, stops before final index specified
        System.out.println("The first word in testString is: " + testString.substring(2,7));

        //toCharArray(): converts string into a char array
        System.out.println("The char array index of 4 for testString is: " + testString.toCharArray()[4]);

        //toLowerCase(): converts all to lower case
        System.out.println(testString.toLowerCase());

        //toString(): returns the string version of the specified object

        //toUpperCase(): converts all to upper case
        System.out.println(testString.toUpperCase());

        //trim(): removes whitespace from both ends of a string
        System.out.println(testString.trim());

    }
}