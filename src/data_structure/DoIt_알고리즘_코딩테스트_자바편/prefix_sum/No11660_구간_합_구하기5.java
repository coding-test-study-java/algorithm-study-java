package data_structure.DoIt_알고리즘_코딩테스트_자바편.prefix_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11660_구간_합_구하기5 {

	/**
	 * 슈도 코드 작성
	 * N(inputNumber) 선언 및 N * N 개의 수를 받을 numberArray[N + 1][N + 1] 선언
	 * 합 횟수를 받을 M(count) 변수 선언 및 입력 받음
	 * number 변수 크기 만큼 합한 결과를 저장할 합 배열 sumArray[N + 1][N + 1] 선언
	 *
	 * for(number 변수 크기 만큼 반복) {
	 * 	   for(number 변수 크기 만큼 반복) {
	 * 	   		numberArray[i][j]에 대상 값 저장
	 * 	   }
	 * }
	 *
     * for(number 변수 크기 만큼 반복) {
 	 * 	   for(number 변수 크기 만큼 반복) {
	 * 	       sumArray[i][j] = sumArray[i][j-1] + sumArray[i-1][j] - sumArray[i-1][j-1] + numberArray[i][j]
	 * 	   }
 	 * }
	 *
	 * for(count 변수 크기 만큼 반복) {
	 *   구간 범위 가로 시작 x1(startRangeWidth) 변수 선언 및 입력 받음
	 *   구간 범위 세로 시작 y1(startRangeHeight) 변수 선언 및 입력 받음
	 *   구간 범위 가로 끝 x2(endRangeWidth) 변수 선언 및 입력 받음
	 *   구간 범위 세로 끝 y2(endRangeHeight) 변수 선언 및 입력 받음
	 * 	 출력(sumArray[endRangeWidth][endRangeHeight] - sumArray[startRangeWidth - 1][endRangeHeight] - sumArray[endRangeWidth][startRangeHeight - 1] + sumArray[startRangeWidth - 1][startRangeHeight - 1]);
	 * }
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int inputNumber = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());

		int[][] numberArray = new int[inputNumber + 1][inputNumber + 1];
		int[][] sumArray = new int[inputNumber + 1][inputNumber + 1];

		for (int i = 1; i <= inputNumber; i++) {
			st = new StringTokenizer(bf.readLine());

			for (int j = 1; j <= inputNumber; j++) {
				numberArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= inputNumber; i++) {	// 구간 합 배열 구하기
			for (int j = 1; j <= inputNumber; j++) {
				sumArray[i][j] = sumArray[i - 1][j] + sumArray[i][j - 1] - sumArray[i - 1][j - 1] + numberArray[i][j];
			}
		}

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(bf.readLine());
			int startRangeWidth = Integer.parseInt(st.nextToken());
			int startRangeHeight = Integer.parseInt(st.nextToken());
			int endRangeWidth = Integer.parseInt(st.nextToken());
			int endRangeHeight = Integer.parseInt(st.nextToken());

			System.out.println(
				sumArray[endRangeWidth][endRangeHeight] - sumArray[startRangeWidth - 1][endRangeHeight] - sumArray[endRangeWidth][startRangeHeight - 1] + sumArray[startRangeWidth - 1][startRangeHeight - 1]
			);
		}
	}
}
