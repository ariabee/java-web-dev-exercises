package testing;

public class TestExceptions {

    /**
     * Q: The following code will successfully catch an exception type of
     * RuntimeException, Exception, and ArithmeticException.
     * Considering best practices for catching exceptions,
     * how should you determine what the exception type should be?
     *
     * A: "Exception types should always be as specific as possible.
     * For example, if we only expect that an IOException might occur,
     * we should NOT catch the more general Exception." - LaunchCode
     */
    public static void main (String[] args) {
        try {
            int a = 0;
            int b = 20 / a;
        } catch(ArithmeticException e) {
            System.out.println ("Divide by zero error");
        }
    }

}
