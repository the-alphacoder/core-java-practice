/*
 * =============================================
 *  BITWISE OPERATORS IN JAVA (Clean + Readable + Runnable)
 * =============================================
 * Bitwise operators work on binary bits of integers.
 * They are VERY important in DSA (masks, toggles, optimizations).
 */

public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 6;    // Binary:  0110
        int b = 10;   // Binary:  1010

        // --------------------------------------------------
        // 1. BITWISE AND (&)
        // --------------------------------------------------
        // Rule: 1 only when both bits are 1
        int andResult = a & b;   // 0110 & 1010 = 0010 (2)

        // --------------------------------------------------
        // 2. BITWISE OR (|)
        // --------------------------------------------------
        // Rule: 1 when at least one bit is 1
        int orResult = a | b;    // 0110 | 1010 = 1110 (14)

        // --------------------------------------------------
        // 3. BITWISE XOR (^)
        // --------------------------------------------------
        // Rule: 1 when bits are DIFFERENT
        int xorResult = a ^ b;   // 0110 ^ 1010 = 1100 (12)

        // --------------------------------------------------
        // 4. BITWISE NOT (~)
        // --------------------------------------------------
        // Flips all bits (2's complement form)
        int notA = ~a;           // ~0110 = ...1001 (-7)

        // --------------------------------------------------
        // 5. LEFT SHIFT (<<)
        // --------------------------------------------------
        // a << n is same as a * (2^n)
        int leftShift = a << 1;  // 0110 << 1 = 1100 (12)

        // --------------------------------------------------
        // 6. RIGHT SHIFT (>>)
        // --------------------------------------------------
        // a >> n is same as a / (2^n)
        int rightShift = a >> 1; // 0110 >> 1 = 0011 (3)

        // --------------------------------------------------
        // 7. UNSIGNED RIGHT SHIFT (>>>)
        // --------------------------------------------------
        // Same as >> but fills left bits with 0
        int unsignedRightShift = a >>> 1;

        // --------------------------------------------------
        // OUTPUT
        // --------------------------------------------------
        System.out.println("AND (6 & 10): " + andResult);
        System.out.println("OR (6 | 10): " + orResult);
        System.out.println("XOR (6 ^ 10): " + xorResult);
        System.out.println("NOT (~6): " + notA);
        System.out.println("Left Shift (6 << 1): " + leftShift);
        System.out.println("Right Shift (6 >> 1): " + rightShift);
        System.out.println("Unsigned Right Shift (6 >>> 1): " + unsignedRightShift);
    }
}