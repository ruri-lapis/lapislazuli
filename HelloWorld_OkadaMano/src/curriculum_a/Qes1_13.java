package curriculum_a;

public class Qes1_13 {

	public static void main(String[] args) {
		//		1-1 下記9個をローカル変数として宣言
		//		バイト型
		byte one;
		//		短整数型
		short twe;
		//		整数型
		int three;
		//		長整数型
		long four;
		//		単精度浮動小数点数型
		float five;
		//		倍精度浮動小数点数型
		double six;
		//		文字型
		char seven;
		//		文字列型
		String eight;
		//		ブーリアン型
		boolean nine;

		//		1-2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化する
		//		バイト型　初期値
		one = 0;
		//		短整数型　初期値
		twe = 0;
		//		整数型　初期値
		three = 0;
		//		長整数型　初期値
		four = 0L;
		//		単精度浮動小数点数型　初期値
		five = 0.0f;
		//		倍精度浮動小数点数型　初期値
		six = 0.0d;
		//		文字型　初期値
		seven = '\u0000';
		//		文字列型　初期値
		eight = null;
		//		ブーリアン型　初期値
		nine = false;

		//		1-3 初期化をしたそれぞれの変数に値を代入する
		//		バイト型　代入
		one = 10;
		//		短整数型　代入
		twe = 100;
		//		整数型　代入
		three = 1000;
		//		長整数型　代入
		four = 10000;
		//		単精度浮動小数点数型　代入
		five = 9.5f;
		//		倍精度浮動小数点数型　代入
		six = 10.5;
		//		文字型　代入
		seven = 'a';
		//		文字列型　代入
		eight = "ハロー";
		//		ブーリアン型　初期値
		nine = true;
		//		1-4 コンソール出力する
		//		コンソールに「11110」と出力する
		System.out.println(one + twe + three + four);
		//		コンソールに「20」と出力する
		System.out.println(one + one);
	}

}
