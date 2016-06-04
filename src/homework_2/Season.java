package homework_2;

/*
        4. Написать программу(метод), который сообщает нам время года,
        в зависимости от передаваемого номера месяца.
        Например, мы передаем в метод 3, а он нам пишет "Весна"
*/


public class Season {

    public static void main(String[] args) {
        int month = 8;

        String season = getSeasonByMonth(month);
        System.out.println(season);
    }

    public static String getSeasonByMonth(int month) {

        boolean monthCheck = validateMonth(month);

        if (monthCheck) {

            if (month >= 1 && month <= 2 || month == 12) {
                return "Winter";
            } else if (month >= 3 && month <= 5) {
                return "Spring";
            } else if (month >= 6 && month <= 8) {
                return "Summer";
            } else if (month >= 9 && month <= 11) {
                return "Fall";
            }

        }
        return "***Month is incorrect***";
    }

    public static boolean validateMonth(int month) {
        if (month >= 1 && month <= 12) {
            return true;
        }
        return false;
    }



}
