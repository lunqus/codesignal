package centuryFromYear;

public class CenturyFromYearMain {

    int century(int year) {

        if (year % 100 == 0) {
            return year / 100;
        } else {
           return year / 100 + 1;
        }


    }


    public static void main(String[] args) {

        CenturyFromYearMain century = new CenturyFromYearMain();

        System.out.println(century.century(1999));
    }
}
