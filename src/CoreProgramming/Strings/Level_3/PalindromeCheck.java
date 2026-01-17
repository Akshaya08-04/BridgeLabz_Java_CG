package CoreProgramming.Strings.Level_3;
class PalindromeCheck {

    static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end)
            if (text.charAt(start++) != text.charAt(end--))
                return false;
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
}
