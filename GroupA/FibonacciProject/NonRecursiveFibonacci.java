class NonRecursiveFibonacci {

    // Function to print the first N Fibonacci numbers (non-recursive)
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;  // Initial values

        // Loop to generate Fibonacci sequence
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");  // Print the current number

            // Update the values for the next Fibonacci number
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        System.out.println();  // Move to next line after printing
    }

    // Main method
    public static void main(String[] args) {
        int N = 10;  // Number of Fibonacci numbers to print

        // Call the Fibonacci function
        Fibonacci(N);
    }
}
