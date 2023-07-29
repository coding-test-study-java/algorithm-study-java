package data_structure.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2018_수들의_합5 {
	/**
	 * 손으로 풀어보기
	 * 입력: 15
	 *
	 * 출력: 4
	 *
	 * ① N 개의 수를 입력 받고, 합을 저장할 sum, 시작점, 끝점, count 변수 선언
	 * ② SUM과 N이 같지 않을 때까지 반복
	 *   - SUM이 N 보다 작다면 끝점 우측으로 한 칸 이동하고, SUM 변수에 끝점이 가르키는 인덱스 속성 값 더하여 저장.
	 *   - SUM이 N 보다 크다면 시작점 우측으로 한 칸 이동하고, SUM 변수에 시작점이 가르키는 인덱스 속성값을 빼 저장.
	 *   - SUM과 N이 같다면 끝점 우측으로 한 칸 이동하고, SUM 변수에 끝점이 가르키는 인덱스 속성값 저장 및 count에 1 증가
	 * ③ count 출력
	 */

	/**
	 * 슈도 코드 작성
	 * N(inputNumber) 선언 및 입력 받기
	 * sum, startPointer, endPointer, count 변수 선언 및 초기화
	 * while (sum이 N과 같지 않을 때까지) {
	 *     if (만약 SUM과 N이 같다면?) {
	 *         endPointer 우측으로 한 칸 이동
	 *         sum 변수에 endPointer가 가르키는 속성값 더하여 저장
	 *         count 변수 1 증가
	 *     } else if (아니고, SUM이 N 보다 크다면?) {
	 *         startPointer 우측으로 한 칸 이동
	 *         sum 변수에 startPointer가 가르키는 속성값 빼서 저장
	 *     } else (N이 SUM 보다 크다면?) {
	 *         endPointer 우측으로 한 칸 이동
	 *         sum 변수에 endPointer가 가르키는 속성값 더하여 저장
	 *     }
	 * }
	 * 출력 (count)
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		long inputNumber = Long.parseLong(st.nextToken());
		long sum = 1L;
		long startPointer = 1L;
		long endPointer = 1L;
		int count = 1;				// 자기 자신 하나로 이뤄진 경우의 수(무조건 있기 때문에)를 위해 1로 초기화

		while (inputNumber != endPointer) {
			if (sum == inputNumber) {
				endPointer++;
				sum += endPointer;
				count++;
			} else if (sum > inputNumber) {
				sum -= startPointer;
				startPointer++;
			} else {
				endPointer++;
				sum += endPointer;
			}
		}

		System.out.println(count);
	}
}
