package introduction3;

public class Vehicle {
	private String owner;

//	戻り値は引数を使う？
//	get/setの次の語句はフィールド名を使う
//	問題３の解答部分
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}