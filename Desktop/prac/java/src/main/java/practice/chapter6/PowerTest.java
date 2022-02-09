package practice.chapter6;


import java.util.Scanner;


// x^1 ~ x^n 까지의 합
class PowerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int result =0;

        for(int i=1; i<=n;i++){
            result += power(x,i);
        }

        System.out.println("x = " + x);
        System.out.println("n = " + n);
        System.out.println("result = " + result);
    }


    static int power(int x, int n){
        if(n==1) return x;
        else return x * power(x,n-1);
    }
}
