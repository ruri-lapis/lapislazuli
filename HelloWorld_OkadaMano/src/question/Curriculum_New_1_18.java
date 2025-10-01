package question;

import java.util.Random;

/**
 * 参考
 * gemini
 * https://www.sejuku.net/blog/39709　オーバーロードについて
 * https://www.useful-lab.com/archives/5486　戻り値とは何か
 */

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void printHello(String message, int number) {
        System.out.println("Hello JavaSE 11");
    }
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください	
    public static void kakezan(int out,int in) {
    	 System.out.println(out*in);
	}
    
   
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
    public static void printArrayElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
    public static void kakezan(double out, double in) {
        System.out.println(out + in);
    }
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    public static int[] randomnumnum(int count) {
        // Randomクラスのインスタンスを生成
        Random random = new Random();
        
        // ランダムな整数を格納する配列を、引数countのサイズで初期化
        int[] randomNumbers = new int[count];
                
        // 指定された回数分、ループを実行
        for (int i = 0; i < count; i++) {
            int randomNumber;
            do {
                // 1～100までのランダムな整数を生成
                randomNumber = random.nextInt(100) + 1;
            } while (randomNumber == 0); // 0は含めないようにする
            
            // 生成したランダムな整数を配列に格納
            randomNumbers[i] = randomNumber;
        }
        
        // 格納した配列を返す
        return randomNumbers;
    }
    
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
    public static double calculateAndPrintAverage(int[] numbers) {
    	// 配列の要素数が0の場合は平均値として0.0を返却
    	if (numbers.length == 0) {
    		System.out.println("要素が0のため平均値は計算できません。");
    		return 0.0;
    	}
    	
    	// 合計値を格納する変数を初期化
    	long sum = 0; 
    	
    	// 配列の全要素を合計
    	for (int number : numbers) {
    		sum += number;
    	}
    	
    	// 平均値を計算（小数点以下を表示するため、計算時にdouble型にキャスト）
    	double average = (double) sum / numbers.length;
    	
    	// 結果（平均値のみ）をコンソールに出力
    	System.out.println("要素の平均値: " + average);
    	
    	// 平均値を返す
    	return average;
    }
    
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static boolean checkAverageOver50(double average) {
    	// 平均値が50以上か判定
    	boolean isOver50 = average >= 50.0;
    	
    	// コンソールに出力
    	System.out.println("平均値が50以上である: " + isOver50);
    	
    	// 結果を返す
    	return isOver50;
    }
    
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
//		Q1
		printHello("Hello", 11);
		
//		Q2
//		outに4を入れて、inに50を入れる
		kakezan(4,50);
		
//		Q3
		// 整数型の配列を定義する
        int[] myArray = {10, 20, 30, 40, 50};

        // メソッドを呼び出し、上で決めた配列を引数として渡す
        printArrayElements(myArray);
//        Q4
            // オーバーロードされたメソッドを呼び出す
            kakezan(0.5, 0.5);
//        Q5
         // メソッドを呼び出し、返り値を受け取る
            int[] result = randomnumnum(5);
            
            // 返された配列の要素を出力
            for (int number : result) {
                System.out.println(number);
            }
//            Q6
            double averageValue = calculateAndPrintAverage(result);
            
//     		Q7
            // ※この例では返り値を受け取っていますが、要件の「返しコンソールに出力」はQ7メソッド内で完結しています。
            boolean checkResult = checkAverageOver50(averageValue);
            
            
        }

}
