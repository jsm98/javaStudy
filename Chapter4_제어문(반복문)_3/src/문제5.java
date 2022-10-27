import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);
		
		for (int i = 1; i <= 10; i++) {
			if (ch == i) {
				System.out.println("true");
			}
		}
		

	}

}
