package basicClass;

/**
 * 参考サイト
 * gemini
 * https://www.furikatu.com/2025/08/java-class.html　クラスの書き方
 * https://www.javadrive.jp/start/var/index2.html　変巣の宣言方法
 * https://qiita.com/Daichi_Lemon/items/cd702839765d799a74a5　クラス・メソッド・フィールドについて
 */

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	int quantity;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

	//	 代入するものを並べる
	public Dog(String name, int quantity) {
		//  名前を代入する箇所を作成する
		this.name = name;
		// 数を代入する箇所を作成する
		this.quantity = quantity;
	}

}