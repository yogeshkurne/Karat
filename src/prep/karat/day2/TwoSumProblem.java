package prep.karat.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumProblem {

	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * 
	 * 
	 * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
	 * Because nums[0] + nums[1] == 9, we return [0, 1].
	 * 
	 * Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
	 * 
	 * Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
	 */

	public static List<Integer> getTargetSum(List<Integer> numList, int target) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < numList.size(); i++) {

			for (int j = i + 1; j < numList.size(); j++) {
				if (numList.get(i) + numList.get(j) == target) {
					result.add(i);
					result.add(j);
				}
			}
		}

		return result;
	}

	public static Set<Integer> getTargetSumLC(List<Integer> numList, int target) {
		Set<Integer> result = new HashSet<>();

		Set<Integer> numSet = new HashSet<>(numList);

		for (int num : numList) {
			var remNum = target - num;
			if (numSet.contains(remNum)) {
				result.add(numList.indexOf(num));
				result.add(numList.indexOf(remNum));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(2, 7, 11, 15);
		var result = getTargetSumLC(inputList, 9);

		System.out.println(result);
	}
}
