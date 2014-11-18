package javabuzz.java;

public class JavaBuzz {
    public boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    public boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
