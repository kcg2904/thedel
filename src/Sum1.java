import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sum1 {
	public int userNum() {
		Scanner san = new Scanner(System.in);
		int sum = san.nextInt();
		return sum;
	}
	
//	public int Num1() {
//		Random rand = new Random();
//		int a = rand.nextInt(89) + 10;
//		int b = rand.nextInt(89) + 10;
//		System.out.print(a + " 와 " + b + "를 더한 값은 ? > ");
//		return a+b;		
//	}
	
	public boolean ox(int a, int sum) {
			if (sum == a) {
				return true;
			}
			else {
				return false;
			}
			
	}
	public int[] rnd2Num() {
		Random rand = new Random();
		int  [] nums = new int[2];
		nums[0] = rand.nextInt(89) + 10;
		nums[1] = rand.nextInt(89) + 10;
		return nums;
	}
	public ArrayList<Integer> rnd2NumList() {
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(rand.nextInt(89) + 10);
		a.add(rand.nextInt(89) + 10);
		return a;
	}
	// 매개 변수로 받아서 더하기 값을 전달
	public int Num1() {
		Sum1 aa = new Sum1();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = aa.rnd2NumList();
		System.out.print(a.get(0) + "와 " + a.get(1) + "를 더한 값은 ? > ");
		return a.get(0)+a.get(1);		
	}
	public int hap(int a, int b) {
		return a +b;
		
	}
}
