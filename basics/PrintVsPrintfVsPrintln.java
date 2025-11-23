/*
 * File: PrintVsPrintfVsPrintln.java
 * Short, focused, and practical notes about: print, printf, println
 * "sout" -> System.out usage explained (not too deep, but the important things).
 *
 * How to run:
 *   javac PrintVsPrintfVsPrintln.java
 *   java PrintVsPrintfVsPrintln
 *
 * This file is runnable — it prints example outputs and explains behavior in comments
 * so you can both read the notes and see the examples run.
 */

public class PrintVsPrintfVsPrintln {
    public static void main(String[] args) {
        // -----------------------------
        // 1) Basic behaviours
        // -----------------------------
        // System.out.print(...)   -> prints text, DOES NOT append a newline
        // System.out.println(...) -> prints text, appends a newline (\n or platform %n)
        // System.out.printf(...)  -> prints formatted text according to a format string (like C's printf)
        //                          -> does NOT append a newline unless you include it in the format
        
        System.out.print("[print] This is line part 1. ");
        System.out.print("(continues on same line)\n"); // manual newline using \n
        System.out.println("[println] This is a full line with newline appended.");

        // printf with format string (no newline automatically)
        System.out.printf("[printf] Formatted int: %d, string: %s", 42, "hello");
        System.out.println(); // explicit newline after printf example

        // -----------------------------
        // 2) Formatting basics for printf
        // -----------------------------
        // Common format specifiers:
        // %d -> integer, %f -> floating point, %s -> string, %b -> boolean, %n -> platform newline
        // You can control width, precision and flags: %[flags][width][.precision]conversion
        
        System.out.printf("Integer padded: %05d (width 5, zero-padded) %n", 123);
        System.out.printf("Left aligned: %-8s (width 8, left) %n", "left");
        System.out.printf("Float: %.2f (precision 2) %n", 3.14159);

        // Grouping separators and sign control
        System.out.printf("With comma: %,d %n", 12345678);
        System.out.printf("Show sign: %+d %n", 42);

        // Argument indexes (useful when reordering or reusing values)
        System.out.printf("Reordered: %2$s then %1$d %n", 100, "second");

        // Use %n instead of \n in format strings: it's platform-independent newline
        System.out.printf("Platform newline test:%nLine2 using %%n%n");

        // -----------------------------
        // 3) Why use printf / String.format?
        // -----------------------------
        // - printf allows precise formatting for columns, reports, logs.
        // - String.format returns a formatted String (like printf but returns String).
        String formatted = String.format("Name: %s, Score: %.1f", "Asha", 92.345);
        System.out.println("String.format -> " + formatted);

        // -----------------------------
        // 4) Performance and behaviour notes (important but not deep)
        // -----------------------------
        // - System.out is a PrintStream (PrintStream methods forward to underlying OutputStream).
        // - println writes text + newline; print writes text only.
        // - printf delegates to Formatter internally.
        // - Frequent console IO (many small print/println calls) can be slow because of I/O overhead.
        //   If you need high-performance logging, buffer outputs (StringBuilder) or use proper logging frameworks.
        
        // Example: building a long string and printing once is faster than many small prints
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("line-").append(i).append(" ");
        }
        System.out.println("Buffered output: " + sb.toString());

        // -----------------------------
        // 5) Newline characters: \n vs %n
        // -----------------------------
        // - "\n" is a newline character (line feed). On Windows consoles, proper newline could be CR+LF.
        // - "%n" used inside format strings is translated to the platform-specific line separator.
        //   Prefer %n inside printf format strings when you want portable newline behaviour.

        // -----------------------------
        // 6) Escaping percent sign and using locale
        // -----------------------------
        // To print a literal percent, use %% inside format string
        System.out.printf("Progress: 80%% complete %n");

        // Some formatters are locale-sensitive (decimal separator, grouping). String.format(Locale, ...)
        // Example omitted here (not too deep) — remember locale matters for internationalization.

        // -----------------------------
        // 7) "sout" and nice IDE tricks
        // -----------------------------
        // In many IDEs (IntelliJ IDEA, Eclipse), typing "sout" + TAB expands to System.out.println();
        // That's a convenience template only — the runtime behaviour is same as calling System.out.println.

        // -----------------------------
        // 8) Error stream: System.err
        // -----------------------------
        // Use System.err.println(...) for errors. It's a separate stream and can be redirected separately
        // from System.out in the shell. Useful for separating logs vs regular output.
        System.err.println("This is an error message printed to stderr (separate stream).");

        // -----------------------------
        // 9) Final quick examples summary
        // -----------------------------
        System.out.println("Summary examples:");
        System.out.print("A");
        System.out.print("B");
        System.out.println(" -> printed AB then newline");
        System.out.printf("Formatted columns: |%10s|%10s|%n", "col1", "col2");

        // End
    }
}
