import java.util.Arrays;

public class StreamExample {



        public static String getLargestPermutation(String input) {
            // Convert string to character array
            char[] chars = input.toCharArray();

            // Sort characters in descending order
            Arrays.sort(chars);

            // Reverse the sorted array to get descending order
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }

            // Return new string from sorted characters
            return new String(chars);
        }

        public static void main(String[] args) {
            String input = "ABC";
            String largest = getLargestPermutation(input);
            System.out.println("Lexicographically largest permutation of " + input + " is: " + largest);
        }
    }
