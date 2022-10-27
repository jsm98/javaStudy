/*
 * 	반복제어문
 * 	- 반복문 종료 : break;
 * 	- 특정부분을 제거 : continue;
 *  * 주의점
 *  	break;
 *  	continue; - 밑에는 소스 코딩을 할 수 없다
 *  ---------------------------------------------
 *  	break; - 반복문, 선택문에서만 사용 가능 - 제어문 종료
 *  	continue; - 반복문이 있는 경우에만 사용이 가능 - 제외하고 다음 반복문 수행
 *  
 *  	while() {
 *  		break; - 중단
 *  	}
 *  	for () {
 *  		break; - 중단
 *  	}
 *  
 *  	while(조건식) {
 *  		continue; - 조건식으로 이동
 *  	} 	
 *  
 *  	for (초기값; 조건식; 증가식) {
 *  		continue; - 증가식으로 이동
 *  	}
 *  
 *  	break - 문장 종료
 *  	System.exit(0) - 프로그램 종료
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		System.out.println();
		
		int i = 1;
		
		while(i <= 100) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
			i++;
		}
	}

}
