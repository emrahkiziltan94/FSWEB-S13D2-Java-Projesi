import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("case1: " + isPalindrome2(-1221));
        System.out.println("case1: " + isPalindrome2(707));
        System.out.println("case1: " + isPalindrome2(11212));*/

       /* System.out.println("case2: " + isPerfectNumber2(6));
        System.out.println("case2: " + isPerfectNumber2(28));
        System.out.println("case2: " + isPerfectNumber2(5));
        System.out.println("case2: " + isPerfectNumber2(-1));*/

      /*  System.out.println("case3: " + numberToWords(123));
        System.out.println("case3: " + numberToWords(1010));
        System.out.println("case3: " + numberToWords(-12));
        System.out.println("case3: " + numberToWords(11));*/

        System.out.println("case4: " + getFirstAndLastDigitSum(121));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }

    // 121
    public static boolean isPalindrome2(int number) {
        number = Math.abs(number); //121
        int originalNum = number; // originalNum = 121
        int reverseNumber = 0;  // reverseNumber = 0;

        // 121   12   1
        while (number > 0) {
            int digit = number % 10; // digit = 1  digit = 2 digit = 1
            reverseNumber = reverseNumber * 10 + digit;  // reverseNumber = 1 reverseNumber = 12 reverseNumber = 121
            number = number / 10;  // number 12   number = 1  number = 0
        }
        return originalNum == reverseNumber;  // originalNum = 121 reverseNumber=121
    }

    public static boolean isPalindrome3(int sayi) {
        sayi = Math.abs(sayi);
        String sayiString = Integer.toString(sayi);
        char[] charSayi = sayiString.toCharArray();

        int ilkIndex = 0;
        int sonIndex = charSayi.length - 1;
        while (ilkIndex < sonIndex) {
            if (charSayi[ilkIndex] != charSayi[sonIndex]) return false;

            ilkIndex++;
            sonIndex--;
        }

        return true;
    }

    // num = 6
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int total = 0; // total = 0
        for (int i = 1; i <= num / 2; i++) {   // i = 1 i<= 3      i = 2 num = 3  i = 3 num= 3 i= 4 num = 3
            if (num % i == 0) total += i;  // total = 1; total = 3 total = 6
        }
        return num == total;
    }

    // solution2
    public static boolean isPerfectNumber2(int num) {
        if (num <= 5) {
            return false;
        }
        int total = 1;
        int highest = (int) Math.sqrt(num);
        highest++;
        for (int i = 2; i < highest; i++) {   // i = 1 i<= 3      i = 2 num = 3  i = 3 num= 3 i= 4 num = 3
            if (num % i == 0) {
                total += i;
                if (i != num / i) {
                    total += num / i;
                }
            }
        }
        return num == total;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for (char digit : digits) { // digits 1,1  digit = 1
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();
    }


    // 222  = 4,  121 = 2, 123458 = 9
    public static int getFirstAndLastDigitSum(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        System.out.println("digit 0 = " + digits[0]);
        System.out.println("digit last = " + digits[digits.length - 1]);
        return Integer.parseInt(String.valueOf(digits[0])) + Integer.parseInt(String.valueOf(digits[digits.length - 1]));
    }
}