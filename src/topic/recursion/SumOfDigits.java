package topic.recursion;

import topic.utilities.GetValue;

public class SumOfDigits {
    static int sum(int n) {
        if (n < 10) return n;
        return sum(n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        int n = (int) GetValue.scanDouble("Enter number for sum of didts");
        System.out.println(sum(n)   );
    }
}
