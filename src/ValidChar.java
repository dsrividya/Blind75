public class ValidChar {

        public static void main(String[] args) {
            String s = "98etyshvD";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    System.out.println(ch + " is a digit");
                } else if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a letter");
                } else {
                    System.out.println(ch + " is neither a digit nor a letter");
                }
            }
        }
    }
