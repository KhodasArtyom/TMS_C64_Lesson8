import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
    }

    public static double getAverageMean(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пустой");
        } else {
            double result = 0;

            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                result = sum / array.length;
            }
            System.out.println("Массив: " + Arrays.toString(array));
            System.out.println("Среднее арифметическое значение элементов этого массива: ");
            return result;
        }
    }


    public static void reverseTheArray(int[] array) {
        System.out.println("Развернутый массив: ");
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int findIndexFirstOccurrence(int[] array, int number) {

        System.out.println("Массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findSubArray(int[] array, int index1Inclusive, int index2NotInclusive) {
        if (array.length <= 0 && index1Inclusive < 0 && index2NotInclusive > array.length) {
            throw new IllegalArgumentException("Ошибка.Неверно заданные параметры");
        } else {

            int[] subArray = new int[index2NotInclusive - index1Inclusive];
            for (int i = 0; i < subArray.length; i++) {
                subArray[i] = array[index1Inclusive + i];
            }
            System.out.println(Arrays.toString(subArray));
            return subArray;
        }

    }

    public static int[] getElementsFromPage(int[] currentArray, int page, int elementsOnPage) {

        if (currentArray.length == 0) {
            throw new IllegalArgumentException("Ошибка. Здесь нет элементов");
        }

        if (page < 1) {
            throw new IllegalArgumentException("Такой страницы не существует ");
        }


        int index1 = (page - 1) * elementsOnPage;
        int index2 = index1 + elementsOnPage;

        if (index2 > currentArray.length) {
            index2 = currentArray.length;
        }
        System.out.println("Массив: " + Arrays.toString(currentArray));
        System.out.print("Страница " + page + "-> ");
        return findSubArray(currentArray, index1, index2);


    }
}









