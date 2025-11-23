/*
 * File: JavaStringsExplained.java
 * Deep-but-crisp notes + runnable examples.
 * Topic: Java Strings — String data type, Heap memory, String Pool, Immutability.
 *
 * How to run:
 *   javac JavaStringsExplained.java
 *   java JavaStringsExplained
 */

public class JavaStringsExplained {
    public static void main(String[] args) {

        // ------------------------------------------------------------
        // 1) What exactly is a String in Java?
        // ------------------------------------------------------------
        // - String is a Class, NOT a primitive.
        // - String objects are IMMUTABLE (cannot be changed after creation).
        // - Because of immutability, Java can optimize memory by keeping a
        //   "String Pool" in the heap.

        String a = "hello";   // This goes into STRING POOL
        String b = "hello";   // Same literal → reuses the same pooled object

        System.out.println("a == b ? " + (a == b));
        // true → both refer to SAME pooled object

        // ------------------------------------------------------------
        // 2) Heap vs String Pool
        // ------------------------------------------------------------
        // HEAP:
        //   - General place for objects created using 'new'.
        //   - Every new String() creates a SEPARATE object.
        // STRING POOL:
        //   - Special area inside heap for string literals.
        //   - Reuses existing objects for identical literals.

        String x = new String("hello"); // FORCES a new object in heap
        String y = new String("hello"); // Another new object in heap

        System.out.println("x == y ? " + (x == y));
        // false → because 'new' ALWAYS creates a separate object

        System.out.println("x.equals(y) ? " + (x.equals(y)));
        // true → their VALUE is same even though objects differ

        // ------------------------------------------------------------
        // 3) Interning (manually forcing an object into the string pool)
        // ------------------------------------------------------------
        // intern() → returns pooled version of the string

        String pooledX = x.intern();
        System.out.println("a == pooledX ? " + (a == pooledX));
        // true → pooledX becomes same literal from the string pool

        // ------------------------------------------------------------
        // 4) Immutability & Why it matters
        // ------------------------------------------------------------
        // - If you "modify" a string, Java actually creates a NEW object.
        // - The original does NOT change.

        String s1 = "hello";
        String s2 = s1 + " world"; // NEW OBJECT created

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        // s1 unchanged because Strings are immutable

        // ------------------------------------------------------------
        // 5) Why use StringBuilder / StringBuffer
        // ------------------------------------------------------------
        // - Because modifying Strings repeatedly creates MANY objects → slow.
        // - StringBuilder is MUTABLE, so it's faster for concatenation.

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" world");
        System.out.println("StringBuilder result: " + sb.toString());

        // ------------------------------------------------------------
        // 6) One more important point: literals behave differently
        // ------------------------------------------------------------
        String lit1 = "java";
        String lit2 = "java";
        String heapCreated = new String("java");

        System.out.println("lit1 == lit2 ? " + (lit1 == lit2));
        // true (pooled)

        System.out.println("lit1 == heapCreated ? " + (lit1 == heapCreated));
        // false (different heap object)

        System.out.println("lit1.equals(heapCreated) ? " + lit1.equals(heapCreated));
        // true (same content)

        // ------------------------------------------------------------
        // 7) Summary (short but important)
        // ------------------------------------------------------------
        System.out.println("\nSUMMARY:");
        System.out.println("String literals → go to String Pool");
        System.out.println("new String() → always creates new heap objects");
        System.out.println("== compares references | equals() compares values");
        System.out.println("Strings are immutable → modifications create NEW objects");
        System.out.println("Use StringBuilder for heavy concatenation");
    }
}
