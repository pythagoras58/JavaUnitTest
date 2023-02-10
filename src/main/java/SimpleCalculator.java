import java.util.Random;

public class SimpleCalculator {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        SimpleCalculator s = new SimpleCalculator();

        var res = s.addNum(num1, num2);
        System.out.println("Num1 -> " + num1);
        System.out.println("Num2 -> " + num2);
        System.out.println("Output -> {}" + res);


    }

    public int addNum(int numA, int numB){
        return numA+numB;
    }
}
