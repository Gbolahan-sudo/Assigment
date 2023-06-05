package SnackArray;
import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] questions = new String[20][2];
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println(name);
        questions[0][1] = "A. expand energy,enjoy groups";
        questions[1][1] = "B. conserve energy, enjoy one-on-one";
        questions[2][0] = "A. interpret literally";
        questions[2][1] = "B. look for meaning and possibilities";
        questions[3][0] = "A. logical, thinking, questioning";
        questions[3][1] = "B. empathetic, feeling, accommodating";
        questions[4][0] = "A. organized, orderly";
        questions[4][1] = "B. flexible, adaptable";
        questions[5][0] = "A. more outgoing, think out loud";
        questions[5][1] = "B. more reserved, think to yourself";
        questions[6][0] = "A. practical, realistic, experiential";
        questions[3][1] = "B. imaginative, innovative, theoretical";
        questions[7][0] = "A. candid, straight forward, frank";
        questions[7][1] = "B. tactful, kind, encouraging";
        questions[8][0] = "A. plan, schedule";
        questions[8][1] = "B. unplanned, spontaneous";
        questions[9][0] = "A. seek many tasks, public activities, interaction with others";
        questions[9][1] = "B. seek private, solitary activities quiet to concentrate";
        questions[10][0] = "A. standard, usual, conventional";
        questions[10][1] = "B. different, novel, unique";
        questions[11][0] = "A. firm, tend to criticize, hold the line";
        questions[11][1] = "B. gentle, tend to appreciate, conciliate";
        questions[12][0] = "A. regulated, structured";
        questions[12][1] = "B. easy-going, live and let live";
        questions[13][0] = "A. external, communicative, express yourself";
        questions[13][1] = "B. internal, reticent, keep to yourself";
        questions[14][0] = "A. focus on here-and-now";
        questions[14][1] = "B. look to the future, global perspective, big picture";
        questions[15][0] = "A. tough-minded, just";
        questions[15][1] = "B. tender-hearted, merciful";
        questions[16][0] = "A. preparation, plan ahead";
        questions[16][1] = "B. go with the flow, adapt as you go";
        questions[17][0] = "A. active, initiate";
        questions[17][1] = "B. reflective, deliberate";
        questions[18][0] = "A. facts, things, what is";
        questions[18][1] = "B. ideas, what cold be, philosophical";
        questions[19][0] = "A. matter of fact, issue-oriented";
        questions[19][1] = "B. sensitive, people-oriented, compassionate";
        questions[0][0] = "A. control, govern";
        questions[0][1] = "B. latitude, freedom";

        String[][] ans = new String[20][2];
        for (int index = 0; index <= questions.length; index++) {
            for (int count = 0; count <= 2; count++) {
                System.out.printf("%s ", questions[index][count]);
            }

        }

    }
}

