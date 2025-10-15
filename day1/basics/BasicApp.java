package day1.basics;

public class BasicApp {
    public static void main(String[] args) {
        //iteration
//        for (int i = 0; i<=10; i++) {
//            System.out.println(i);
//        }
        //recursiveFunction(10);
        fibonacciItr(90);
        //System.out.println(fibonacciRec(30));
    }

    /**
     * Where to use - Breaking problems down
     * This printing example is pretty pointless -
     * it's easier to use a for loop if you just want to print numbers.
     * Where recursion shines is when you use it to break down a problem into "subproblems",
     * whose solutions can then be combined to solve the original problem.
     */
    public static void recursiveFunction(int n) {
        if (n < 0) { //base case
            return;
        }
        recursiveFunction(n-1);
        System.out.println(n);
    }

    /**
     * @Fibonacci using iteration
     */
    public static void fibonacciItr(int n) {
        int prevNum = 0;
        int currNum = 1;
        //System.out.println(currNum);
        for(int i = 0; i <= n ; i = currNum){
            System.out.print(i + " ");
            int temp = prevNum+currNum;
            currNum = temp;
            prevNum = i;
        }
    }

    public static int fibonacciRec(int n) {

        if(n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
}
