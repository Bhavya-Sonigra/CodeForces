import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AHelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(Stream.of(input.split("\\+"))
        .sorted()
        .collect(Collectors.joining("+"))
    );
    }
}