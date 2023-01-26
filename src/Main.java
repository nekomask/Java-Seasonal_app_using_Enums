public class Main {


    public static void main(String[] args) {


        whichSeason(-6);

    }

    public static void whichSeason(int month) {
        switch (month) {
            case 1:
                System.out.println("January falls in the Winter season");
                break;
            case 2:
                System.out.println("February falls in the Winter season");
                break;
            case 3:
                System.out.println("March falls in the Spring season");
                break;
            case 4:
                System.out.println("April falls in the Spring season");
                break;
            case 5:
                System.out.println("May falls in the Spring season");
                break;
            case 6:
                System.out.println("June falls in the Summer season");
                break;
            case 7:
                System.out.println("July falls in the Summer season");
                break;
            case 8:
                System.out.println("August falls in the Summer season");
                break;
            case 9:
                System.out.println("September falls in the Autumn season");
                break;
            case 10:
                System.out.println("October falls in the Autumn season");
                break;
            case 11:
                System.out.println("November falls in the Autumn season");
                break;
            case 12:
                System.out.println("December falls in the Winter season");
                break;
            default:
                System.out.printf("%d is in invalid month", month);
                break;
        }


    }
}