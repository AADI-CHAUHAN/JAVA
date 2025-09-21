class FactorialCmd {
    public static void main(String[] args) {
        // Check if user passed an argument
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);  // Take first argument
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}
