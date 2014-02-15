package proc.loop;

//import java.util.Arrays;

public class Matrix_mu {

	/**
	 *     �������� �����, ���������� ��� 2-������ ���������� �������. ����� ������ ����� ���
    public class MatrixUtils {
        public static int[][] mul(int[][] a, int[][] b) {...}
    }

    ������������ ���� ��������� ���������� ������ A � B �������� NxN - ��� ������� � �������� NxN, 
    ��� ������ ������� C[i][j] ������������� �� �������:
    C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ... + A[i][N-1]*B[N-1][j]
    ������:
|1 3|    |0 1|    |15 19|
|2 4| * |5 6| = |20 26|, ��� ���
1*0 + 3*5 = 15
1*1 + 3*6 = 19
2*0 + 4*5 = 20
2*1 + 4*6 = 26
    ���������: ��� ��������� ������� ��������� ����.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m0[][] = {
				{1, 2, 3},
				{4, 5, 6},
		};
		int m1[][] = {
				{2, 3, 4, 5},
				{7, 7, 7, 7},
				{8, 8, 8, 8},
		};
		
		System.out.println(m1.length + " " + m0.length);
		int r[][] = new int [m0.length][4];
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 2; j++){
				for(int x = 0; x < 3; x++){
					r[j][i] += m0[j][x]*m1[x][i];	
				}
				
			}
		}
	for (int[] x : r)
	{
		for(int i = 0;i < x.length; i++)
		{
			System.out.print("["+x[i]+"]"+ " ");
		}
		System.out.println();
	}
	}

}
