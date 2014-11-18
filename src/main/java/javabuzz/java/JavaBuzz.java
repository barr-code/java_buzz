package javabuzz.java;

public class JavaBuzz {
    public boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    public boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    public boolean isDivisibleByFifteen(int number) {
        return isDivisibleBy(number, 15);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public String says(int number) {
        if(isDivisibleByFifteen(number)) return "JavaBuzz";
        if(isDivisibleByThree(number)) return "Java";
        if(isDivisibleByFive(number)) return "Buzz";
        else return Integer.toString(number);
    }
}
