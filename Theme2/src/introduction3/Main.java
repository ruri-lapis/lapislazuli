package introduction3;

public class Main {
	public static void main(String[] args) {

		// 下のPersonは、public class PersonのPersonだった！
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//　コード１のpublic void print()を呼び出して上の情報を表示させる
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();
	}
}

//　カウントの情報を受け渡す順番
//　１．コード２で情報群を作る
//　２，public class PersonのPerson.count++;でカウントする
//　３，public class MainのPerson.printCount();でカウントした数を表示させる
//　４，数を表示させるときにpublic class Personのpublic static void printCount()を使う