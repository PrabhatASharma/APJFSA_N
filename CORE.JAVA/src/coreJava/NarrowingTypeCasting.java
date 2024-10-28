package coreJava;

public class NarrowingTypeCasting {
    public static void main(String[] args) {

        long longValue = 130;
        
        short shortValue = (short) longValue; // Explicitly casting long to short
        
        System.out.println("Original long value: " + longValue);
        
        System.out.println("Narrowed short value: " + shortValue);
    }
}





//output

/*Original long value: 130
Narrowed short value: 130
*/