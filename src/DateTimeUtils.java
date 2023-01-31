public class DateTimeUtils {
    public static void main(String[] args) {
         findHighAltitudeYear(2001);


    }

    public static boolean findHighAltitudeYear(int year) {
        if(year <=0) {
            throw new IllegalArgumentException("Такого года не существует");
        }
        boolean isAttitude = false;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год " + year + " имеет 366 суток в  году и  является высокостным");
            isAttitude = true;
        } else {
            System.out.println("Год " + year + " имеет 365 суток в  году и  не является высокостным");
        }
        return isAttitude;


    }

}
