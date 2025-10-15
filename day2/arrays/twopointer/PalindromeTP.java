package day2.arrays.twopointer;

public class PalindromeTP {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        //if string is null, empty or contains only spaces
        if (str == null || str.isBlank()) return true;

        //apply two pointer to check the palindrome
        int i = 0;
        int j= str.length()-1;

        while (i <= j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
