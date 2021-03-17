import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        // 测试用例：3x4矩阵
//        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //4x4矩阵
//        int a[][] = {{1, 2, 3, 4},
//                    {5, 6, 7, 8},
//                    {9, 10, 11, 12},
//                    {13,14,15,16}};
        //3x2矩阵
//        int a[][] = {{1, 2},
//                    {3, 4},
//                    {5, 6}};

        Scanner s = new Scanner(System.in);
        // m*n矩阵
        int m =s.nextInt();
        int n = s.nextInt();

        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }

        printt(m,n,a);

    }
    public static void printt(int m, int n, int[][] a) {

        // 副对角线及以上部分
        // 第0列到n-1列
        for (int k = 0; k < n; k++) {
            for (int i = 0, j = k; i < m && j >= 0; i++, j--) {
                System.out.print(a[i][j]);
                System.out.print(",");
            }
        }

        // 副对角线以下部分
        // 第1行到m-1行
        for (int k = 1; k < m; k++) {
            for (int i = k, j = n - 1; i < m && j >= 0; i++, j--) {
                System.out.print(a[i][j]);

                //最后一个元素后不打印逗号
                if (!(i == m - 1 && j == n - 1))
                    System.out.print(",");
            }
        }
    }
}
