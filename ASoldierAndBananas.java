import java.util.Scanner;

public class ASoldierAndBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

       long result = k * (w*(w+1)/ 2);
       System.out.println(Math.max(0,result - n));
    }
}