package data_structure.코드_트리.Sort;

import java.io.*;
import java.util.*;

public class Q_거품_정렬_구현 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			long n = Long.parseLong(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			long[] inputNumber = new long[(int) n];

			int count = 0;

			for (int i = 0; i < n; i ++) {
				inputNumber[count] = (Long.parseLong(st.nextToken()));
				count ++;
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - 1 - i; j++) {
					if (inputNumber[j] > inputNumber[j + 1]) {
						long temp = inputNumber[j];
						inputNumber[j] = inputNumber[j + 1];
						inputNumber[j + 1] = temp;
					}
				}
			}

			for (long result : inputNumber) {
				System.out.print(result + "\t");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
