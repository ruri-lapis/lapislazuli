package curriculum_B;

// 参考サイト　https://freejava.site/top/l2/s3

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作る
		Scanner scanner = new Scanner(System.in);

		// 入力欄を作る
		System.out.print("ユーザー名: ");

		// 入力を受け取る
		String userName = scanner.nextLine();

		//名前が10文字以上入力された場合に以下の文章を出す
		if (userName.length() > 10) {
			System.out.print("名前を10文字以内にしてください ");
		}
		//文字が入力されていない、または空文字が入力された場合に以下の文章を出す
		else if (userName.isBlank()) {
			System.out.print("名前を入力してください");
		}

		//半角文字が入力された場合に以下の文章を出す
		else if (userName.matches("^[a-zA-Z0-9]+$")) {
			// ユーザー名登録のメッセージの後に改行
			System.out.println("ユーザー名「 " + userName + "」を登録しました ");

			// Randomオブジェクトを作成し、ランダムな手を生成する
			Random random = new Random();

			// じゃんけんの手を表す文字列の配列を作成
			String[] choices = { "グー", "チョキ", "パー" };

			// じゃんけんを行った合計回数をカウントする変数
			int totalGames = 0;

			// ゲームの繰り返しを制御するフラグを初期化
			boolean playAgain = true;

			// ユーザーが勝つまでゲームを繰り返す
			while (playAgain) {
				// じゃんけんの回数をカウント
				totalGames++;

				// ユーザーに手を入力してもらう
				System.out.print("じゃんけんの手を入力してください（グー: 0, チョキ: 1, パー: 2）: ");
				int userChoice = scanner.nextInt();

				// コンピューターの手をランダムに選ぶ
				int computerChoice = random.nextInt(3); // 0から2のランダムな整数を生成

				// 自分の手を表示
				System.out.println(userName + "の手は「" + choices[userChoice] + "」 ");

				// コンピューターの手を表示
				System.out.println("相手の手は「" + choices[computerChoice] + "」 ");

				// 勝敗の判定を行う
				if (userChoice == computerChoice) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				} else {
					// 自分が勝った場合の条件を設定する
					boolean userWins = (userChoice == 0 && computerChoice == 1) ||
							(userChoice == 1 && computerChoice == 2) ||
							(userChoice == 2 && computerChoice == 0);

					// 自分が勝った場合
					if (userWins) {
						System.out.println("やるやん。次は俺にリベンジさせて");

						// 自分が勝った場合の合計回数を表示
						System.out.println("勝つまでにかかった合計回数は" + totalGames + "回です");
						playAgain = false;

					}

					// 相手が勝った場合、手の入力まで戻ってじゃんけんを繰り返す
					else if (userChoice == 1 && computerChoice == 0) {
						System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");

					} else if (userChoice == 2 && computerChoice == 1) {
						System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");

					} else if (userChoice == 0 && computerChoice == 2) {
						System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
					}
				}
			}

		}

		//名前入力をする場合の条件をどれも満たさない場合に以下の文章を出す
		else {
			System.out.println("半角英数字のみで名前を入力してください");
		}
	}
}
