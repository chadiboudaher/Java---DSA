public class Main {
    public static void main(String[] args) {

        String s = " Hello world";
        System.out.println(lengthOfFirstWord(s));
        
    }

    public static int lengthOfFirstWord(String s) {
        int i = 0;

        while (i <= (s.length() -1) && s.charAt(i) == ' ') {
            i++;
        }

        int length = 0;
        while (i <= (s.length() - 1) && s.charAt(i) != ' ') {
            length++;
            i++;
        }

        return length;
    }
}