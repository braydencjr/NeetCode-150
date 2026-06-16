class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap <Character,Integer> freq1 = new HashMap<>();
        HashMap <Character,Integer> freq2 = new HashMap<>();
        for(int i=0 ; i<word1.length() ; i++){
            freq1.put(word1.charAt(i), freq1.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for(int i=0 ; i<word2.length() ; i++){
            freq2.put(word2.charAt(i), freq2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if(!freq1.keySet().equals(freq2.keySet())){
            return false;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int value : freq1.values()){
            list1.add(value);
        }

        for(int value : freq2.values()){
            list2.add(value);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}