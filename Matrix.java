package assignment01;

/**
 * Represents a 2-d integer matrix as a 2-d int array.
 * 
 * @author Shirley(Shiyang) Li, u1160160
 *
 */
public class Matrix {
	/**
	 * Holds the number of rows of this matrix
	 */
	private int numRows;
	/**
	 * Holds the number of columns of this matrix
	 */
	private int numColumns;
	/**
	 * Holds the actual data of this matrix
	 */
	private int data[][];

	/**
	 * Constructor from a 2D array -- automatically determines the dimensions.
	 * 
	 * @param d 2D array to construct the matrix
	 * @throws IllegalArgumentException if {@code d} is empty or null
	 */
	public Matrix(int d[][]) throws IllegalArgumentException {
		if (d == null || d.length == 0) {
			throw new IllegalArgumentException();
		}
		this.numRows = d.length; // d.length is the number of 1D arrays in the 2D array
		this.numColumns = d[0].length; // d[0] is the first 1D array

		// create a new matrix to hold the data
		this.data = new int[this.numRows][this.numColumns];
		// copy the data over
		for (int i = 0; i < this.numRows; i++) {
			for (int j = 0; j < this.numColumns; j++) {
				this.data[i][j] = d[i][j];
			}
		}
	}

	/**
	 * Check if two matrices are equal. If they are equal, return true; 
	 * If not, return false.
	 * 
	 * @param o matrix to compare with
	 * @return true or false
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false; 
		}
		if (!(o instanceof Matrix)) { // make sure the Object we're comparing to is a Matrix
			return false;
		}
		Matrix m = (Matrix) o; // if the above was not true, we know it's safe to treat 'o' as a Matrix

		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				if (m.data[i][j]!= data[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Make a 2-d integer matrix as a 2-d int array into String
	 * 
	 * @return a string in a matrix format
	 */
	@Override
	public String toString() {
		String matrix = new String();
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				matrix += data[i][j] + " "; 
			}
			matrix += "\n";
		}
		return matrix; 
	}

	/**
	 * Multiplies {@code this} by {@code m} and returns the result as a new
	 * {@code Matrix}. If {@code m} does not have appropriate dimensions to multiply
	 * to {@code this}, it throws an {@code IllegalArgumentException}.
	 * 
	 * @param m matrix to multiply {@code this} with
	 * @return result of the product
	 * 
	 * @throws IllegalArgumentException if dimensions of the matrices are not
	 *                                  compatible
	 */
	public Matrix times(Matrix m) throws IllegalArgumentException {
		if(numColumns != m.numRows) {
			throw new IllegalArgumentException();
		}

		Matrix timesMatrix = new Matrix(new int[numRows][m.numColumns]);


		for(int i = 0; i < numRows; i++) {
			for (int j = 0; j < m.numColumns; j++) {
				int sum = 0;
				for (int k = 0; k < numColumns; k++) {
					sum += data[i][k] * m.data[k][j];
				}
				timesMatrix.data[i][j] = sum;
			}
		}
		return timesMatrix;
	}

	/**
	 * Adds {@code m} to {@code this} and returns the result as a new
	 * {@code Matrix}. If {@code m} does not have the same dimensions as
	 * {@code this}, it throws an {@code IllegalArgumentException}.
	 * 
	 * @param m matrix to add to {@code this} with
	 * @return result of the addition
	 *
	 * @throws IllegalArgumentException if dimensions of the matrices are not
	 *                                  compatible
	 */
	public Matrix plus(Matrix m) throws IllegalArgumentException {
		if(m.numRows != numRows && m.numColumns != numColumns) {
			throw new IllegalArgumentException();
		}

		Matrix plusMatrix = new Matrix(new int[numRows][numColumns]);

		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				plusMatrix.data[i][j] = m.data[i][j] + data[i][j];  
			}
		}

		return plusMatrix;
	}
}
