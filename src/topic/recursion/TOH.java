package topic.recursion;

import topic.utilities.GetValue;

public class TOH {
    static void toh_4rods(int discs, char start, char empty1, char empty2, char end) {
        if (discs == 1) {
            System.out.println("Move 1 from " + start + " to " + end);
            return;
        }
        toh_4rods((discs-2), start, empty1, empty2,
                end);
        System.out.println("Move disk " + (discs-1) + " from rod " + start + " to rod " + empty2);
        System.out.println("Move disk " + discs + " from rod " + start + " to rod " + end);
        System.out.println("Move disk " + (discs-1) + " from rod " + empty2 + " to rod " + end);
        toh_4rods((discs-2), empty1, end, start, empty2);

    }

    static void toh_3rods(int discs, char start, char empty, char end) {
        if (discs == 1) {
            System.out.println("Move 1 from " + start + " to " + end);
            return;
        }
        toh_3rods(discs - 1, start, end, empty);
        System.out.println("Move " + discs + " from " + start + " to " + end);
        toh_3rods(discs - 1, empty, start, end);
    }

    public static void main(String[] args) {
        TOH.toh_3rods(GetValue.scanInt("Enter number of discs,Here 3 stacks will be used:"), 'A', 'B', 'C');
    }
}
