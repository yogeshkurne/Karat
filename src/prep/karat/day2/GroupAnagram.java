package prep.karat.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagram {

	/*
	 * Given an array of strings strs, group the anagrams together. You can return
	 * the answer in any order.
	 * 
	 * ["eat","tea","tan","ate","nat","bat"]
	 * 
	 */

	public static Map<String, List<String>> findGroupAnagram(List<String> strList) {
		Map<String, List<String>> result = new HashMap<>();
		Set<String> strSet = new HashSet<>();

		for (String key : strList) {

			if (!strSet.contains(key)) {
				for (int i = 0; i < strList.size(); i++) {
					if (isAnagram(key, strList.get(i))) {
						strSet.add(key);
						strSet.add(strList.get(i));
						result.computeIfAbsent(key, k -> new ArrayList<>()).add(strList.get(i));
					}
				}
			}
		}

		return result;
	}

	private static boolean isAnagram(String str1, String str2) {
		var sortedString1 = str1.chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		var sortedString2 = str2.chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		if (sortedString1.length() != sortedString2.length()) {
			return false;
		}

		if (sortedString1.equals(sortedString2)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

		var result = findGroupAnagram(stringList);

		for (String key : result.keySet()) {
			System.out.println(result.get(key));
		}
	}

}
