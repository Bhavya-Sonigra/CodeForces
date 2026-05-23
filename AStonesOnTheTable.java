import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AStonesOnTheTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        ArrayList<Character> arr = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));

        int out = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i) == arr.get(i+1)){
                out++;
            }
        }

        System.out.println(out);
    }
}