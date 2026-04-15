package introduction2;

//クラス名を作る
public class Person {
	//インスタンス変数を作る　※フィールド・メンバ変数などとも呼ぶ
	//	staticがつかないので、インスタンスフィールドとも呼ぶ
	private String name;
	private int age;
	private double height;
	private double weight;

	//	staticがつくので、クラスフィールドと呼ぶ
	public static int count = 0;

	//人を増やしても対応できるように情報の記録場所を作る
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 人が増えるたびに人数を数える
		// ※クラス全体で管理しているcountを1増やすともいう
		Person.count++;
	}

	// 問題４・５の解答部分
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	//	BMIを計算して返すメソッドを作る
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//	名前と年齢を表示するメソッドを作る
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
}