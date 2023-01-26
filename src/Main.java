public class Main {


    public static void main(String[] args) {
        whichSeason(Month.JANUARY);
        whichSeason(Month.MAY);
        whichSeason(Month.OCTOBER);
        whichSeason(Month.DECEMBER);
        whichSeason(Month.APRIL);
        whichSeason(Month.JULY);

    }

    public static void whichSeason(Month month){
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> System.out.printf("%s is in the Winter season. \n", month);
            case MARCH, APRIL, MAY -> System.out.printf("%s is in the Spring season. \n", month);
            case JUNE, JULY, AUGUST -> System.out.printf("%s is in the Summer season. \n", month);
            case SEPTEMBER, OCTOBER, NOVEMBER -> System.out.printf("%s is in the Autumn season. \n", month);
        }
    }
    }