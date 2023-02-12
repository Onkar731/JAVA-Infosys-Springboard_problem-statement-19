import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // finding profit or loss using findProfitOrLoss() method of ProfitLoss class
        System.out.println(ProfitLoss.findProfitOrLoss(values.get(0), values.get(1)));

        // closing resource
        sc.close();
    }
}
