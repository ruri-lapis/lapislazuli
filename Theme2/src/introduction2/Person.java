package introduction2;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	public static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
}