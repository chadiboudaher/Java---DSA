package anagram_java;

public class Main {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent")); 
        System.out.println(isAnagram("hello", "world"));   
        System.out.println(isAnagram("aacc", "ccac"));      
        System.out.println(isAnagram("rat", "car"));        
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int val : charCounts) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
