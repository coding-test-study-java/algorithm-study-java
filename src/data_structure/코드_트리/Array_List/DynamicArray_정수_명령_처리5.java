package data_structure.코드_트리.Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DynamicArray_정수_명령_처리5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long commandNumber = Long.parseLong(sc.nextLine());
		List<Long> numberList = new ArrayList<>();
		String[] tempString = new String[(int)commandNumber];

		for (int i = 0; i < commandNumber; i++) {
			tempString[i] = sc.nextLine();
		}

		for (int i = 0; i < commandNumber; i++) {
			if (tempString[i].contains("push_back")) {
				String[] tmp = tempString[i].split(" ");
				numberList.add(Long.parseLong(tmp[1]));
			} else if (tempString[i].contains("pop_back")) {
				numberList.remove(numberList.size() - 1);
			} else if (tempString[i].contains("get")) {
				String[] getCommand = tempString[i].split(" ");
				long getIndex = Long.parseLong(getCommand[1]);
				System.out.println(numberList.get((int) getIndex - 1));
			} else {
				System.out.println(numberList.size());
			}
		}
	}
}
