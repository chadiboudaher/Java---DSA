public class Main {
    public static void main(String[] args) {

        String s = "          ";
        System.out.println(lengthOfFirstWord(s));
        System.out.println(countNumberOfWords(s));
        
    }

    // length of the first word
    public static int lengthOfFirstWord(String s) {
        int i = 0;

        // act as a trim, and when we are at a character it stops
        while (i <= (s.length() -1) && s.charAt(i) == ' ') {
            i++;
        }

        // start from the character we ended with, until a space 
        // is reached
        int length = 0;
        while (i <= (s.length() - 1) && s.charAt(i) != ' ') {
            length++;
            i++;
        }

        return length;
    }

    public static int countNumberOfWords(String s) {
        int sum = 0;
        int i = 0;

        if (i == s.length()) return 0;

        while (i <= (s.length() - 1) && s.charAt(i) == ' ') {
            i++;
        }

        if (i == s.length()) return 0;

        while (i <= (s.length() - 2)) {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                sum++;
            }
            i++;
        }
        return sum+1;
    }
}