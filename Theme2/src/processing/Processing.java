/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

// 処理ファイル
package processing;

//今の日時を計るコマンドを入れる
import java.time.LocalDateTime;
//日時を表す形式を指定するコマンドを入れる
import java.time.format.DateTimeFormatter;

//クラス名をつける（頭は大文字にすること）
public class Processing {
	// フィールド変数
	//	挨拶の言葉を入れる、greetingという箱（変数）を作る
	private String greeting;
	//    食べ物の感想を入れる、foodMessageという箱（変数）を作る
	private String foodMessage;
	//    食べ物の種類を入れる、foodTypeという箱（変数）を作る
	private String foodType;
	//    今の時間を入れる、currentDateという箱（変数）を作る
	private String currentDate;

	// コンストラクタ（クラスの中身を作る）の始まり
	//    実行ファイルのnew Processingの中に渡す場所（仮引数）を作って渡す順番を決める
	//	Processingという名前をつける（コンストラクタは、クラスと同じ名前を持つ）
	//	（）の中にはほかの場所からの情報を受け入れる場所を作る
	public Processing(String greeting, String foodMessage, String foodType) {
		//    	new Processingで指定された挨拶の言葉（右側）はgreetingという箱（左側）に入れる
		//		thisで左が変数ということを決める
		//		変数（左のgreeting）に最初の値（右のgreeting）を入れる＝初期化
		this.greeting = greeting;
		//        食べ物の感想はfoodMessageという箱に入れる
		this.foodMessage = foodMessage;
		//        食べ物の種類はfoodTypeという箱に入れる
		this.foodType = foodType;

		//		java.time.LocalDateTimeをnowという名前を付けて使う
		LocalDateTime now = LocalDateTime.now();
		//		java.time.format.DateTimeFormatterをformatterという名前をつけて使う
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//		nowとformatterで出した結果を、まとめてcurrentDateという箱に入れる
		this.currentDate = now.format(formatter);
		//		コンストラクタの終わり
	}

	// 戻り値をまとめて出す処理（メソッド）を作る
	//	メソッドはgetFullMessageという名前をつける
	public String getFullMessage() {
		//	greetingという箱に入れた言葉を出して改行する
		return greeting + "\n"
		//	foodMessageという箱に入れた言葉を出して改行する
				+ foodMessage + "\n"
				//	foodTypeという箱に入れた言葉を出して改行する
				+ foodType + "\n"
				//	緑の言葉をくっつけてcurrentDateという箱に入れた日時を出す
				+ "今の現在日時は" + currentDate + "です";
	}
}