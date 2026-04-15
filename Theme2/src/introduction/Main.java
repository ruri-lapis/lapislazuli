package introduction;

public class Main {
	public static void main(String[] args) {
		// 1 情報源を作る
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 5 person1の情報を表示させる指示をclass Personのpublic void print() に出す
		person1.print();

		// 9 合計人数を数える
		Person.printCount();
	}
}