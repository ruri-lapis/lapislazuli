package prefecturetest;

//リスト式の情報を扱う用のコードその１
import java.util.ArrayList;
// ソート機能を使う用のコード
import java.util.Comparator;
// リスト式の情報を扱う用のコードその２
import java.util.List;
// キーボード入力をしてもらう用のコード
import java.util.Scanner;

// package prefectureのpublic class Prefectureとpublic Prefectureをインポートする用のコード
import prefecture.Prefecture;

// パッケージ名を決める
public class Prefecturetest {

	// コードを書き始めるためのメインメソッドを作る
	public static void main(String[] args) {
		// データを準備する
		String[] rawData = {
				"北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275",
				"宮城県:仙台市:7282", "秋田県:秋田市:11638", "山形県:山形市:9323",
				"福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362", "埼玉県:さいたま市:3798"
		};

		// 上のデータが使えるように準備する
		List<Prefecture> prefList = new ArrayList<>();
		// 塊になったデータを一つずつ分解する
		for (String line : rawData) {
			// ”：”を目印にしてデータを分解する
			String[] parts = line.split(":");
			// 分解したデータをpackage prefectureのpublic class Prefectureとpublic Prefectureに当てはまるように分類しなおす
			prefList.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
		}

		// キーボードの入力情報を受け取る
		Scanner scanner = new Scanner(System.in);

		// ① 番号を入力してもらう用の表示を作る
		System.out.println("表示したい番号をカンマ区切りで入力してください（例: 8,5,9）");
		// 入力された情報を受け取る
		String inputIds = scanner.nextLine();

		// ② ソートする順番を入力してもらう用の表示を作る
		System.out.println("昇順（小さい順）なら「1」、降順（大きい順）なら「2」を入力してください");
		// 入力された情報を受け取る
		int order = scanner.nextInt();

		// ③ 入力された番号を「数字のリスト」にする
		List<Integer> selectedIds = new ArrayList<>();
		// ”,”を目印にして入力情報をを分解する
		for (String idStr : inputIds.split(",")) {
			// 入力された数字を文字情報から数字に変換する
			selectedIds.add(Integer.parseInt(idStr.trim()));
		}

		// ④ 番号を並べ替える（ソート）
		// 選んだ数字が１の場合
		if (order == 1) {
			// 小さい順にする
			selectedIds.sort(Comparator.naturalOrder());
			// 昇順で並べたことを表示する
			System.out.println("--- 昇順で表示します ---");
			//            １を選ばなかった場合（２を選んだ場合）
		} else {
			// 大きい順にする
			selectedIds.sort(Comparator.reverseOrder());
			//          降順で並べたことを表示する
			System.out.println("--- 降順で表示します ---");
		}

		// ⑤ 並べ替えた番号の順番で、データを表示する
		for (int id : selectedIds) {
			// 入力した数字が０～１０の範囲内か確認する
			if (id >= 0 && id < prefList.size()) {
				// ①で受け取った数字に対応するリストの情報を表示する
				prefList.get(id).displayInfo();
				// 入力された数字に対応する結果を改行して表示する
				System.out.println();
			}
		}
		// 情報の入力を終了させる
		scanner.close();
	}
}