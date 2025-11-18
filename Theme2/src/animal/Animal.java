/*
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 */

// 処理用ファイル
package animal;

//Animal.java
public class Animal {
	// 情報を入れる箱（フィールド）を作る
	//動物名を入れる、nameという箱（変数）を作る
	private String name;
	// 体長を入れる箱を作る
	private double length;
	// 速度を入れる箱を作る
	private int speed;

	// setter: 情報を入れる係
	public void setName(String name) {
		// this.name は「このクラスのname箱」という意味
		//	thisで指定したnameに名前の情報を入れる
		//	③名前をセットする係（setName）が呼ばれ、渡された情報「ライオン」を、ライオンの箱の中のnameという小さなスペース（フィールド）に書き込む
		//	nameという小さなスペース（フィールド）＝17行目のprivate String name;
		this.name = name;
	}

	//	thisで指定したlengthに体長の情報を入れる
	public void setLength(double length) {
		//	④-2名前をセットする係（setName）が呼ばれ、渡された情報「ライオン」を、ライオンの箱の中のlengthという小さなスペース（フィールド）に書き込む
		this.length = length;
	}

	//	thisで指定したsppedに速度の情報を入れる
	public void setSpeed(int speed) {
		//	⑤-2名前をセットする係（setName）が呼ばれ、渡された情報「ライオン」を、ライオンの箱の中のspeedという小さなスペース（フィールド）に書き込む
		this.speed = speed;
	}

	// getter: 情報を取り出す係
	public String getName() {
		// name箱に入っている情報をこのメソッド（今回はAnimaltest）を呼び出した場所に返す
		//	⑧名前を取り出す係（getName）が呼ばれ、箱の中の「ライオン」という情報を取り出し、それをステップ7で呼び出した場所（this.getName()という文字があった場所）に返します。
		return this.name;
	}

	// length箱に入っている情報をこのメソッドを呼び出した場所に返す
	public double getLength() {
		return this.length;
	}

	// speed箱に入っている情報をこのメソッドを呼び出した場所に返す
	public int getSpeed() {
		return this.speed;
	}

	// 情報全体を表示する係
	public void displayInfo() {
		//	⑦表示係（displayInfo）が動きます。まず「動物名：」を出力しようとしますが、その後に「名前を取り出す係（getName）を呼んで！」と、自分で命令します。
		//	⑨返された情報「ライオン」を使って、画面に「動物名：ライオン」と表示されます。体長と速度も同じように、それぞれgetLength()、getSpeed()が呼ばれて情報が表示されます。
		System.out.println("動物名：" + this.getName());
		System.out.println("体長：" + this.getLength() + "m");
		System.out.println("速度：" + this.getSpeed() + "km/h");
	}
}