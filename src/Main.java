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
        switch (month){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.printf("%s is in the Winter season. \n", month );
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.printf("%s is in the Spring season. \n", month );
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.printf("%s is in the Summer season. \n", month );
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.printf("%s is in the Autumn season. \n", month );
                break;
        }
    }
    }