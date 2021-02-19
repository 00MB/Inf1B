public class DateFashion {
    public static void main(String[] args) {
        int myStyle = Integer.parseInt(args[0]);
        int dateStyle = Integer.parseInt(args[1]);
        System.out.println(dateFashion(myStyle, dateStyle));
    }

    public static int dateFashion(int you, int date) {
        int score = 1;
        if (you < 3 || date < 3) {
            score = 0;
        } else if (you > 7 || date > 7) {
            score = 2;
        }
        return score;
    }
}
