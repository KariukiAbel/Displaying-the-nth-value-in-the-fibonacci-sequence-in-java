import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Input the a number and I will tell you it's value in the fibonacci sequence");
        int n = scan.nextInt();
        int v1 = 1;
        int result = 0, v2 = v1;

        for (int i = 0; i < n - 2; i++){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        System.out.println("The "+ n +"  value in the fibonacci sequence is " + (result == 0 ? 1 : result));
    }
}
