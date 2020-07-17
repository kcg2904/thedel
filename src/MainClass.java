import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("메인클래스");
//		MyClass myClass = new MyClass();
//		MyClass mc1 = null;
//		System.out.println(mc1);
//		myClass.bob();
//		myClass.food();
//		myClass.nono();
//		MyClass2 mc2 = new MyClass2();
//		mc2.m1();
//		mc2.m2();
//		MyClass3 mc3 = new MyClass3();
//		int i = mc3.r1();
//		System.out.println("r1에서 받은 int 데이터 : " + i);
//		String s = mc3.r2();
//		System.out.println(s+" hi");
		
		// 클래스 만들고 메소드를 만들기
		// 더달의 기능을 별도로 만들어서
		// 더하기를 출력해주는 메소드
		// 더하기의 답을 전달해주는 메소드
		// 메인에서 메소드만 이용해서 출력또는 
		// 답을 비교
		Sum1 sum1 = new Sum1();
//		int a = sum1.Num1();
//		int sum = sum1.userNum(); 
//		do {
//			System.out.print("틀렸다. 다시 입력하세요. > ");
//			sum = sum1.userNum();
//		} while (!sum1.ox(a, sum));	
//		System.out.println("맞습니다.");	
		
		ArrayList<Integer> list = sum1.rnd2NumList();
		System.out.println("첫번째 리스트의 값 : " + list.get(0));
		System.out.println("두번째 리스트의 값 : " + list.get(1));
		
		int hap = sum1.hap(list.get(0), list.get(1));
		
		System.out.println(hap);
		
	}
}
