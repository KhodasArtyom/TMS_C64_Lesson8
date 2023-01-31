import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список задач:\n" +
                " 1.Task1\n " +
                "2.Task2\n" +
                " 3.Task3\n " +
                "4.Task4\n " +
                "5.Task5\n " +
                "6.Task6");
        System.out.print("Выбери задачу из списка,нажми соответствующую " +
                "кнопку и посмотри ее реализацию. Нажми: 1-6 или нажми 0 для выхода. \n");
        while (scanner.hasNextInt()) {
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("введи параметр");
                    int parameter = scanner.nextInt();
                    DateTimeUtils.findHighAltitudeYear(parameter);
                    break;
                case 2:
                    System.out.println("Введи длину массива");
                    double result = ArrayUtils.getAverageMean(UserInputUtils.requestNewArray(scanner.nextInt()));
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Введи длину массива");
                    ArrayUtils.reverseTheArray(UserInputUtils.requestNewArray(scanner.nextInt()));
                    break;
                case 4:
                    System.out.println("Введите длину массива");
                    int lenArray = scanner.nextInt();
                    int[] array = UserInputUtils.requestNewArray(lenArray);
                    System.out.println("Введите искомое число");
                    int searchingNumber = scanner.nextInt();
                    int searching = ArrayUtils.findIndexFirstOccurrence(array, searchingNumber);
                    System.out.println(searching);
                    break;
                case 5:
                    System.out.println("Вывод подмассива от(включительно) и до(невключительно)");
                    System.out.println("Создаем массив. Введите длину массива:");
                    int lenArray2 = scanner.nextInt();
                    int[] array2 = UserInputUtils.requestNewArray(lenArray2);
                    System.out.println(Arrays.toString(array2));
                    System.out.println("введите индекс ОТ");
                    int index1 = scanner.nextInt();
                    System.out.println("введите индекс До");
                    int index2 = scanner.nextInt();
                    int[] subArray = ArrayUtils.findSubArray(array2, index1, index2);
                    break;
                case 6:
                    System.out.println("Введите длину массива");
                    int leng = scanner.nextInt();
                    int[] array3 = UserInputUtils.requestNewArray(leng);
                    System.out.println(Arrays.toString(array3));
                    System.out.println("Введите № страницы: ");
                    int numberOfPage = scanner.nextInt();
                    System.out.println("Введите количество элементов, которые вы хотите видеть на странице");
                    int numberOfElementsOnPage = scanner.nextInt();
                    ArrayUtils.getElementsFromPage(array3, numberOfPage, numberOfElementsOnPage);
                    break;
                case 0:
                    System.out.println("До свидания. Спасибо, что использовали мою программу");
                    System.exit(0);

            }
        }
    }
}
