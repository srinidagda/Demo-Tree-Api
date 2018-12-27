package week51;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MatrixCommonElementsDemo {
	static Set<Integer> toSet(int[] array) {
		return Arrays.stream(array).boxed().collect(Collectors.toSet());
	}
	
	public static void main(String args[]) {
		int[][] matrix = {{7, 1, 3, 5, 3, 6},
											{2, 3, 6, 1, 1, 6},
											{6, 1, 7, 2, 1, 4},
											{6, 6, 7, 1, 3, 3},
											{5, 5, 6, 1, 5, 4},
											{3, 5, 6, 2, 7, 1},
											{4, 1, 4, 3, 6, 4},
											{4, 6, 1, 7, 4, 3}};
		Set<Integer> commonElements = toSet(matrix[0]);
		for (int i=1;i<matrix.length;i++) {
			commonElements.retainAll(toSet(matrix[i]));
		}
		System.out.print(commonElements);
		System.out.print(matrix[0].length);
	}
}
