public class StringThree {
    public int countYZ(String str) {
        // Convert the string to lowercase to ensure case insensitivity
        str = str.toLowerCase();

        // Split the string into words using non-letter characters as delimiters
        String[] words = str.split("[^a-zA-Z]+");

        // Initialize a counter for words ending in 'y' or 'z'
        int count = 0;

        // Iterate through each word
        for (String word : words) {
            // Check if the word ends with 'y' or 'z'
            if (!word.isEmpty() && (word.endsWith("y") || word.endsWith("z"))) {
                count++;
            }
        }

        // Return the count of words ending with 'y' or 'z'
        return count;
    }
    public String withoutString(String base, String remove) {
        // Convert both base and remove to lowercase to ensure case insensitivity
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        // Create a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Start index for searching
        int index = 0;

        // Iterate through the base string
        while (index < base.length()) {
            // Find the starting index of the remove string in the base string
            int foundIndex = baseLower.indexOf(removeLower, index);

            // If the remove string is not found, append the rest of the base string
            if (foundIndex == -1) {
                result.append(base.substring(index));
                break;
            }

            // Append the part of the base string before the remove string
            result.append(base.substring(index, foundIndex));

            // Move the index forward by the length of the remove string
            index = foundIndex + remove.length();
        }

        // Return the resulting string
        return result.toString();
    }
    public boolean equalIsNot(String str) {
        // Initialize counters for "is" and "not"
        int countIs = 0;
        int countNot = 0;

        // Iterate through the string to count occurrences of "is"
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }

        // Iterate through the string to count occurrences of "not"
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }

        // Return true if counts are equal, otherwise false
        return countIs == countNot;
    }
    public boolean gHappy(String str) {
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is 'g'
            if (str.charAt(i) == 'g') {
                // Check if the 'g' is not happy (no adjacent 'g')
                if ((i > 0 && str.charAt(i - 1) == 'g') || (i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    // The 'g' is happy, continue to check the next character
                    continue;
                } else {
                    // If a 'g' is not happy, return false
                    return false;
                }
            }
        }
        // If all 'g's are happy, return true
        return true;
    }
    public int countTriple(String str) {
        // Initialize a counter for triples
        int tripleCount = 0;

        // Iterate through the string, stopping at length - 2 to prevent index out of bounds
        for (int i = 0; i < str.length() - 2; i++) {
            // Check if the current character and the next two characters are the same
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                // If they form a triple, increment the triple counter
                tripleCount++;
            }
        }

        // Return the total number of triples found
        return tripleCount;
    }
    public int sumDigits(String str) {
        // Initialize a sum to accumulate the total of digits
        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is a digit
            if (Character.isDigit(currentChar)) {
                // Convert the character to an integer and add it to the sum
                sum += Character.getNumericValue(currentChar);
            }
        }

        // Return the total sum of digits
        return sum;
    }
    public String sameEnds(String str) {
        // Initialize the longest matching prefix and suffix
        String longestMatch = "";

        // Iterate over each possible length of prefix and suffix
        for (int i = 0; i < str.length() / 2; i++) {
            // Get the prefix and suffix of length i + 1
            String prefix = str.substring(0, i + 1);
            String suffix = str.substring(str.length() - i - 1);

            // Check if the prefix matches the suffix
            if (prefix.equals(suffix)) {
                // If they match, update the longest matching prefix and suffix
                longestMatch = prefix;
            }
        }

        // Return the longest matching prefix and suffix
        return longestMatch;
    }
    public String mirrorEnds(String str) {
        // Initialize an empty string to hold the mirror substring
        StringBuilder mirror = new StringBuilder();

        // Iterate through the string, comparing characters from start and end
        for (int i = 0; i < str.length(); i++) {
            // Compare character at position i from the start with the character from the end
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                // If they match, append the character to the mirror string
                mirror.append(str.charAt(i));
            } else {
                // Stop when characters no longer match
                break;
            }
        }

        // Return the mirror substring as a string
        return mirror.toString();
    }


}
