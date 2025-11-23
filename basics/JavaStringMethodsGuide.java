/*
 * File: JavaStringMethodsGuide.java
 * Title: Master Java String Methods – A Comprehensive Guide for Beginners
 *
 * This is a runnable Java file that teaches nearly all important String methods.
 * The explanations are short, clear, and attached to real code examples.
 *
 * How to run:
 *   javac JavaStringMethodsGuide.java
 *   java JavaStringMethodsGuide
 */

public class JavaStringMethodsGuide {
    public static void main(String[] args) {

        // ----------------------------------------------------------------------
        // 1) Basic String Creation
        // ----------------------------------------------------------------------
        String s = "  Hello Java World  ";
        String s2 = "hello";
        String s3 = "java";
        String s4 = "hello";

        // ----------------------------------------------------------------------
        // 2) length() – total characters
        // What it does: returns number of characters in the string.
        // Example: "hello".length() → 5
        // ----------------------------------------------------------------------
        System.out.println("length(): " + s.length());//() - total characters
        // ----------------------------------------------------------------------
        System.out.println("length(): " + s.length());

        // ----------------------------------------------------------------------
        // ----------------------------------------------------------------------
        // 3) charAt(index)
        // What it does: returns the character at the given position.
        // Index starts from 0. If index is invalid → StringIndexOutOfBoundsException.
        // ----------------------------------------------------------------------(index) – character at a position
        // ----------------------------------------------------------------------
        System.out.println("charAt(2): " + s.charAt(2));

        // ----------------------------------------------------------------------
        // ----------------------------------------------------------------------
        // 4) substring(start), substring(start, end)
        // What it does: extracts part of a string.
        // substring(a, b) → returns characters from index a up to b-1.
        // ----------------------------------------------------------------------(start) & substring(start, end)
        // ----------------------------------------------------------------------
        System.out.println("substring(2): " + s.substring(2)); // from index 2 → end
        System.out.println("substring(2, 7): " + s.substring(2, 7)); // [2,7)

        // ----------------------------------------------------------------------
        // ----------------------------------------------------------------------
        // 5) equals(), equalsIgnoreCase(), ==
        // equals() → checks VALUE equality
        // equalsIgnoreCase() → compares ignoring upper/lowercase
        // == → compares REFERENCES, not values
        // ----------------------------------------------------------------------() vs equalsIgnoreCase() vs ==
        // ----------------------------------------------------------------------
        System.out.println("equals(): " + s2.equals(s4));
        System.out.println("equalsIgnoreCase(): " + s2.equalsIgnoreCase("HeLLo"));
        System.out.println("== (reference compare): " + (s2 == s4));

        // ----------------------------------------------------------------------
        // 6) compareTo() – lexicographic comparison
        // ----------------------------------------------------------------------
        System.out.println("compareTo: 'hello' vs 'java': " + s2.compareTo(s3));

        // ----------------------------------------------------------------------
        // 7) toLowerCase(), toUpperCase()
        // ----------------------------------------------------------------------
        System.out.println("toLowerCase(): " + s.toLowerCase());
        System.out.println("toUpperCase(): " + s.toUpperCase());

        // ----------------------------------------------------------------------
        // 8) trim() – removes leading & trailing spaces
        // ----------------------------------------------------------------------
        System.out.println("trim(): '" + s.trim() + "'");

        // ----------------------------------------------------------------------
        // 9) contains(), startsWith(), endsWith()
        // ----------------------------------------------------------------------
        System.out.println("contains('Java'): " + s.contains("Java"));
        System.out.println("startsWith('  Hell'): " + s.startsWith("  Hell"));
        System.out.println("endsWith('World  '): " + s.endsWith("World  "));

        // ----------------------------------------------------------------------
        // 10) indexOf() & lastIndexOf()
        // ----------------------------------------------------------------------
        System.out.println("indexOf('Java'): " + s.indexOf("Java"));
        System.out.println("lastIndexOf('l'): " + s.lastIndexOf('l'));

        // ----------------------------------------------------------------------
        // 11) replace(), replaceAll(), replaceFirst()
        // ----------------------------------------------------------------------
        System.out.println("replace('l','x'): " + s.replace('l', 'x'));
        System.out.println("replaceAll(' +','-'): " + s.replaceAll(" +", "-"));
        System.out.println("replaceFirst(' +','*'): " + s.replaceFirst(" +", "*"));

        // ----------------------------------------------------------------------
        // 12) split()
        // ----------------------------------------------------------------------
        String[] parts = s.trim().split(" ");
        System.out.println("split(): ");
        for (String p : parts) System.out.println("  -> " + p);

        // ----------------------------------------------------------------------
        // 13) join() – static method
        // ----------------------------------------------------------------------
        String joined = String.join("-", "hello", "java", "world");
        System.out.println("join(): " + joined);

        // ----------------------------------------------------------------------
        // 14) isEmpty() & isBlank()
        // ----------------------------------------------------------------------
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty(): " + empty.isEmpty());
        System.out.println("isBlank(): " + blank.isBlank()); // Java 11+

        // ----------------------------------------------------------------------
        // 15) repeat(n)
        // ----------------------------------------------------------------------
        System.out.println("repeat(3): " + "ha".repeat(3));

        // ----------------------------------------------------------------------
        // 16) strip(), stripLeading(), stripTrailing() — better than trim()
        // ----------------------------------------------------------------------
        String spaced = "  hi  ";
        System.out.println("strip(): '" + spaced.strip() + "'");
        System.out.println("stripLeading(): '" + spaced.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + spaced.stripTrailing() + "'");

        // ----------------------------------------------------------------------
        // 17) Formatting using format()
        // ----------------------------------------------------------------------
        String formatted = String.format("Name: %s | Score: %.2f", "Rahul", 99.456);
        System.out.println(formatted);

        // ----------------------------------------------------------------------
        // 18) valueOf() – converting other types to String
        // ----------------------------------------------------------------------
        int num = 123;
        System.out.println("valueOf(): " + String.valueOf(num));

        // ----------------------------------------------------------------------
        // 19) Subtle point: Strings are IMMUTABLE
        // ----------------------------------------------------------------------
        String original = "hello";
        String modified = original.replace('h', 'y'); // new string created
        System.out.println("original: " + original);
        System.out.println("modified: " + modified);

        // ----------------------------------------------------------------------
        // 20) Summary of MOST IMPORTANT methods for beginners
        // ----------------------------------------------------------------------
        System.out.println("\nSUMMARY – MASTER THESE FIRST:");
        System.out.println("length(), charAt(), substring()");
        System.out.println("equals(), equalsIgnoreCase(), compareTo()");
        System.out.println("toLowerCase(), toUpperCase(), trim()");
        System.out.println("contains(), startsWith(), endsWith()");
        System.out.println("indexOf(), lastIndexOf()");
        System.out.println("replace(), replaceAll()");
        System.out.println("split(), join()");
        System.out.println("isEmpty(), isBlank()");
        System.out.println("repeat(), strip() methods");
        System.out.println("String.format(), String.valueOf()");
        System.out.println("REMEMBER: Strings are IMMUTABLE!");
    }
}
