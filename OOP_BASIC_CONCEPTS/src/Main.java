import pb1.Matrix;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[][] a = new int[][] {{1,2,3},{1,2,3}};
        Matrix mat = new Matrix(a);
        System.out.println(mat);
        mat.addition(mat);
        System.out.println(mat);
        mat.substraction(mat);
        System.out.println(mat);
        mat.multiplication(mat);
        System.out.println(mat);
        int scalarDivision = 0;
        mat.scalarDivision(scalarDivision);
        System.out.println(mat);
        scalarDivision = 2;
        mat.scalarDivision(scalarDivision);
        System.out.println(mat);
    }
}
