import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// 숫자 범위로 부터 스트림 얻기

public class StreamTest05 {
	
	static int result = 0;
	public static void main(String[] args) {
		/*
		 IntStream 하위의 rangeClosed(int a, int b) 메소드를 활용해서 1부터 100까지 순차적으로 제공하는 스트림
		 객체를 생성한 다음 해당 자연수의 누적합을 구해서 출력 누적합을 구할 때 메서드 인자값으로 람다식을 사용해야 한다.
		 */
		
		IntStream is = IntStream.rangeClosed(1, 100);
		
		is.forEach(value -> result += value);
		
		System.out.println(result);
		
		
		int totoal = 0;
		// 문제2) 일반 for 반복문을 활용해서 51부터 100까지의 누적합 구하기
		int result2 = 0;
		for(int j = 51; j <= 100; j++) {
			result2 += j;
		}
		System.out.println(result2);
	
		System.out.println("\n-------------------------");
		
		result2 = 0;
		List<Integer> numList = new ArrayList<>();
		// 일반 for반복문을 1 부터 100 가지 반복 하면서 Math.random() 메소드르르 활용해서 1 부터 10시아ㅣ의 임의의 난수를 100번 발생해서 컬렉션 numList에 추가한 다음 난수 누적합을 구해서 출력해보고
		// numList컬렉션과 향상된 확장 for반복문을 활용해서 컬레션 원소의 누적합을 구해서 각각 출력해 본다 
		int tt = 0;
		for(int i = 0; i <= 100; i++) {
			int a = (int)((Math.random() * 10) + 1);
			numList.add(a);
			tt += a;
		}
		System.out.println(tt);
		
		int tt2 = 0;
		for(int i:numList) { // 향상딘 for문 or each문
			tt2 += i;
		}
		System.out.println(tt2);
	}
}































