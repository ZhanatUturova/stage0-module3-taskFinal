package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number % 10;
        int second = number % 100 / 10;
        int third = number % 1000 / 100;
        int fourth = number % 10000 / 1000;
        System.out.println(first + second + third + fourth);
    }
}
