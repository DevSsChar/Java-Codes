import java.util.*;

public class p14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<List<String>> p = Nqueens(n);
        for (List<String> board : p) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println(); // Print a blank line to separate each solution
        }

        scan.close();
    }

    public static List<List<String>> Nqueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String row = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add((row));
        }
        solve(0, res, board);
        return res;
    }

    public static void solve(int row, List<List<String>> res, List<String> board) {
        if (row == board.size()) {
            res.add(new ArrayList<>(board));
        }
        for (int col = 0; col < board.size(); col++) {
            if (isSafe(row, col, board)) {
                StringBuilder newr = new StringBuilder(board.get(row));
                newr.setCharAt(col, 'Q');
                board.set(row, newr.toString());
                solve(row + 1, res, board);
                newr.setCharAt(col, '.');
                board.set(row, newr.toString());
            }
        }
    }

    public static Boolean isSafe(int row, int col, List<String> board) {
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}
