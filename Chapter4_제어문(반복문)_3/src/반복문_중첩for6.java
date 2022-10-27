import java.util.Scanner;

public class 반복문_중첩for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.print((char)(a+32));
				}
				else {
					System.out.print((char)a);	
				}

			}
			a++;
			
			System.out.println();
		}
		*/
		Scanner scan = new Scanner(System.in);
		
		int sum = scan.nextInt();
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == sum) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
			
		}
	}

}
