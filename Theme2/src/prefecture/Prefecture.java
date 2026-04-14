/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */

package prefecture;

//都道府県データを扱うテンプレを作る
public class Prefecture {
	String name; // 都道府県名
	String city; // 県庁所在地
	double area; // 面積

	//    都道府県データを用意するときの必要な要素を指定する
	public Prefecture(String name, String city, double area) {
		this.name = name;
		this.city = city;
		this.area = area;
	}

	//    都道府県データの中の名前を答える機能
	public String getName() {
		// name箱に入っている情報をこのメソッド（今回は  ）を呼び出した場所に返す
		return this.name;
	}

	// 都道府県データの中の県庁所在地を答える機能
	public String getCity() {
		// city箱に入っている情報をこのメソッドを呼び出した場所に返す
		return this.city;
	}

	//	 都道府県データの中の面積を答える機能
	public double getArea() {
		// area箱に入っている情報をこのメソッドを呼び出した場所に返す
		return this.area;
	}

	//	都道府県データを表示させる用の機能
	public void displayInfo() {
		//		表示する形式を指定する
		System.out.println("都道府県名：" + this.getName());
		System.out.println("県庁所在地：" + this.getCity());
		System.out.println("面積：" + this.getArea() + "㎢");
	}

}
