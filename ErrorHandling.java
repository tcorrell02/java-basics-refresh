public class ErrorHandling {
    

    public void errorHandling() {

        //try: attempts to run the code in the block assuming it works
        //catch: run on error in the try, usually used to address errors
        //finally: runs regardless of the try-catch block

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Can't access values outside of array");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        /*throw: used to display a preset Java error exception with extra text
        Some preset errors:

        Arithmetic Error: Occurs when a numeric calculation goes wrong

        ArrayIndexOutofBoundsException:	Occurs when trying to access an index number that does not exist in an array

        ClassNotFoundException: Occurs when trying to access a class that does not exist

        FileNotFoundException: Occurs when a file cannot be accessed

        InputMismatchException: Occurs when entering wrong input (e.g. text in a numerical input)

        IOException: Occurs when an input or output operation fails

        NullPointerException: Occurs when trying to access an object referece that is null

        NumberFormatException:	Occurs when it is not possible to convert a specified string to a numeric type

        StringIndexOutOfBoundsException: Occurs when trying to access a character in a String that does not exist
        
        */
    }

}
