import java.util.Scanner;

public class AWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long count = s.chars().filter(Character::isUpperCase).count();
        if(count <= Math.floor(s.length() / 2)){
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toUpperCase());
        }
    }
}