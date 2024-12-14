package pb1;

import java.util.Arrays;

public class Matrix {
    int[][] a;

    public Matrix(int[][] a) {
        this.a = a;
    }

    public int compare(Matrix mat) {
        int n = a.length;
        int n1 = mat.a.length;
        int m = a[0].length;
        int m1 = mat.a[0].length;
        if(n == n1 && m == m1) {
            return 0;
        } else
            return -1;
    }

    public void addition(Matrix mat) {
        int c = compare(mat);
        int n = a.length;
        int m = a[0].length;
        if (c == 0) {
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = a[i][j] + mat.a[i][j];
                }
            }
        } else {
            System.out.println("The 2 matrix should have the same dimensions");
        }
    }

    public void substraction(Matrix mat) {
        int c = compare(mat);
        int n = a.length;
        int m = a[0].length;
        if (c == 0) {
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = a[i][j] - mat.a[i][j];
                }
            }
        } else {
            System.out.println("The 2 matrix should have the same dimensions");
        }
    }

    public void multiplication(Matrix mat) {
        int c = compare(mat);
        int n = a.length;
        int m = a[0].length;
        if (c == 0) {
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = a[i][j] * mat.a[i][j];
                }
            }
        } else {
            System.out.println("The 2 matrix should have the same dimensions");
        }
    }

    public void scalarDivision(int divisionElement) {
        int n = a.length;
        int m = a[0].length;
        if(divisionElement != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = a[i][j] / divisionElement;
                }
            }
        } else {
            System.out.println("Cannot divide by 0");
        }
    }

    @Override
    public String toString() {
        int n = a.length;
        int m = a[0].length;
        return "Matrix{" +
                "a=" +
                '}';
    }
}