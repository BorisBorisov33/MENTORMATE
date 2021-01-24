package com.company;

import java.util.Scanner;
        /*Description of the program:
        The following program is written in Java.
        This class is not completed 100 % due to time constraints such as several exams etc.
        All in all, I was working really hard and I am sure that there is something small that needs to be changed.
        **Here is a link of the video recording: https://youtu.be/Lhn-GyeGtoY
        */

public class Main {

    public static void main(String[] args) {
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);

        //dimension M is the number of rows
        System.out.println("Enter the first dimension M:");
        int dimM = scanner.nextInt();
        //dimension N is the number of columns
        System.out.println("Enter the first dimension N:");
        int dimN = scanner.nextInt();
        System.out.println("The dimensions are " + dimM + " and " + dimN);

        //Checking whether the dimensions are more than 100
        if (dimM >= 100 || dimN>= 100) {
            System.out.println("The dimensions are invalid. Please change them!");
        }
        //check whether the numbers are even
        else if ( dimM % 2 == 0 && dimN % 2 == 0 )
            System.out.println("Entered dimensions are even. You can continue!");
        else{
            System.out.println("Error! Change the dimensions to even numbers");
        }

        //Declaring an input matrix
        int[][] matrix = new int[dimM][dimN];
        System.out.println("Enter the values of the first layer:");
        for (i = 0; i < dimM; i++) {
            for (j = 0; j < dimN; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Declare output matrix
        int[][] outputmatrix = new int[dimM][dimN];
        for (i = 0; i < dimM; i++) {
            for (j = 0; j < dimN; j++) {

                // Check horizontally whether two consecutive numbers are equal
                if (matrix[i][j] == matrix[i][j+1] || matrix[i+1][j] == matrix[i+1][j+1]) {

                    // Check vertically whether two consecutive numbers are equal
                    if(matrix[i][j] == matrix[i+1][j] || matrix[i][j+1] == matrix[i+1][j+ 1]){
                    //Rotating the matrix with one element clockwise
                    outputmatrix[i][j]=matrix[i+1][j];
                    outputmatrix[i][j+1]=matrix[i][j];
                    outputmatrix[i+1][j]=matrix[i+1][j+1];
                    outputmatrix[i+1][j+1]=matrix[i][j+1];


                }
            }
                //Printing the second layer
            System.out.println("The second layer is:");
                for (i=0;i<dimM;i++){
                    for (j=0;j<dimN;j++) {
                        System.out.print(outputmatrix[i][j] + "  ");
                    }
                    System.out.println();
                }
        }
    }
}
}

