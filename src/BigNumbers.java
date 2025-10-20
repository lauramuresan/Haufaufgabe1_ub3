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
    }

