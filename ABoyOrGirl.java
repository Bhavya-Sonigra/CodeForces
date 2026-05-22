import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABoyOrGirl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            set.add(input.charAt(i));
        }

        if(set.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }
    }
}