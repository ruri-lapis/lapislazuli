package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        商品名を入力する
        System.out.println("商品名を入力してください（複数ある場合は「、」で区切ってください）:");
        String input = scanner.nextLine();
        String[] products = input.split("、");

     // テレビの在庫数を変数にする
        int tvStock = 0; 

        for (String product : products) {
        	// 前後の空白を削除する
            product = product.trim(); 
            String message;
//            商品の在庫数を変数にする
            int remainingStock = 0;

//            商品名とパターンを作る
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                	// 0〜11のランダムな数字を入れる
                    remainingStock = random.nextInt(12); 
                    message = String.format("%sの残り台数は%d台です", product, remainingStock);
                    break;
                case "テレビ":
                    remainingStock = random.nextInt(12);
                 // テレビの在庫数を確認する
                    tvStock = remainingStock; 
                    message = String.format("%sの残り台数は%d台です", product, remainingStock);
                    break;
                case "ディスプレイ":
                	// テレビの数字に併せて在庫数を決める
                    remainingStock = (tvStock > 0) ? 11 - tvStock : random.nextInt(12); 
                    message = String.format("%sの残り台数は%d台です", product, remainingStock);
                    break;
                default:
//                	指定の商品名以外を入れた場合、下のメッセージを表示する
                    message = String.format("『 %s 』は指定の商品ではありません", product);
                    break;
            }
            
//            メッセージを表示する
            System.out.println(message);
        }
        scanner.close();
    }
}