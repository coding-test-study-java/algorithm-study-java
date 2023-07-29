package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1546_평균문제 {
	/**
	 * 손으로 풀어보기
	 * 입력: N = 3, M = 40, 80, 60
	 * 출력: 75.0
	 * ① 최대값 선택 = 80
	 * ② 각 과목 총점 연산 (40 + 80 + 60) = 180
	 * ③ 총 점수 / M * 100 연산
	 *    - 180 / 80 * 100 = 225
	 * ④ 평균 구하기: 225 / 3 = 75
	 */

	/**
	 * 슈도 코드 작성
	 * 변수 N(subjectNum)에 과목 수 받기
	 * 변수 M(subjectScore) 선언
	 * 최고 점수를 저장할 변수 maxScore 선언
	 * 모든 점수의 합 저장할 변수 scoreSum 선언
	 * 정답 변수 result 선언
	 * 길이가 N인 1차원 배열 score[] 선언
	 * for(scores[] 개수 만큼 반복) {
	 *     subjectScore 변수에 과목 점수 받기
	 *     scores[]에 subjectScore 변수 값 넣기
	 * }
	 *
	 * for(scores[] 개수 만큼 반복) {
	 * 	   scoreSum 에 score[i] 값 더하여 저장
	 *     if(scores[i]가 masScore 보다 큰지 비교) {
	 *         maxScore에 큰 값 저장
	 *     }
	 * }
	 *
	 * result 변수에 scoreSum / maxScore * 100 결과값 담아 반환
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int subjectNum = Integer.parseInt(bf.readLine());
		long maxScore = 0L;
		long scoreSum = 0L;
		int[] scores = new int[subjectNum];
		String[] scoreTokens = bf.readLine().split(" ");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = Integer.parseInt(scoreTokens[i]);
		}

		for (int i = 0; i < scores.length; i++) {
			scoreSum += scores[i];

			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		System.out.println((scoreSum / (double) maxScore * 100) / subjectNum);
	}
}
