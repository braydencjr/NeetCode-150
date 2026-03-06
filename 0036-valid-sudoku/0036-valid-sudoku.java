class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i=0 ; i<9 ; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int row=0 ; row<9 ; row++){
            for(int column=0 ; column<9 ; column++){
                char val = board[row][column];

                if(val == '.'){
                    continue;
                }

                int box = (row/3 * 3) + (column/3);

                if(rows[row].contains(val) ||
                columns[column].contains(val) ||
                boxes[box].contains(val)){
                    return false;
                }

                rows[row].add(val);
                columns[column].add(val);
                boxes[box].add(val);
            }
        }
        return true;
    }
}