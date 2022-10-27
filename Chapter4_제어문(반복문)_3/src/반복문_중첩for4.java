import java.util.Scanner;

public class 반복문_중첩for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		
		char a = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
				a++;
				}
			System.out.println();
		}
		/*
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("★");
					}

				}
			System.out.println();
		}
		
		System.out.println();
		
		char a = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(a);
					a++;
					}

				}
			System.out.println();
		}
		
		System.out.println();
		
		a = 'A';
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(a);
					}
				}
				a++;
			System.out.println();
		}
		*/
		

	}
}