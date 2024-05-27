public class gcd {
    
    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        // Example usage of the calculateGCD function
        int number1 = 56;
        int number2 = 98;
        
        int gcd = calculateGCD(number1, number2);
        
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}