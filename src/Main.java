public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));


    }

    public static boolean isPalindrome(int num){
        int original_num = num;
    int reversed_num =0;
    while(num!=0) {
        int last_digit = num % 10;
        reversed_num = reversed_num * 10 + last_digit;
        num /= 10;

    }
    if(original_num == reversed_num) {
        return true;
    }
    return false;
    }


    public static boolean isPerfectNumber(int num){
    if (num< 0){
        return false;
    }
    int sum = 0;
    for (int i = 1; i<num; i++){
        if (num % i == 0){
            sum = sum +i;
        }
    }
        return sum == num;

    }

    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String text = " ";
        //String[] words = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for (char digit: digits){
            switch (digit){
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }

        }
        return text.trim();
    }

}