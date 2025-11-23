
public class PrimitiveDatatypes {

    public static void main(String[] args) {

    //Primitive Data Types in Java


    //Integer types
    byte byteValue = 100;
    System.out.println("Byte value: " + byteValue);
    short shortValue = 10000;
    System.out.println("Short value: " + shortValue);
    int intValue = 10;
    System.out.println("Integer value: " + intValue);
    long longValue = 100000L;
    System.out.println("Long value: " + longValue);
    //Floating point types
    float floatValue = 10.5f;
    System.out.println("Float value: " + floatValue);
    double doubleValue = 20.99;
    System.out.println("Double value: " + doubleValue);
    //Other types
    char charValue = 'A';
    System.out.println("Character value: " + charValue);
    boolean booleanValue = true;
    System.out.println("Boolean value: " + booleanValue);

    System.out.println();

    //Data Type Ranges
    System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
    System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
    System.out.println("Integer Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
    System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
    System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);   
    System.out.println("Character Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    System.out.println();

    //Type Casting Examples

    //explicit casting - here we manually convert them
    System.out.println();
    System.out.println("Explicit Casting Examples");
    double doubleNum = 9922555656554464444454555.780000555544554455445544;
    System.out.println("Double value = "+ doubleNum);
    float floatNum = (float) doubleNum;
    System.out.println("Float value = "+ floatNum);
    long longNum =  (long)floatNum;
    System.out.println("Long value = "+ longNum);
    int intNum = (int)longNum;
    System.out.println("Integer value = "+ intNum);
    short shortNum = (short)intNum;
    System.out.println("short value = "+ shortNum);
    byte byteNum = (byte)shortNum;
    System.out.println("Byte value = "+ byteNum);

    //implicit casting - here we dont nee to mannually convert them.
    byte bNum =127;
    System.out.println(bNum);
    short sNum = bNum;
    System.out.println(sNum);
    int iNum = sNum;
    System.out.println(iNum);
    long lNum = iNum;
    System.out.println(lNum);
    float fNum = lNum;
    System.out.println(fNum);    
    double dNum = fNum;
    System.out.println(dNum);
    




    }

    




}
