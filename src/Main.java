import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var sc = scanner.nextLine();

        int[] arr = new int[Integer.parseInt(sc)];

        var secondInput = scanner.nextLine();

        String[] inputInArray = secondInput.split(" ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(inputInArray[i]);

        }
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0 ; i--) {

            arr[i] = arr[i - 1];
            
        }

        arr[0] = last;

        System.out.println(Arrays.toString(arr).replaceAll("[\\[|\\]|,]", ""));

    }
}