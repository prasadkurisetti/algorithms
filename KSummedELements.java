package com.prasad.test.javaClasses;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.springframework.util.CollectionUtils;

public class KSummedELements {
	public static void main(String[] args) {
		int[] arr =  { 10, 4, 5, 6, 7, 2, 3, -4, 12, 11, 4 };
		int num = 8;
		frstmethod(arr, num);
	}

	public static void frstmethod(int[] arry, int num) {
		@SuppressWarnings("unchecked")
		Vector<Integer> vec = new Vector<Integer>(CollectionUtils.arrayToList(arry));
		Collections.sort(vec);
		secondMethod(0, 0, num, vec, new Vector<Integer>());
	System.out.println(set.toString());
	}

	public static final Set<String> set = new HashSet<String>();

	public static void secondMethod(int i, int sum, int requredNum, Vector<Integer> primaryList,
			Vector<Integer> tempList) {
		if (requredNum == sum) {
			set.add(tempList.toString());
		}

		for (int j = i; j < primaryList.size(); j++) {
			if (sum + primaryList.get(j) > requredNum) {
				continue;
			}

			
			if (j > 1 && primaryList.get(j).equals(primaryList.get(j - 1) )&& j >i) {
				continue;
			}
			
			tempList.add(primaryList.get(j));

			secondMethod(j + 1, sum + primaryList.get(j), requredNum, primaryList, tempList);
			tempList.remove(tempList.size() - 1);
		}
	}

}
