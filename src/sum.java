import java.util.Random;
import java.util.Scanner;

/*
 * 더달?
 */
public class sum {
	public static void main(String[] args) {
		// 두자리의 수가 나오는 랜덤 하나 만들고
		// 또 만들고(두개를 만든다)
		// 그 두개를 더한 값이랑
		// 사용자에게 정답을 물어보고
		// 맞으면 맞다 틀리면 틀리다
		Random rand = new Random();
		int a = rand.nextInt(89) + 10;
		int b = rand.nextInt(89) + 10;
		for (;;) {
			System.out.print(a + "와" + b + "를 더한 값은 ? >");
			Scanner san = new Scanner(System.in);
			int sum = san.nextInt();
			if (sum == a+b) {
				System.out.println("정답을 맞추셨습니다.");
				break;
			} else {
				System.out.println("틀리셨습니다.");
			}
			
		}

	}
}
