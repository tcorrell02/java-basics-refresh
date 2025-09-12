public class BasicSyntax {

    public void simpleSyntax() {

        //Print to terminal/console
        System.out.println("Hello World");

        //byte is 8 bits
        byte b = 127;

        //short is 16 bits
        short s = 32767;

        //int is 32 bits
        int i = 2147483647;

        //long is 64 bits, must mark with "L"
        long l = 9223372036854775807L;

        //float holds 32 bits (defaults to double), must mark with "f"
        float f = 3.4028235E38f;

        //double holds 64 bits
        double d = 1.7976931348623157E308;

        //true or false, (technically 0 response is false, non-zero is true)
        boolean bool = true;

        //stores a single character or ASCII values
        char c = 'c';

        //final means that the variable is unchangeable (read-only), best for universal reference
        final int MINUTES_PER_HOUR = 60;

        //Assign directly to using widening casting
        double newD = i;
        System.out.printf("Widening Casting from int to double: %f\n", newD);

        //Cast the type in front of the variable for narrowing casting
        int newI = (int) newD;
        System.out.printf("Narrowing Casting from double to int %d\n", newI);

        //Increment by 1
        ++i;

        //Decrement by 1
        --i;

        //Also can do op= to perform operation directly on the var in shorthand
        i+=1;
        i-=1;

        //Simple if statement
        if (true) {
            System.out.println("Basic If");
        }

        //If else statement
        if (false) {
            System.out.println("Basic If");
        } else {
            System.out.println("If Else");
        }

        //If Else If statement
        if (false) {
            System.out.println("Basic If");
        } else if (false) {
            System.out.println("If Else");
        } else {
            System.out.println("If Else If");
        }
        
        //While loop only runs if the statement is true, will not run if statement starts false
        while (i > 0) {
            i-=2000;
        }

        //Do While runs code 1 time before checking the statement
        do { 
            System.out.println(i);
        } while (i > 0);

        //Runs until condition false, more access to each loop info
        for (int loop = 0; loop < 5; loop++) {
            
        }

        int[] arr = {1,2,3,4,5};

        //Runs over each element in the array
        //Break ends the loop early, while continue skips the rest of the current loop
        for (int num : arr) {

            if (num == 4) {
                continue;
            } else if (num == 5) {
                break;
            }

            System.out.println(num);
            
        }

    }






























}