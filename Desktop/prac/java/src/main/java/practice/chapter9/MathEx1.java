package practice.chapter9;

import static java.lang.Math.round;

public class MathEx1 {
    public static void main(String[] args) {
        double val = 89.4281;

        System.out.println("round(" + val + ")=" + round(val));
        val *= 100;

        System.out.println("round(" + val + ")=" + round(val));
        System.out.println("round(" + val + "/100)=" + round(val) / 100);
        System.out.println("round(" + val + "/100.0)=" + round(val) / 100.0);

    }
}
