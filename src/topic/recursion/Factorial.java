package topic.recursion;


public class Factorial {
    static int factorial_TailRecursion(int n,int val){
        if (n==0)  return val;
        return factorial_TailRecursion(n-1,n*val);
    }

    static int factorialRecursion(int n){
        if(n==0)    return 1;
        else return n*factorialRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursion(2));
        int val = 1;
        val=factorial_TailRecursion(5,val);
        System.out.println(val);
    }
    public static double getDist(int x1,int y1,int x2,int y2) {
    	double X = (x1-x2)*(x1-x2);
    	double Y = (y1-y2)*(y1-y2);
    	return Math.sqrt(X+Y);
    }
//    public static int honey(int input1, int input2, int[][] input3,int[][] input4,int[] input5,int input6) {
//		int ct = 0;
//		for(int i = 0 ; i < input4.length;)
//	}
}