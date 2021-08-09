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
}