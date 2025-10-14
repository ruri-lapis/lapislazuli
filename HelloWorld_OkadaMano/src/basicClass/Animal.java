package basicClass;

/**
 * 参考サイト
 * gemini
 * https://www.sejuku.net/blog/24848?utm_source=blog&utm_medium=blog&utm_campaign=blog__50913　カレンダー
 * https://www.sejuku.net/blog/20325?utm_source=blog&utm_medium=blog&utm_campaign=blog__24848　日付の形式
 * 
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog myDog = new Dog("ポチ", 1);
		System.out.println("犬の名前は" + myDog.name+"です");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println("数は" + myDog.quantity + "匹です");
		

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

        // 現在の日時を取得する
        LocalDateTime now = LocalDateTime.now();
        
        // 表示形式を「yyyy-MM-dd H:m:s」に指定する
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        
        // 日時を指定した形式で文字列に変換し、変数に代入する
        String formattedDateTime = now.format(formatter);
        
        // コンソールに出力する
        System.out.println("現在の日時: " + formattedDateTime);

		
	}
}
