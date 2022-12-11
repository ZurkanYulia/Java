package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Var12Test {
	public static double EPS = 0.0000001;

	@Test(dataProvider = "IntegerProvider")
	public void test1(int num, int numReversed){
		assertEquals(new Var12().getInteger(num), numReversed);
	}

	@DataProvider
	public Object[][] IntegerProvider(){
		return new Object[][]{{123, 321}, {591, 195}};
	}

	//
	@Test(dataProvider = "BooleanProvider")
	public void test2(int A, int B, int C, boolean bool){
		assertEquals(new Var12().getBoolean(A,B,C), bool);
	}

	@DataProvider
	public Object[][] BooleanProvider(){
		return new Object[][]{{5,1,7, true}, {99_999,0,666, false}, {-1,88,1, false}, {-3,5,999, false}, {99_999,1,5, true}};
	}

	//
	@Test(dataProvider = "IfProvider")
	public void test3(int A, int B,int C, int min){
		assertEquals(new Var12().getIf(A,B,C), min);
	}

	@DataProvider
	public Object[][] IfProvider(){
		return new Object[][]{{1, 2, 3, 1}, {99_999, 100_000, 99_998,99_998}, {0, -1, 1,-1}, {-999, -3,-100,-999},};
	}

	//
	@Test(dataProvider = "CaseProvider")
	public void test4(int n, double R,double res){
		assertEquals(new Var12().getCase(n,R), res,EPS);//EPS = 0.000_000_1
	}

	@DataProvider
	public Object[][] CaseProvider(){
		return new Object[][]{{2, 2.0, 4.0}, {3, 3.0,18.84}, {4, 3.0,28.26}};
	}
	//negative test
	@Test(expectedExceptions = RuntimeException.class)
	public void negativeTask4(){
		new Var12().getCase(-2,2.0);
	}
	//
	@Test(dataProvider = "ForProvider")
	public void test5(int N, double res){
		assertEquals(new Var12().getFor(N), res,EPS);
	}

	@DataProvider
	public Object[][] ForProvider(){
		return new Object[][]{{1,1.1}, {6, 5.76576}, {11, 140.792940288}};
	}
	// negative test
	@Test(expectedExceptions = RuntimeException.class)
	public void negativeTask5(){
		new Var12().getFor(-2);
	}

	//
	@Test(dataProvider = "WhileProvider")
	public void test6(int N, int[] res){
		assertEquals(new Var12().getWhile(N), res);
	}

	@DataProvider
	public Object[][] WhileProvider(){
		return new Object[][]{{6,new int[]{6,3}}, {16,new int[]{15,5}}};
	}
	// negative test
	@Test(expectedExceptions = RuntimeException.class)
	public void negativeTask6(){
		new Var12().getWhile(0);
	}

	//
	@Test(dataProvider = "ArrayProvider")
	public void test7(int[] arr, int[] res){
		assertEquals(new Var12().getArray(arr), res);
	}

	@DataProvider
	public Object[][] ArrayProvider(){
		return new Object[][]{{new int[]{1, 2, 5, 6, 9, 11 },new int[]{ 2, 6, 11 }}, {new int[]{1,2,3,4,5,6},new int[]{2,4,6}}};
	}
	//negative test
	@Test(expectedExceptions = RuntimeException.class)
	public void test7(){
		new Var12().getArray(new int[]{1,2,3});
	}

	//
	@Test(dataProvider = "MatrixProvider")
	public void test8(int[][] matrix, int[][] res){
		assertEquals(new Var12().getMatrix(matrix),res);
	}

	@DataProvider
	public Object[][] MatrixProvider(){
		return new Object[][]{{new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{1,8,3},{4,5,6},{7,2,9}}},{new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}},new int[][]{{1,10,3,12},{5,6,7,8},{9,2,11,4}}}};
	}

}


