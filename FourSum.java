public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // condition: output should be non-decreasing
        // no duplication
        // O(n^3)
        
	Arrays.sort(num);
 
	HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
 
	for (int i = 0; i < num.length; i++) {
		for (int j = i + 1; j < num.length; j++) {
			int k = j + 1;
			int l = num.length - 1;
 
			while (k < l) {
				int sum = num[i] + num[j] + num[k] + num[l];
 
				if (sum > target) {
					l--;
				} else if (sum < target) {
					k++;
				} else if (sum == target) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(num[i]);
					temp.add(num[j]);
					temp.add(num[k]);
					temp.add(num[l]);
 
					if (!hashSet.contains(temp)) {
						hashSet.add(temp);
						result.add(temp);
					}
 
					k++;
					l--;
				}
			}
		}
	}
 
	return result;
}
}
