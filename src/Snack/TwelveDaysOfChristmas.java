package Snack;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        String[] songs = {
                "a Partridge in a Pear Tree",
                "Two Turtle Doves",
                "Three French Hens",
                "Four Calling Birds",
                "Five Golden Rings",
                "Six Geese a Laying",
                "Seven Swans a Swimming",
                "Eight Maids a Milking",
                "Nine Ladies Dancing",
                "Ten Lords a Leaping",
                "Eleven Pipers Piping",
                "Twelve Drummers Drumming"
        };

        String[] days = {
                "first", "second", "third", "fourth", "fifth",
                "sixth", "seventh", "eighth", "ninth", "tenth",
                "eleventh", "twelfth"
        };

        for (int i = 0; i < days.length; i++) {
            System.out.printf("On the %s day of Christmas\n", days[i]);
            System.out.println("My true love gave to me:");
            for (int j = i; j >= 0; j--) {
                System.out.print((j == 0 ? "and " : "") + songs[j]);
                System.out.println(j == 0 ? "." : ",");
            }
            System.out.println();
        }
    }
}