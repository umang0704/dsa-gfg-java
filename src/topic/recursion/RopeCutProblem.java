package topic.recursion;

import topic.utilities.GetValue;

public class RopeCutProblem {
    static double max3(double a, double b, double c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    static int maxCuts(int rope, int a, int b, int c) {
        if (rope == 0) return 0;
        if (rope < 0) return -1;
        int res = (int) max3(maxCuts(rope - a, a, b, c), maxCuts(rope - b, a, b, c), maxCuts(rope - c, a, b, c));
        if (res == -1) return -1;
        return (res + 1);

    }

    public static void main(String[] args) {
        int ropeLength = GetValue.scanInt("Enter rope Length");
        int a = GetValue.scanInt("Enter a:");
        int b = GetValue.scanInt("Enter b");
        int c = GetValue.scanInt("Enter c");
        System.out.println(maxCuts(ropeLength, a, b, c));
    }
}
