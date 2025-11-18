// 実行用ファイル
package animal;

public class Animaltest {

	public static void main(String[] args) {
		// ライオンの「実物」を作成
		// インスタンス化する（Animalを実行するコードlionを作る）
		// Animal:クラス名　lion:インスタンス名　new Animal:実物を作り出す命令
		// ①プログラムがanimalクラスを見てlionという名前の空っぽのライオンの箱（インスタンス）を作る
		Animal lion = new Animal();

		// setterを使って情報を設定
		// ②ライオンの箱（lion）に向かって、「名前をセットする係（setName）を呼んで！『ライオン』という情報を渡して！」と命令する
		lion.setName("ライオン");
		// ④体長をセットする係（setLength）が呼ばれ、「2.1m」を length スペースに書き込む
		lion.setLength(2.1);
		// ⑤速度をセットする係（setSpeed）が呼ばれ、「80km/h」を speed スペースに書き込む
		lion.setSpeed(80);

		// 情報の表示
		//	⑥ライオンの箱に向かって、「情報全体を表示する係（displayInfo）を動かして！」と命令する
		lion.displayInfo();
	}
}
