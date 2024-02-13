import java.util.ArrayList;

public class Main {


    //Checks if the given string is a palindrome.
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
        //StringBuilder is a class that makes modifying character strings more efficient.
        //reverse(): This method reverses the characters inside the StringBuilder.
        //.toString(): This method converts the characters inside the StringBuilder into a String.
        //s.equals(...): This expression compares the original String s with the reversed String.
    }


    // Finds and returns all palindromic words in the given array.
    public static ArrayList<String> findAllPalindromes(String[] words) {
        ArrayList<String> palindromes = new ArrayList<>(); //ArrayList to store palindromic words found in the array.
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);


            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        // Example
        String[] words = {"abc", "car", "ada", "racecar", "cool", "level", "deified"};
        ArrayList<String> allPalindromes = findAllPalindromes(words);

        // Output all palindromic words
        System.out.println("All Palindromic Words:");
        for (String palindrome : allPalindromes) {
            System.out.println(palindrome);
        }
    }
}