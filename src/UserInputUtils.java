import java.util.Arrays;
import java.util.Scanner;

public class UserInputUtils {
    static int[] newArray;

    public static int[] requestNewArray(int arrayLength) throws IllegalArgumentException {

        Scanner scanner = new Scanner(System.in);
        newArray = new int[arrayLength];
        System.out.println("по очереди вводите элементы");

        for (int i = 0; i < newArray.length; i++) {
            int elements = scanner.nextInt();
            newArray[i] = elements;
        }
        System.out.println("Массив готов.Вывожу.....");

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = requestNewArray(3);


    }
}
