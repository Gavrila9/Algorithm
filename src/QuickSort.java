import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] a, int low, int high) {
        //递归出口
        if (low > high) {
            return;
        }

        //标记
        int i = low;
        int j = high;
        int key = a[low];

        //完成一趟排序
        while (i < j) {
            //1. 从右往左找到第一个小于Key的数
            while (i<j && a[j] > key) {
                j--;
            }
            //2. 从左往右找到第一个大于key的数
            while (i<j && a[i] <= key) {
                i++;
            }
            //3. 交换
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //调整key的位置
        a[low] = a[i];
        a[i] = key;
        //递归
        quickSort(a, low, i - 1);
        quickSort(a, i + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 4, 5, 3, 9, 0};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}

