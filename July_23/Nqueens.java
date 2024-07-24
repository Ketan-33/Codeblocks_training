// import java.util.ArrayList;
import java.util.*;

class Nquuens {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		boolean[][] arr = new boolean[n][n];
		ans(arr, 0, 0, n, result);
		return result;
	}

	public void ans(boolean[][] arr, int row, int qpsf, int tq, List<List<String>> result) {
		if (qpsf == tq) {
			List<String> ans = new ArrayList<>();
			for (boolean[] rowArr : arr) {
				StringBuilder sb = new StringBuilder();
				for (boolean value : rowArr) {
					if (value) {
						sb.append("Q");
					} else {
						sb.append(".");
					}
				}
				ans.add(sb.toString());
			}
			result.add(ans);
			return;
		}

		for (int i = 0; i < arr[0].length; i++) {
			if (isPossible(arr, row, i)) {
				arr[row][i] = true;
				ans(arr, row + 1, qpsf + 1, tq, result);
				arr[row][i] = false;
			}
		}
	}

	private boolean isPossible(boolean[][] arr, int row, int col) {
		int cr = row;
		int cc = col;
		while (cr >= 0) {
			if (arr[cr][cc]) {
				return false;
			}
			cr--;
		}

		cr = row;
		int a = cr;
		int b = cc;
		while (a >= 0 && b < arr[0].length) {
			if (arr[a][b]) {
				return false;
			}
			a--;
			b++;
		}

		a = cr;
		b = cc;
		while (a >= 0 && b >= 0) {
			if (arr[a][b]) {
				return false;
			}
			a--;
			b--;
		}
		return true;
	}
}
