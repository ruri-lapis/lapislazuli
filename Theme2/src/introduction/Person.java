package introduction;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	// ★ クラス共通の「黒板」！ここに人数の合計を記録する
	private static int count = 0;

	//    2 １でもらった情報を（）内の引数で受け取る
	public Person(String name, int age, double height, double weight) {
		//    	3 引数（右のname）で受け取った情報を左のnameに記録する
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 4  新しい人が作られるたびに、合計人数を1増やす
		Person.count++;
	}

	// 10 合計人数を表示させる
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	//    6 3で記録した情報を下の形式にしたがって表示させる
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		//        7 bmiメソッドを呼び出して表示させる
		System.out.println("BMIは" + this.bmi() + "です");
	}

	//    8 ３で記録した体重と身長をもとにBMIを計算して、結果を7に返す
	public double bmi() {
		return Math.floor(this.weight / (this.height * this.height) * 100) / 100;
	}
}