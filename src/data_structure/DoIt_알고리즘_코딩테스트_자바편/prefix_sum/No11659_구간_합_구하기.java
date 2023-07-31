package data_structure.DoIt_알고리즘_코딩테스트_자바편.prefix_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11659_구간_합_구하기 {
	/**
	 * 손으로 풀어보기
	 * 입력:
	 * 5 3
	 * 5 4 3 2 1 (5 9 12 14 15)
	 * 1 3
	 * 2 4
	 * 5 5
	 *
	 * 출력:
	 * 12
	 * 9
	 * 1
	 *
	 * ① N 개의 수를 입력 받음과 동시에 합 배열 생성
	 * ② 구간 i ~ j를 통해 구간 합 구하는 공식 (Sum[j] - Sum[i - 1] (인텍스가 0부터 이기 때문에 i - 1)로 정답 구하기
	 */

	/**
	 * 슈도 코드 작성
	 * N 개의 수를 받을 number 변수 선언 및 입력 받음
	 * 합 횟수를 받을 M(count) 변수 선언 및 입력 받음
	 * number 변수 크기 만큼 합한 결과를 저장할 합 배열 sumArray[] 선언
	 *
	 * for(number 변수 크기 만큼 반복) {
	 *     sumArray[i]에 sumArray[i - 1] + 대상 값 저장
	 * }
	 *
	 * for(count 변수 크기 만큼 반복) {
	 *   구간 범위 시작 i(startRange) 변수 선언 및 입력 받음
	 *   구간 범위 끝 j(endRange) 변수 선언 및 입력 받음
	 * 	 출력(sumArray[endRange] - sumArray[startRange - 1])
	 * }
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// bufferReader()로 입력 받으면 라인 단위로 읽게 되는데, 공백과 같은 기준으로 문자열 분리를 위해 사용. 즉, 분리된 문자열을 토큰으로 보고, 하나의 문자열을 여러 토큰으로 분리.
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long number = Long.parseLong(st.nextToken());
		long count = Long.parseLong(st.nextToken());
		// sumArray에 값을 넣을 때, 반복문이 1부터 시작되야 하기 때문에 배열 크기를 number 보다 1 큰 크기로 만듬.
		long[] sumArray = new long[(int)number + 1];

		st = new StringTokenizer(bf.readLine());

		for (int i = 1; i <= number; i++) {		// sumArray에 값을 넣기 위한 반복문 i - 1 연산이 있기 때문에 반복문 시작을 1로 시작
			sumArray[i] = sumArray[i - 1] + Long.parseLong(st.nextToken());
		}

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(bf.readLine());

			long startRange = Long.parseLong(st.nextToken());
			long endRange = Long.parseLong(st.nextToken());

			System.out.println(sumArray[(int) endRange] - sumArray[(int) startRange - 1]);
		}
	}
}
