package introduction3;

public class Main {
	public static void main(String[] args) {

		// 下のPersonは、public class PersonのPersonだった！
		// person1のインスタンスを作成している
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//　コード１のpublic void print()を呼び出して上の情報を表示させる
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();

		// インスタンスを作る
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// Carクラスのインスタンス「car」の所有者を「person1」にする
		car.setOwner(person1.fullName());
		// Bicycleクラスのインスタンス「bicycle」の所有者を「person2」にする
		bicycle.setOwner(person2.fullName());

		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// person1のインスタンスから buy メソッドを呼び出し、引数に car を渡す
		person1.buy(car);
		// person2のインスタンスから buy メソッドを呼び出し、引数に bicycle を渡す
		person2.buy(bicycle);

	}
}

//　カウントの情報を受け渡す順番
//　１．コード２で情報群を作る
//　２，public class PersonのPerson.count++;でカウントする
//　３，public class MainのPerson.printCount();でカウントした数を表示させる
//　４，数を表示させるときにpublic class Personのpublic static void printCount()を使う

// 参照先が参照元を所有する？