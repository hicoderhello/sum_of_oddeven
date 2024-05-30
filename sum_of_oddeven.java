    import java.util.Scanner;

public class sum_of_oddeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the long number as a string
        String number = scanner.nextLine();
        
        // Initialize sums for odd and even digits
        int oddSum = 0;
        int evenSum = 0;
        
        // Iterate over each character in the string
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            
            // Skip if character is not a digit (for example, a negative sign)
            if (!Character.isDigit(ch)) {
                continue;
            }
            
            // Convert character to digit
            int digit = Character.getNumericValue(ch);
            
            // Check if the digit is even or odd and update the respective sum
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        
        // Print the results
        System.out.println(oddSum + " " + evenSum);
    }}


