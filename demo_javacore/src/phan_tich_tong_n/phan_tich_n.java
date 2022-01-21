package phan_tich_tong_n;
import java.io.*;
public class phan_tich_n {
	static int result[] = new int[10];
    static int n = 4;
    public static void main(String[] args) {
        handle(0,n,0);
    }

    static void handle(int i, int k, int cSum) {
        for (int j = k; j >= 1; j--) {
            if (cSum + j <= n) {
                result[i] = j;
                cSum += j;
                if (cSum == n) {
                    out(i);
                } else {
                    handle(i+1, j, cSum);
                }
                cSum -= j;
            }
        }
    }

    static void out(int i) {
        System.out.print("(");
        for (int k = 0; k <= i; k++) {
            System.out.print(result[k]);
        }
        System.out.print(")");

    }

}
