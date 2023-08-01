package data_structure.코드_트리.Sort;

import java.io.*;
import java.util.*;

public class Q_선택_정렬_구현 {
	public static void main(String[] args) {
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
			long n = Long.parseLong(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long[] numbers = new long[(int) n];

			for (int i = 0; i < n; i++) {
				numbers[i] = Long.parseLong(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				int min = i;

				for (int j = i + 1; j < n; j++) {		// 최소값 찾기
					if (numbers[j] < numbers[min]) {
						min = j;
					}
				}

				if (numbers[i] > numbers[min]) {
					long temp = numbers[i];
					numbers[i] = numbers[min];
					numbers[min] = temp;
				}
			}

			for (int i = 0; i < n; i++) {
				System.out.print(numbers[i] + "\t");
			}

		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
