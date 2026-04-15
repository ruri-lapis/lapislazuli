package introduction2;

public class Main {
	//	コードを書き出す用のメソッドを作る
	public static void main(String[] argos) {
		// 情報源を２人分作る
		// ＝の右はインスタンスを作っている
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// Personの合計人数を数える
		// 問題６の解答部分
		Person.printCount();
		// System.out.printlnを使って合計人数を出力する
		// 問題３の解答部分
		System.out.println("合計" + Person.count + "人です");
	}
}
