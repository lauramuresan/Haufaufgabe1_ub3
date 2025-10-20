import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BigNumbers bigNumbers = new BigNumbers();
        int[] number1 = {8,7,2,1,0,0};
        int[] number2 = {8,2,3,4,5,3};
        int[] finalSum = bigNumbers.sumBigNumbers(number1, number2);
        System.out.println("Sum big numbers : " + Arrays.toString(finalSum));
    }
}