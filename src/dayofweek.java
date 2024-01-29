public class dayofweek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DateUtil <month> <day> <year>");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            int dayOfWeek = dayOfWeek(month, day, year);
            System.out.println("Day of the week: " + dayOfWeek);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }

    public static int dayOfWeek(int month, int day, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        return d0;
    }
}
