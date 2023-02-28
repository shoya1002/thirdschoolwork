package RaisetechThirdScloolwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaisetechThirdScloolwork {
	public static void main(String[] args) {

		while (true) {
			Scanner scan = new Scanner(System.in);

			try {
				System.out.print("年齢を入力してください。＞");
				int age = scan.nextInt();
				System.out.println("あなたの年齢は" + age + "ですね。");
				scan.close();
				break;

			} catch (InputMismatchException e) {
				System.out.println("年齢は整数で入力してください。");
				e.printStackTrace();

			}

		}
	}

}
