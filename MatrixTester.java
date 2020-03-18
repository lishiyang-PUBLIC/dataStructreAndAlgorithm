package assignment01;

import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Skeleton to test your matrix implementation.
 * 
 * @author Shirley(Shiyang) Li, u1160160
 *
 */
public class MatrixTester {
	public static void main(String[] args) {
		for(int i =0; i < 0; i++) {
			System.out.println("bug");
		}
//		SimpleWriter out = new SimpleWriter1L();
//
//		/*
//		 * Test case 1: constructing a matrix from an empty array should throw an
//		 * IllegalArgumentException.
//		 */
//		int[][] d = new int[0][0];
//		boolean caughtRightException = false;
//		Matrix m;
//		try {
//			m = new Matrix(d);
//		} catch (IllegalArgumentException e) {
//			out.println("Success: constructing a matrix from an empty array");
//			caughtRightException = true;
//		}
//		if (!caughtRightException) {
//			out.print("Fail: constructing a matrix from an empty array");
//			caughtRightException = false; // reset for next such test case
//		}
//
//		/*
//		 * Test case 2: a valid matrix multiplication
//		 */
//		Matrix m1 = new Matrix(new int[][] { { 1, 2, 3 }, { 2, 5, 6 } });
//		/*
//		 * Testing toString
//		 */
//		String m1StrExp = "1 2 3 \n2 5 6 \n";
//		String m1StrActual = m1.toString();
//		if (!m1StrExp.equals(m1StrActual)) {
//			out.println("toString Error.\nGot:\n" + m1StrActual + "\nExpected:\n" + m1StrExp);
//		}
//
//		/*
//		 * Testing equals
//		 */
//		Matrix m1Expected = new Matrix(new int[][] { { 1, 2, 3 }, { 2, 5, 6 } });
//		if (!m1Expected.equals(m1)) {
//			out.println("Equals error: m1 and m1Expected not equal\nGot:" + m1 + "\nexpected:" + m1Expected + ")");
//		}
//
//		/*
//		 * Testing times 
//		 */
//		Matrix m2 = new Matrix(new int[][] { { 4, 5 }, { 3, 2 }, { 1, 1 } });
//		Matrix actualProduct = m1.times(m2);
//		Matrix expectedProduct = new Matrix(new int[][] { { 13, 12 }, { 29, 26 } }); // we know this from math
//		if (!expectedProduct.equals(actualProduct)) {
//			out.println("equals error (m1 * m2 not equal to expected result)");
//		}
//
//		/*
//		 * Testing equals when object o is null
//		 */
//		Matrix mNull = null;
//		if (m1.equals(mNull)) {
//			out.println("Equals error: m1 and mNull equal, but it should not be equal");
//		}
//
//		/*
//		 * Testing equals when object o is not an instance of matrix
//		 */
//		int mInt = 0;
//		if (m1.equals(mInt)) {
//			out.println("Equals error: m1 and mInt equal, but it should not be equal");
//		}
//
//		/*
//		 * Testing times when two matrices with incompatible dimensions
//		 */
//		Matrix mTimes1 = new Matrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
//		Matrix mTimes2 = new Matrix(new int[][] { { 1, 3, 5 }, { 2, 4, 6 } });
//
//		try {
//			mTimes1.times(mTimes2);
//		} catch (IllegalArgumentException e) {
//			out.println("Success: we cannot do times on incompatible matrices");
//			caughtRightException = true;
//		}
//		if (!caughtRightException) {
//			out.print("Fail: we are not supposed to do times on incompatible matrices");
//			caughtRightException = false; // reset for next such test case
//		}
//
//		/*
//		 * Testing plus 
//		 */
//		Matrix actualSum = m1.plus(m1);
//		Matrix expectedSum = new Matrix(new int[][] { { 2, 4, 6 }, { 4, 10, 12 } }); 
//		if (!expectedSum.equals(actualSum)) {
//			out.println("equals error (m1 + m1 not equal to expected result)");
//		}
//
//		/*
//		 * Testing plus when two matrices without same dimensions
//		 */
//
//		try {
//			m1.plus(m2);
//		} catch (IllegalArgumentException e) {
//			out.println("Success: we cannot do plus on matrices of different dimensions");
//			caughtRightException = true;
//		}
//		if (!caughtRightException) {
//			out.print("Fail: we are not supposed to do plus on matrices of different dimensions");
//			caughtRightException = false; // reset for next such test case
//		}
//
//		/*
//		 * Finally close the output stream
//		 */
//		out.close();
	}
}
