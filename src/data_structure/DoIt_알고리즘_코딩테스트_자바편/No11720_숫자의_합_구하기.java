package data_structure.DoIt_알고리즘_코딩테스트_자바편;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720_숫자의_합_구하기 {
	/**
	 * 손으로 풀어보기
	 * 입력: N = 5, 두번째 줄 54321
	 * 출력: 15
	 * ① 숫자의 개수만큼 입력 받은 값을 문자열로 저장
	 * ② 문자열형으로 입력 받은 값을 문자[]로 변환하여 저장
	 * ③ 반복문을 통해 문자 배열의 값을 정수로 변환
	 * ④ 각 배열의 정수 더하여 출력
	 */

	/**
	 * 슈도 코드 작성
	 * 숫자 개수 N(nNum) 변수 선언 및 숫자 개수 입력 받음
	 * 공백 없이 문자열 숫자 받을 inputStringNumber 변수 선언 및 숫자 입력 받음
	 * 모든 합을 저장할 result 변수 선언
	 * 문자 배열 inputCharNumbers[] 선언하고, 문자열 변수를 문자 배열에 넣어줌(.toCharArray() 사용)
	 * for (nNum 까지 반복) {
	 *     문자 배열값에 -48 (아스키코드를 이용한 문자 정수 변경)을 하여 result 변수에 더하여 저장
	 * }
	 *
	 * result 변수 출력
	 */

	public static void main(String[] args) throws IOException {
		long result = 0L;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int nNum = Integer.parseInt(bf.readLine());
		String inputStringNumber = bf.readLine();

		char[] inputCharNumbers = inputStringNumber.toCharArray();

		for (int i = 0; i < nNum; i++) {
			result += inputCharNumbers[i] - 48;
		}
		System.out.println(result);
	}
}
