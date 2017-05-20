 import java.util.Scanner;
public class Exercise6_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number as a long integer:");
        long cCN = sc.nextLong();
        if (isValid(cCN)) 
            System.out.println(cCN + " is valid");
        else
            System.out.println(cCN + " is invalid");
    }
    /** Return true if the card number is valid */ 
    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

        return (total % 10 == 0) && (prefixMatched(number, 1) == true) && 
                (getSize(number)>=13) && (getSize(number) <=16);
        }
    /** Get the result from Step 2 */ 
    public static int sumOfDoubleEvenPlace (long number) {
        int sumOfDoubleEvenPlace = 0;
        long place = 0;

        while (number > 0) {
            place = number % 100;
            number = number / 100;
            sumOfDoubleEvenPlace += getDigit((int) (place / 10) * 2);
        }   
        return sumOfDoubleEvenPlace;
    }
    /** Return this number if it is a single digit, otherwise,
    * return the sum of the two digits */ 
    public static int getDigit (int number) {
        if (number <= 9) {
            return number;

        } 
        else {
            int firstDigit = number % 10;
            int secondDigit = (int)(number / 10);
            return firstDigit + secondDigit;
        }


    }
    /** Return sum of odd-place digits in number */ 
    public static int sumOfOddPlace (long number) {
        int sumOfOddPlace = 0;

        while (number <= 9) {
            sumOfOddPlace += (int)(number % 10);
            number = number % 100;
        }

        return sumOfOddPlace;
    }
    /** Return true if the digit d is a prefix for number */ 
    public static boolean prefixMatched (long number, int d) {
        if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5) || (getPrefix(number, d) == 3)) {

            if (getPrefix(number, d) == 4) {
                System.out.println("Visa card ");
            }
            else if (getPrefix(number, d) == 5) {
                System.out.println("Master Card");
            }
            else if (getPrefix(number, d) == 3) {
                System.out.println("American Express Card ");
            }
             return true;
            }
            else {
                return false;
            }
    }
    /** Return the number of digits in d */ 
    public static int getSize (long d) {
        int getSize = 0;

        while (d > 0) {
            d = d / 10;
            getSize++;
        }

        return getSize;
    }
    /** Return the first k number of digits from number. If the 
    *  number of digits in number is less than k, return number. */ 
    public static long getPrefix (long number, int k) { 
        if (getSize(number) < k) {
            return number;
        } 
        else {
            int size = (int)getSize(number);

            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }
        }
        return number;
    }
}