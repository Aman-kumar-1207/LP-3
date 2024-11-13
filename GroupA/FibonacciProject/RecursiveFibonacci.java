class RecursiveFibonacci {

    // Function to return the nth Fibonacci number (recursive)
    static int fib(int n) {
        // Base case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        int N = 10;  // Number of Fibonacci numbers to print

        // Printing the first N Fibonacci numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println();  // Move to next line after printing
    }
}








