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
// 実行ファイル
package execution;

// processingパッケージのProcessingクラスを呼び出す
import processing.Processing;

// クラス名をつける（頭は大文字にすること）
public class Execution {
	//	プログラムの始まりを決める
	public static void main(String[] args) {

		//    	Processingクラスの情報を使う場所ををExecutionクラスに新しく作り、入れる情報（引数）を指定する
		//    	一番右のProcessing：クラスの指定　次のｐrocessing：右の処理の名前（変数）
		//    	new Processing：Processingクラスに情報を加えて作るという意味
		Processing processing = new Processing("こんにちは！ここは日本です！", "この寿司はうまい", "寿司は和食です");

		//        上のprocessingの情報を加えてgetFullMessageを実行する。処理の名前はoutputMessageにする
		//        String：文字列という意味　outputMessage：右の処理の名前（変数）
		//		＝：右の処理を左の変数に入れる
		//        processing：上のprocessing　getFullMessage：Processingクラスで作ったメソッド
		String outputMessage = processing.getFullMessage();

		//        コンソールにoutputMessageで実行した結果を出す
		System.out.println(outputMessage);
	}
}