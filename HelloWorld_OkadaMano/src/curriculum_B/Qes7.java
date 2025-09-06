package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents;

        // 生徒の人数を入力する（2人以上）
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            numStudents = scanner.nextInt();
        } while (numStudents < 2);

        // 各生徒の各科目の点数を入力してもらう
        int[][] scores = new int[numStudents][4];
        String[] subjects = {"英語", "数学", "理科", "社会"};

        // 各生徒の成績を入力する
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "人目の成績を入力してください。");
            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 各生徒の平均点を計算して出力する
        double totalOverallScore = 0;
        for (int i = 0; i < numStudents; i++) {
            double studentTotal = 0;
            for (int j = 0; j < 4; j++) {
                studentTotal += scores[i][j];
            }
            double studentAverage = studentTotal / 4.0;
            System.out.printf("%d人目の平均点は%.2f点です。%n", (i + 1), studentAverage);
            totalOverallScore += studentTotal;
        }

        // 各教科の平均点を計算して出力する
        for (int j = 0; j < 4; j++) {
            double subjectTotal = 0;
            for (int i = 0; i < numStudents; i++) {
                subjectTotal += scores[i][j];
            }
            double subjectAverage = subjectTotal / numStudents;
            System.out.printf("%sの平均点は%.2f点です。%n", subjects[j], subjectAverage);
        }

        // 全体の平均点を計算して出力する
        double overallAverage = totalOverallScore / (numStudents * 4);
        System.out.printf("全体の平均点は%.2f点です。%n", overallAverage);

        scanner.close();
    }
}