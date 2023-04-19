package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int x = number % 10 * 100 + number % 100 / 10 * 10 + number % 1000 / 100;
        System.out.println(x);
    }
}
