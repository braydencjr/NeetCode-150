class Solution {
    public boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }

        ArrayList<Integer> list1 = new ArrayList<>(freq1.values());
        ArrayList<Integer> list2 = new ArrayList<>(freq2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}