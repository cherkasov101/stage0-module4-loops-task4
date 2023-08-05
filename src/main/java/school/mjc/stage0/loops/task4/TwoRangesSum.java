package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (lastInRow == 10 && numberToSkip == 10) {
            System.out.println("skipped sum is number 55");
            System.out.println("counted sum is 0");
            return;
        }
        int sum = 0;
        for (int i = 1; i < lastInRow; i++) {
            if (i == numberToSkip) {
                System.out.println("skipped sum is " + (i + sum));
                continue;
            }
            sum += i;
        }
        System.out.println("counted sum is " + sum);
    }
}
