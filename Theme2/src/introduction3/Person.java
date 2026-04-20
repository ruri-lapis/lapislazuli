package introduction3;

public class Person {
	//インスタンス変数を作る　※フィールド・メンバ変数などとも呼ぶ
	//	staticがつかないので、インスタンスフィールドとも呼ぶ
	//	カウント系は初期値を０に設定すると良い
	//	staticがつくので場合はクラスフィールドと呼ぶ
	private static int count = 0;
	private String firstName;
	// 問題１の解答部分
	private String lastName;
	private int age;
	private double height, weight;

	// 以下｛｝内の一塊をコンストラクタと呼ぶ
	// Mainのnew Personに書かれた情報と意味を一致させている
	// Mainから渡された情報と、下の変数の順番は一致しないといけない
	Person(String firstName, int age, double height, double weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//	問題２の解答部分
	//	()の中身を仮引数と呼ぶ
	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		// 問題２の解答部分
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問題３の解答部分
		Person.count++;
	}

	// 以下コード群をメソッドと呼ぶ
	//	苗字と名前を結合して扱うメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	//	得られた情報を以下の形式で表示させるメソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	//	BMIを計算するメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//	Personの数を数えて表示させるメソッド
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	public void buy(Car car) {
		// Carクラスのインスタンス「car」の所有者を「person1」にする
		// car.setOwner(person1.fullName());
		// buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		// ownerの所有者をcarにする
		// セッターとゲッターはセットで使うこと
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}