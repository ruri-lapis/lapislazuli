package curriculum_a;

public class Qes1_13 {

	public static void main(String[] args) {
		// 1-1 下記9個をローカル変数として宣言
		// バイト型
		byte one;
		// 短整数型
		short twe;
		// 整数型
		int three;
		// 長整数型
		long four;
		// 単精度浮動小数点数型
		float five;
		// 倍精度浮動小数点数型
		double six;
		// 文字型
		char seven;
		// 文字列型
		String eight;
		// ブーリアン型
		boolean nine;

		// 1-2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化する
		// バイト型　初期値
		one = 0;
		// 短整数型　初期値
		twe = 0;
		// 整数型　初期値
		three = 0;
		// 長整数型　初期値
		four = 0L;
		// 単精度浮動小数点数型　初期値
		five = 0.0f;
		// 倍精度浮動小数点数型　初期値
		six = 0.0d;
		// 文字型　初期値
		seven = '\u0000';
		// 文字列型　初期値
		eight = null;
		// ブーリアン型　初期値
		nine = false;

		// 1-3 初期化をしたそれぞれの変数に値を代入する
		// バイト型　代入
		one = 10;
		// 短整数型　代入
		twe = 100;
		// 整数型　代入
		three = 1000;
		// 長整数型　代入
		four = 10000;
		// 単精度浮動小数点数型　代入
		five = 9.5f;
		// 倍精度浮動小数点数型　代入
		six = 10.5;
		// 文字型　代入
		seven = 'a';
		// 文字列型　代入
		eight = "ハロー";
		// ブーリアン型　代入
		nine = true;

		// 1-4 コンソール出力する
		// コンソールに「11110」と出力する
		System.out.println(one + twe + three + four);
		// コンソールに「20」と出力する
		System.out.println(one + one);
		// コンソールに「a ハロー true」と出力する
		System.out.println(seven + eight + nine);
		// コンソールに「11130」と出力する
		System.out.println(one + twe + three + four + one + one);
		// コンソールに「10000000000」と出力する
		System.out.println(one * twe * three * four);
		// コンソールに「0.105」と出力する
		System.out.println(six / twe);
		// コンソールに「-90」と出力する
		System.out.println(one - twe);

		// 1-5 コンソールに「ハローJAVA43」と表示させる
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		// 1-6 「山田太郎 18歳 170.5cm 62.2kg 寿司」という情報を使ってコンソールに自己紹介文を表示させる
		// 変数を定義する
		// 氏名
		String name = "山田太郎";
		// 年齢
		int age = 18;
		// 身長
		float height = (float) 170.5;
		// 体重
		float weight = (float) 62.2;
		// 食べ物
		String food = "寿司";

		// 代入する文章を書く
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");

		// 1-7 6で作成した自己紹介に続いてBMIが出力されるようにする
		// 体重(kg) ÷ (身長(m) × 身長(m))
		System.out.println("「BMIは" + weight / (height * height) * four + "です」｝");

		// 1-8 6で宣言した変数に再代入しコンソールに自己紹介文を表示させる
		name = "鈴木一郎";
		age = 24;
		height = (float) 168.5;
		weight = (float) 64.2;
		food = "オムライス";

		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		System.out.println("「BMIは" + weight / (height * height) * four + "です」｝");

		// 1-9  8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、コンソールに自己紹介文を表示させる
		name = "鈴木一郎";
		age = 24 * 2;
		height = (float) 168.5 * 2;
		weight = (float) 64.2 * 2;
		food = "オムライス";

		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + food + "です」");
		System.out.println("「BMIは" + weight / (height * height) * four + "です」｝");

		// 1-10 8で使用した年齢が25歳以上ならtrueが出力されるようにする
		boolean isOverTeenage; // boolean型の変数を宣言

		int age1 = 24; // あなたは24歳

		isOverTeenage = (age1 >= 25); // 【条件式】

		System.out.println(isOverTeenage);

		// 1-11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
		name = "鈴木一郎";
		age = 24 * 2;
		height = (float) 168.5 * 2;
		weight = (float) 64.2 * 2;
		food = "オムライス";

		String age11 = String.valueOf(24 * 2);

		String height1 = String.valueOf((float) 168.5 * 2);

		String weight1 = String.valueOf((float) 64.2 * 2);
		System.out.println(age11 + height1 + weight1);
		
        // 1-12 11で変換した【年齢・身長】を整数型に変換して出力する
		int num11 = Integer.parseInt(age11);
		System.out.println(num11);
		
		// stringをfloatにする
		// 変数に変換した値を入れる
		height=Float.valueOf(height1);
		// floatをintにして変数に入れる
		int num111 = (int) height;
		System.out.println(num111);

		// 1-13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
	    //ただしif文は使わないこと
		age=24;
		System.out.println(age>25);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
