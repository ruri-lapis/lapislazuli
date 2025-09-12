package curriculum_B;

/**
 * 参考サイト
 * https://interuniversitylearning.com/archives/6040
 * 
 */

public class Qes4 {
	public static void main(String[] args) {
		 // 外側のfor文
		for (int out = 1; out <= 9; out++) {
			// 内側のfor文
			for (int in = 1; in <= 9; in++) { 
				// outとinの値をフォーマットして表示
				System.out.printf(" %s * %s = %s ||", formatNumber(out), formatNumber(in), formatNumber(out * in));
			}

			// 1行ごとに改行
			System.out.println(); 
		}
	}

	/**
	 * 1桁の数字に0を付けて2桁の文字列にフォーマットします。
	 * @param num フォーマットする数字
	 * @return 0を付けた文字列
	 */
	public static String formatNumber(int num) {
		return String.format("%02d", num);
	}
}