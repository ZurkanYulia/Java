package lab0;

public class Var12 {

	public static final double p = 3.14;

	public int getInteger(int num){
		int a = num / 100, b = (num-a*100) / 10, c = num-a*100-b*10;
		return Integer.parseInt("" + c + b + a);
	} //Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.

	public boolean getBoolean(int A, int B, int C){
		return A > 0 && B > 0 && C > 0;
	} //Даны три целых числа: A, B, C. Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».

	public int getIf(int A, int B, int C){
		if(B<C)
			if(A<B)
				return A;
			else
				return B;
		else if(A<C)
			return A;
		else
			return C;
	}//Даны три числа. Найти наименьшее из них.

	public double getCase(int n,double R){
		switch(n){
			case 1: return R;
			case 2: return 2*R;
			case 3: return 2*p*R;
			case 4: return p*R*R;
		}
		throw new RuntimeException();
	}// Элементы окружности пронумерованы следующим образом: 1 — радиус R, 2 — диаметр D = 2·R, 3 — длина L = 2·p·R,
	// 4 — площадь круга S = p·R2. Дан номер одного из этих элементов и его значение.
	// Вывести значения остальных элементов данной окружности (в том же порядке). В качестве значения p использовать 3.14.

	public double getFor(int N){
		if(N <= 0) throw new RuntimeException();
		double res = 1;
		for(int i = 1; i <= N; i++)
			res *= i*0.1+1;
		return res;
	} /*Дано целое число N (> 0). Найти произведение
1.1 · 1.2 · 1.3 · …
		(N сомножителей).*/

	public int[] getWhile(int N){
		if(N <= 1) throw new RuntimeException();
		int K = 0, i = 1;
		while(K<=N)
			K+=i++;
		K = K - --i;
		return new int[]{K,i-1};
	}//Дано целое число N (> 1).
	//Вывести наибольшее из целых чисел K, для которых сумма 1 + 2 + … + K будет меньше или равна N, и саму эту сумму.

	public int[] getArray(int[] A){
		int N = A.length, j=0;
		if(N % 2 == 1)
			throw new RuntimeException();
		int[] array = new int[N/2];
		for(int i = 1; i <= N; i+=2)
			array[j++]=A[i];
		return array;
	}// Дан массив A размера N (N — четное число).
	// Вывести его элементы с четными номерами в порядке возрастания номеров: A2, A4, A6, …, AN. Условный оператор не использовать.

	public static int[][]getMatrix(int[][]matrix){
		int N = matrix.length, M = matrix[0].length;
		int[][] matrixRes = new int[N][M];
		int i = 0;
		while(i < M){
			for(int j = 0; j < N; j++)
				matrixRes[j][i] = matrix[j][i];
			i++;
			if(i >= M) break;
			for(int j = 0; j < N; j++)
				matrixRes[j][i] = matrix[N-j-1][i];
			i++;
		}
		return matrixRes;
	}//Дана матрица размера M ґ N. Вывести ее элементы в следующем порядке: первый столбец сверху вниз,
	// второй столбец снизу вверх, третий столбец сверху вниз, четвертый столбец снизу вверх и т. д.
}
