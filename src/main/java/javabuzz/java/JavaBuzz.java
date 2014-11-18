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
    String say = String.valueOf(number);
        if(isDivisibleByThree(number)){
            say = "Java";
        }
        if(isDivisibleByFive(number)) {
            say = "Buzz";
        }
        if(isDivisibleByFifteen(number)) {
            say = "JavaBuzz";
        }
        return say;
    }
}
