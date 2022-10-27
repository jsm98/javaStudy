
public class 반복문_중첩for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (6-i == j || i == j) {
					System.out.print("★");
				}
				else
					System.out.print("☆");
			}
			System.out.println();
		}
	}

}
/*
i = 1, j = 5
i = 2, j = 4
i = 3, j = 3
i = 4, j = 2
 */

