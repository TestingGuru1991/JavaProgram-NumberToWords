public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(345);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println(("Invalid Value"));
        } else {
            int reversedNumber = reverse(number);
            String word = "";
            int digit = 0;
            int loop = getDigitCount(number);

            while (loop > 0) {
                digit = reversedNumber % 10;

                switch (digit) {
                    case 0:
                        word = word + "Zero ";
                        break;
                    case 1:
                        word = word + "One ";
                        break;
                    case 2:
                        word = word + "Two ";
                        break;
                    case 3:
                        word = word + "Three ";
                        break;
                    case 4:
                        word = word + "Four ";
                        break;
                    case 5:
                        word = word + "Five ";
                        break;
                    case 6:
                        word = word + "Six ";
                        break;
                    case 7:
                        word = word + "Seven ";
                        break;
                    case 8:
                        word = word + "Eight ";
                        break;
                    default:
                        word = word + "Nine ";
                        break;

                }

                loop = loop - 1;
                reversedNumber = reversedNumber / 10;
            }
            System.out.println(word);
        }
    }

    public static int reverse(int number) {
        int reveresed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reveresed*=10;
            reveresed+=lastDigit;
            number/=10;

        }
        return reveresed;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int num = number;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
