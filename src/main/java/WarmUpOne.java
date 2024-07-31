public class WarmUpOne {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // Return true if it is not a weekday or we are on vacation
        return !weekday || vacation;
    }

    // Example usage:
    boolean result1 = sleepIn(false, false); // true
    boolean result2 = sleepIn(true, false);  // false
    boolean result3 = sleepIn(false, true);  // true
    boolean result4 = sleepIn(true, true);   // true

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // Return true if both monkeys are smiling or if neither is smiling
        return aSmile == bSmile;
    }

    // Example usage:
    boolean result5 = monkeyTrouble(true, true); // true
    boolean result6 = monkeyTrouble(false, false); // true
    boolean result7 = monkeyTrouble(true, false); // false
    boolean result8 = monkeyTrouble(false, true); // false

   public int sumDouble(int a, int b) {
        // Check if the values are the same
        if (a == b) {
            // Return double their sum if the values are the same
            return 2 * (a + b);
        } else {
            // Return their sum if the values are different
            return a + b;
        }
    }

    // Example usage:
    int result9= sumDouble(1, 2); // 3
    int result10 = sumDouble(3, 2); // 5
    int result11 = sumDouble(2, 2); // 8

    // Function to return the absolute difference between n and 21
// If n is over 21, return double the absolute difference
   public int diff21(int n) {
        // Calculate the absolute difference
        int diff = Math.abs(n - 21);

        // If n is over 21, return double the absolute difference
        if (n > 21) {
            return 2 * diff;
        } else {
            // Otherwise, return the absolute difference
            return diff;
        }
    }

    // Example usage:
    int result12 = diff21(19); // 2
    int result13 = diff21(10); // 11
    int result14 = diff21(21); // 0

    // Function to determine if we are in trouble with the parrot
    boolean parrotTrouble(boolean isTalking, int hour) {
        // We are in trouble if the parrot is talking and the hour is before 7 or after 20
        return isTalking && (hour < 7 || hour > 20);
    }

    // Example usage:
    boolean result15 = parrotTrouble(true, 6); // true
    boolean result16 = parrotTrouble(true, 7); // false
    boolean result17 = parrotTrouble(false, 6); // false

    // Function to determine if one of the integers is 10 or if their sum is 10
    boolean makes10(int a, int b) {
        // Return true if one of the integers is 10 or if their sum is 10
        return a == 10 || b == 10 || (a + b) == 10;
    }

    // Example usage:
    boolean result18 = makes10(9, 10); // true
    boolean result19 = makes10(9, 9);  // false
    boolean result20 = makes10(1, 9);  // true

    // Function to determine if n is within 10 of 100 or 200
    boolean nearHundred(int n) {
        // Return true if the absolute difference between n and 100 is <= 10
        // or if the absolute difference between n and 200 is <= 10
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }

    // Example usage:
    boolean result21 = nearHundred(93); // true
    boolean result22 = nearHundred(90); // true
    boolean result23 = nearHundred(89); // false

    // Function to determine if one of the integers is negative and the other is positive
// or if the "negative" parameter is true, then return true only if both are negative
    boolean posNeg(int a, int b, boolean negative) {
        // Check if the "negative" parameter is true
        if (negative) {
            // Return true only if both a and b are negative
            return a < 0 && b < 0;
        } else {
            // Return true if one is negative and one is positive
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // Example usage:
    boolean result24 = posNeg(1, -1, false); // true
    boolean result25 = posNeg(-1, 1, false); // true
    boolean result26 = posNeg(-4, -5, true); // true

}
