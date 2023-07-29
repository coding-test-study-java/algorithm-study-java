package data_structure.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1940_주몽의_명령 {
	/**
	 * 손으로 풀어보기
	 * 아래 방식은 최초 정렬(nlogn)을 사용하고, 투 포인터 (2개의 반복문 2N = N)에 시간 복잡도를 갖는데, nlogn이 N보다 느리고, 최악의 경우 nlogn의 시간 복잡도를 갖는다.
	 * 제한 시간이 2초(2억번 이내 연산)이고, N이 최대 15,000개이다.
	 *
	 * N개의 숫자가 들어오면 해당 숫자들의 합이 M과 같은게 몇번 있는지 찾는 문제
	 * 최초 오름차순 정렬을 통해 투 포인터를 쓸 수 있게 준비한다.
	 * 정렬이 완료되면 투 포인터를 통해 연산한다.
	 *   - 투 포인터 이동 원칙
	 *   A[i] + A[j] > M 이면 j를 감소
	 *   A[i] + A[j] < M 이면 i를 증가
	 *   A[i] + A[j] == M 이면 i 증가, j 감소, count 1 증가
	 */

	/**
	 * 슈도 코드 작성
	 * N(inputNumber), M(numberSum), sum 선언 및 입력 받기
	 * 임의의 숫자 입력 받기 (문자열로 받고, 정수로 변환)
	 * 배열 속성 값 오름차순 정렬하기
	 * while (startRange < endRange) {
	 *     if (sum < numberSum) {
	 *         작은 번호 재료 한 칸 우측 이동
	 *     } else if (sum > numberSum) {
	 *         큰 번호 재료 한 칸 좌측으로 이동
	 *     } else {
	 *         count 증가, 작은 번호 재료 한 칸 우측으로 이동, 큰 번호 재료 좌측으로 이동
	 *     }
	 * }
	 * 출력(count)
	 */

	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
			long inputNumber = Long.parseLong(bf.readLine());
			long numberSum = Long.parseLong(bf.readLine());
			long count = 0L;

			long[] numberArray = new long[(int)inputNumber];

			StringTokenizer st = new StringTokenizer(bf.readLine());

			for (int i = 0; i < inputNumber; i++) {
				numberArray[i] = Long.parseLong(st.nextToken());
			}

			for (int i = 0; i < inputNumber - 1; i++) {		// 버블 정렬
				for (int j = 0; j < inputNumber - 1 - i; j++) {
					if (numberArray[j] > numberArray[j + 1]) {
						long temp = numberArray[j];
						numberArray[j] = numberArray[j + 1];
						numberArray[j + 1] = temp;
					}
				}
			}

			long startRange = 0L;
			long endRange = inputNumber - 1;

			while (startRange < endRange) {
				if (numberArray[(int)startRange] + numberArray[(int)endRange] < numberSum) {
					startRange++;
				} else if (numberArray[(int)startRange] + numberArray[(int)endRange] > numberSum) {
					endRange--;
				} else {
					count++;
					startRange++;
					endRange--;
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
