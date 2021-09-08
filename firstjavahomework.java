package Firstjavahomework;


public class firstjavahomework {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Shannon";
        System.out.println(name);

        int myNum = 24;
        System.out.println(myNum);
//        int myNum;
//        myNum = 15;
//        System.out.println(myNum);
        String firstName = "Shannon ";
        String lastName = "Davis";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        System.out.println("Hello " + firstName);
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z); /* commas seperate different variables, but they have
        the same INT datatype */

        //Java Indetifiers
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        /* Primitive Data Types
        byte	1 byte	Stores whole numbers from -128 to 127
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	1 bit	Stores true or false values
        char	2 bytes	Stores a single character/letter or ASCII values
         */


        //Integer Types

        byte bit1 = 100;
        System.out.println(bit1);

        short shrt1 = 5000;
        System.out.println(shrt1);

        int wkwti = 23;
        System.out.println(wkwti);

        long bignum1 = 300000000L;
        System.out.println(bignum1);

        float wavy = 3.15f;
        System.out.println(wavy);

        double mcchicken = 4.99d;
        System.out.println(mcchicken);

        // Scientific Numbers

        float f1 = 32e3f;
        double d1 = 13E2d;
        System.out.println(f1);
        System.out.println(d1);

        //Booleans
        boolean isJavaFun = true;
        boolean areGrapesTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(areGrapesTasty);   // Outputs false

        // Characters (used to store single characters)
        char myGrade = 'A';
        System.out.println(myGrade);

        // Java type Casting
        //This is Widening or up cast/ when passing a smaller size type to a larger size type
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        /*This is Narrowing or down cast/ Narrowing casting must be done manually
        by placing the type in parentheses in front of the value
         */
        double myDouble2 = 9.78d;
        int myInt5 = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9


//Java operators
        /*Arithmetic operators
                +	Addition	Adds together two values	x + y
                -	Subtraction	Subtracts one value from another	x - y
                *	Multiplication	Multiplies two values	x * y
                /	Division	Divides one value by another	x / y
                %	Modulus	Returns the division remainder	x % y
                ++	Increment	Increases the value of a variable by 1	++x
                --	Decrement	Decreases the value of a variable by 1	--x */
        /* Assignment operators
        =	x = 5	x = 5
        +=	x += 3	x = x + 3
        -=	x -= 3	x = x - 3
        *=	x *= 3	x = x * 3
        /=	x /= 3	x = x / 3
        %=	x %= 3	x = x % 3
        &=	x &= 3	x = x & 3
        |=	x |= 3	x = x | 3
        ^=	x ^= 3	x = x ^ 3
        >>=	x >>= 3	x = x >> 3
        <<=	x <<= 3	x = x << 3
         */

        /*Comparison operators

                  ==	   Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y
*/
        /*  Logical operators
        && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
         */

//Java Strings

        String greeting1 = "wazxzuuuhhh";

        //String length ( length() method )

        String txt = "LMNOP";
        System.out.println("The length of the txt string is: " + txt.length());

        //More String methods

        String txt1 = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        //indexOf() returns index position
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

//Java Math


        Math.max(5, 10);
        Math.min(5, 10);

        Math.sqrt(64);

        Math.abs(-4.7);

        Math.random();

//random number method

        int randomNum = (int)(Math.random() * 101);
    }
}
