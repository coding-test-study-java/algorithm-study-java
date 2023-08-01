package data_structure.코드_트리.Sort;

import java.io.*;
import java.util.*;

public class Q_삽입_정렬_구현 {

	public static void main(String[] args) {
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

			long n = Long.parseLong(bf.readLine());
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long[] numbers = new long[(int) n];

			for (int i = 0; i < n; i++) {
				numbers[i] = Long.parseLong(st.nextToken());
			}

			for (int i = 0; i < n; i++) {
				int insertPoint = i;
				long insertValue = numbers[i];

				for (int j = i - 1; j >= 0; j--) {
					if (numbers[j] < numbers[i]) {
						insertPoint = j + 1;
						break;
					}

					if (j == 0) {
						insertPoint = 0;
					}
				}

				for (int j = i; j > insertPoint; j--) {
					numbers[j] = numbers[j - 1];
				}

				numbers[insertPoint] = insertValue;
			}

			for (int i = 0; i < n; i++) {
				System.out.print(numbers[i] + "\t");
			}

		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}
