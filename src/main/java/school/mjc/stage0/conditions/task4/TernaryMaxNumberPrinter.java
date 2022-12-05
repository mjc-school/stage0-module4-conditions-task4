package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int one = first > second ? first : second;
        int two = second > third ? second : third;
        System.out.println(one > two ? one : two);
    }
}
