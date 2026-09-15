
public class dataType {

    public static void main(String[] args) {

        /*
         ============================================================
                               JAVA DATA TYPES
         ============================================================

         Java Data Types are divided into two categories:

         1. Primitive Data Types
         2. Non-Primitive / Reference Data Types


         ------------------------------------------------------------
                             1. PRIMITIVE DATA TYPES
         ------------------------------------------------------------

         Java has 8 primitive data types:

         byte
         short
         int
         long
         float
         double
         char
         boolean
        */


        // ============================================================
        //                        1. BYTE
        // ============================================================

        /*
         byte:
         - Used for small whole numbers.
         - Size = 8 bits
         - 1 byte = 8 bits

         Range Formula for signed integer:

         Minimum = -2^(n - 1)
         Maximum =  2^(n - 1) - 1

         Here:
         n = 8

         Minimum = -2^(8 - 1)
                 = -2^7
                 = -128

         Maximum = 2^7 - 1
                 = 127

         Therefore:
         Range = -128 to 127

         We can also find it directly using:
         Byte.MIN_VALUE
         Byte.MAX_VALUE
        */

        System.out.println("BYTE");
        System.out.println("Minimum: " + Byte.MIN_VALUE);
        System.out.println("Maximum: " + Byte.MAX_VALUE);


        // ============================================================
        // 2. SHORT
        // ============================================================

        /*
         short:
         - Used for whole numbers larger than byte.
         - Size = 16 bits
         - 2 bytes

         Formula:

         Minimum = -2^(16 - 1)
                 = -2^15
                 = -32,768

         Maximum = 2^15 - 1
                 = 32,767

         Range:
         -32,768 to 32,767

         Direct way:
         Short.MIN_VALUE
         Short.MAX_VALUE
        */

        System.out.println("\nSHORT");
        System.out.println("Minimum: " + Short.MIN_VALUE);
        System.out.println("Maximum: " + Short.MAX_VALUE);


        // ============================================================
        // 3. INT
        // ============================================================

        /*
         int:
         - Most commonly used whole-number data type.
         - Size = 32 bits
         - 4 bytes

         Formula:

         Minimum = -2^(32 - 1)
                 = -2^31
                 = -2,147,483,648

         Maximum = 2^31 - 1
                 = 2,147,483,647

         Range:
         -2,147,483,648 to 2,147,483,647

         Direct way:
         Integer.MIN_VALUE
         Integer.MAX_VALUE
        */

        System.out.println("\nINT");
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);


        // ============================================================
        // 4. LONG
        // ============================================================

        /*
         long:
         - Used for very large whole numbers.
         - Size = 64 bits
         - 8 bytes

         Formula:

         Minimum = -2^(64 - 1)
                 = -2^63

         Maximum = 2^63 - 1

         Range:
         -9,223,372,036,854,775,808
         to
          9,223,372,036,854,775,807

         Direct way:
         Long.MIN_VALUE
         Long.MAX_VALUE

         NOTE:
         long is primitive.
         Long is its wrapper class.
        */

        System.out.println("\nLONG");
        System.out.println("Minimum: " + Long.MIN_VALUE);
        System.out.println("Maximum: " + Long.MAX_VALUE);


        // ============================================================
        // 5. FLOAT
        // ============================================================

        /*
         float:
         - Used for decimal numbers.
         - Size = 32 bits
         - 4 bytes
         - Approximately 6-7 decimal digits of precision.

         float does NOT use the normal integer range formula.

         It uses IEEE 754 floating-point representation.

         Maximum:
         Float.MAX_VALUE

         IMPORTANT:
         Float.MIN_VALUE does NOT mean the most negative value.

         Float.MIN_VALUE means:
         The smallest positive non-zero float value.

         Actual negative limit:
         -Float.MAX_VALUE

         Example:
         */

        System.out.println("\nFLOAT");
        System.out.println("Smallest Positive: " + Float.MIN_VALUE);
        System.out.println("Minimum Negative: " + (-Float.MAX_VALUE));
        System.out.println("Maximum Positive: " + Float.MAX_VALUE);


        // ============================================================
        // 6. DOUBLE
        // ============================================================

        /*
         double:
         - Used for decimal numbers.
         - More accurate than float.
         - Size = 64 bits
         - 8 bytes
         - Approximately 15-16 decimal digits of precision.

         double also uses IEEE 754.

         Maximum:
         Double.MAX_VALUE

         Smallest positive non-zero value:
         Double.MIN_VALUE

         Actual negative limit:
         -Double.MAX_VALUE
        */

        System.out.println("\nDOUBLE");
        System.out.println("Smallest Positive: " + Double.MIN_VALUE);
        System.out.println("Minimum Negative: " + (-Double.MAX_VALUE));
        System.out.println("Maximum Positive: " + Double.MAX_VALUE);


        // ============================================================
        // 7. CHAR
        // ============================================================

        /*
         char:
         - Used to store a single character.
         - Size = 16 bits
         - 2 bytes
         - Uses Unicode.

         char is UNSIGNED.

         Formula:

         Minimum = 0

         Maximum = 2^16 - 1
                 = 65,535

         Range:
         0 to 65,535

         Direct way:
         Character.MIN_VALUE
         Character.MAX_VALUE

         Character.MIN_VALUE is '\u0000'
         Character.MAX_VALUE is '\uffff'

         We cast to int to see their numeric values.
        */

        System.out.println("\nCHAR");
        System.out.println("Minimum: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum: " + (int) Character.MAX_VALUE);


        // ============================================================
        // 8. BOOLEAN
        // ============================================================

        /*
         boolean:
         - Used for logical values.
         - It has only two possible values:

           true
           false

         boolean does NOT have a numeric range.

         Example:
        */

        System.out.println("\nBOOLEAN");
        System.out.println("Value 1: " + true);
        System.out.println("Value 2: " + false);


        // ============================================================
        //              NON-PRIMITIVE DATA TYPES
        // ============================================================

        /*
         ------------------------------------------------------------
         Non-Primitive / Reference Data Types
         ------------------------------------------------------------

         Non-primitive data types are reference types.

         Examples:

         1. String
         2. Array
         3. Class
         4. Object
         5. Interface
         6. Enum

         Unlike primitive types, these are objects/reference types.
        */


        // ============================================================
        // STRING
        // ============================================================

        /*
         String:
         - Stores a sequence of characters.
         - String is NOT a primitive data type.
         - String is a class in Java.
        */

        String name = "Muhammad Faizan";

        System.out.println("\nSTRING");
        System.out.println("Name: " + name);


        // ============================================================
        // ARRAY
        // ============================================================

        /*
         Array:
         - Stores multiple values of the same type.
         - Array is a reference type.

         Example:
        */

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\nARRAY");
        System.out.println("First value: " + numbers[0]);


        // ============================================================
        // CLASS / OBJECT
        // ============================================================

        /*
         Class:
         - A blueprint for creating objects.

         Object:
         - An instance of a class.

         Example:
        */

        dataType obj = new dataType();

        System.out.println("\nOBJECT");
        System.out.println("Object created successfully.");
    }
}

