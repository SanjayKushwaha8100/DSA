package ok;

import java.util.*;

public class GroupAnagramsStrings {
	List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> anagramMap = new HashMap<>();
		

		// Iterate through each string in the input array
		for (String s : strs) {
			// Convert string to char array, sort it, and convert back to string
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String sortedStr = new String(chars);

			// Add the string to the corresponding anagram group
			anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
			// search for sortedStr(Key), if found return that Value(List<string>) of that Key and add(s) to the list otherwise return Empty List.
			// If not found return empty list, add(s) to the empty list  
			
		}

		// Return the values of the HashMap as a list
		return new ArrayList<>(anagramMap.values());
	}

	public static void main(String[] args) {
		GroupAnagramsStrings solution = new GroupAnagramsStrings();
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = solution.groupAnagrams(input);
		System.out.println(result);
	}
}