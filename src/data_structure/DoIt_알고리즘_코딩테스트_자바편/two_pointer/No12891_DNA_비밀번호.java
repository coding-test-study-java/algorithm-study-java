package data_structure.DoIt_알고리즘_코딩테스트_자바편.two_pointer;

public class No12891_DNA_비밀번호 {
	/**
	 * 손으로 풀기
	 * 최초 문자열 값을 담을 S배열을 선언한다.
	 * check 배열에 A C G T의 최소 개수 내용을 저장한다.
	 * 그런 뒤 S배열의 탐색 범위를 0 ~ P까지 잡는다.
	 * 해당 범위 내에서 반복하면서 현재 배열에 문자열 개수를 각각 업데이트 한다.
	 * 탐색 범위가 끝나면 범위를 우측으로 한 칸 미뤄 1 ~ P + 1까지 잡는다.
	 * 해당 범위 내에서 반복하면서 현재 배열에 문자열 개수를 각각 업데이트 한다.
	 * 단, 범위 내에서 빠진 문자는 개수를 빼고, 새롭게 범위에 들어온 문자는 더해야 한다.
	 *
	 * 현재 배열과 check 배열을 비교해 요구사항과 맞는 수의 개수를 출력
	 */

	/**
	 * 슈도 코드 작성
	 * dnaStringLength 변수 선언 및 입력 받기
	 * P(point) 선언 및 입력 받기
	 * S(inputStringArray) [dnaStringLength] 선언
	 * checkArray[4] 선언
	 * passwordArray[4] 선언
	 * 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수 checkString 선언
	 * result 변수 선언
	 *
	 * S(inputString) 선언 및 입력 받기
	 *
	 * 반복문(i=0 ~ 3 까지(A, C, G, T 개수가 4닌까) {
	 *     checkArray[]에 값 입력
	 * }
	 *
	 * 반복문(i=0 ~ P 까지) {
	 *     (inputString(DNA 문자열 입력 받기) 생성)
	 * }
	 *
	 * 반복문(i=P까지 inputStringArray 보다 작을 때까지) {
	 *   removal = i - point; (슬라이딩 윈도우에서 제외된 범위 인덱스)
	 *   inputString()
	 * }
	 *
	 * inputString(inputString[i] 문자열) {
	 *     if (DNA 문자 == A 라면) {
	 *         inputStringArray[0] ++;
	 *         if (
	 *     } else if (DNA 문자] == C 라면) {
	 *         inputStringArray[1] ++;
	 *     } else if (DNA 문자] == G 라면) {
	 *         inputStringArray[2] ++;
	 *     } else {
	 *         inputStringArray[3] ++;
	 *     }
	 * }
	 */
}
