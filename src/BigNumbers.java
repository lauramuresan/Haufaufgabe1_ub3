import java.util.Arrays;

public class BigNumbers {

    public int[] sumBigNumbers(int[] number1, int[] number2) {
        int lenNumber = number1.length;
        int[] sum_array = new int[lenNumber + 1];
        int sum_morethan_10 = 0;
        for (int i = lenNumber - 1; i >= 0; i--) {
            int sum = number1[i] + number2[i] + sum_morethan_10;
            sum_array[i + 1] = sum % 10;
            sum_morethan_10 = sum / 10;
        }
        sum_array[0] = sum_morethan_10;
        if (sum_array[0] == 0) {
            return Arrays.copyOfRange(sum_array, 1, sum_array.length);
        } else {
            return sum_array;
        }
    }

    public int[] diffBigNumbers(int[] number1, int[] number2) {
        int lenNumber = number1.length;

        for (int i = 0; i < lenNumber; i++) {
            if (number1[i] > number2[i]) {
                break;
            } else if (number1[i] < number2[i]) {
                throw new IllegalArgumentException("first number must be greater than or equal to second number");
            }
        }

        int[] diff_array = new int[lenNumber];
        int borrow = 0;
        for (int i = lenNumber - 1; i >= 0; i--) {
            int diff = number1[i] - borrow - number2[i];
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            diff_array[i] = diff;
        }
        int start = 0;
        while (start < diff_array.length - 1 && diff_array[start] == 0) {
            start++;
        }

        int end = diff_array.length - 1;
        while (end > start && diff_array[end] == 0) {
            end--;
        }

        return Arrays.copyOfRange(diff_array, start, end + 1);
    }

    public int[] mulBigNumbers(int[] number1, int number2) {
        int lenNumber = number1.length;
        if (number2 < 0 || number2 > 9)
            throw new IllegalArgumentException("second number must be between 0 and 9");
        int[] mul_array = new int[lenNumber + 1];
        int carry = 0;

        for (int i = lenNumber - 1; i >= 0; i--) {
            int prod = number1[i] * number2 + carry;
            mul_array[i + 1] = prod % 10;
            carry = prod / 10;
        }
        mul_array[0] = carry;

        if (mul_array[0] == 0) {
            return Arrays.copyOfRange(mul_array, 1, mul_array.length);
        } else {
            return mul_array;
        }
    }

    public int[] DivBigNumbers(int[] number1, int number2) {
            int lenNumber = number1.length;
            int[] div_arr = new int[lenNumber];
            int remainder = 0;

            for (int i = 0; i < lenNumber; i++) {
                int cur = remainder * 10 + number1[i];
                div_arr[i] = cur / number2;
                remainder = cur % number2;
            }
            int startIndex = 0;
            while (startIndex < lenNumber - 1 && div_arr[startIndex] == 0) {
                startIndex++;
            }
            return Arrays.copyOfRange(div_arr, startIndex, lenNumber);
        }

}


