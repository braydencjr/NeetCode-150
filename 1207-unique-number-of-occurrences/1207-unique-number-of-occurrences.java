class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for(int n : freq.values()){
            s.add(n);
        }

        return freq.size() == s.size();
    }
}