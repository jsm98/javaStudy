import java.util.Scanner;

public class 반복제어문_3 {
	public static void main(String[] args) {
		
		int win = 0, lose = 0, same = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan);
		

		while(true) {
			int com = (int)(Math.round(0)*3);
			System.out.println("가위(0), 바위(1), 보(2) : ");
			int user = scan.nextInt();
			
			if (user < 0 || user > 2) {
				System.out.println("가위(0), 바위(1), 보(2)를 입력하세요.");
				continue; //처음부터 다시 실행 - while의 조건문으로 이동
				
			}
			count++;   
			
			if (com == 0)
				System.out.println("컴퓨터:가위");
			else if(com == 1)
				System.out.println("컴퓨터:바위");
			else if(com == 2)
				System.out.println("컴퓨터:보");
			
			if (user == 0)
				System.out.println("사용자:가위");
			else if(user == 1)
				System.out.println("사용자:바위");
			else if(user == 2)
				System.out.println("사용자1:보");
			
			switch(com-user) {
			case -1: case 2:
				System.out.println("사용자 Win");
				win++;
				break;
			case -2: case 1:
				System.out.println("컴퓨터 Win");
				lose++;
				break;
			case 0:
				System.out.println("비겼다");
				same++;
			}
			System.out.println("게임을 종료 할까요?(y/n) : ");
			char c = scan.next().charAt(0); //문자 한개 받기
			if (c == 'y' || c == 'Y') {
				System.out.println("Game Over!!");
				break;
			}
		}
		System.out.printf("%d전 %d승 %d무 %d패\n",count, win, same, lose);
	}
}
