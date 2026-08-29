class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> file = new HashSet<>();

        for (int num : nums){
            file.add(num);
        }

        int multiple =k;
        while (file.contains(multiple)){

        multiple = multiple + k;
        }
        return multiple;
    }
}