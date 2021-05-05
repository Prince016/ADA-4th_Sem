package Dynamic;

import java.util.Scanner;

public class QueensProblem {


    private static int N;

    private static int[][] chessBoard = new int[1000][1000];


    private static boolean checkingAttack(int i, int j)
    {
        int k,l;

        for(k=0;k<N;k++)
        {
            if((chessBoard[i][k] == 1) || (chessBoard[k][j] == 1))
                return true;
        }

        for(k=0;k<N;k++)
        {
            for(l=0;l<N;l++)
            {
                if(((k+l) == (i+j)) || ((k-l) == (i-j)))
                {
                    if(chessBoard[k][l] == 1)
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean no_of_Queens(int n)
    {
        int i,j;

        if(n==0)
            return true;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {

                if((!checkingAttack(i,j)) && (chessBoard[i][j]!=1))
                {
                    chessBoard[i][j] = 1;

                    if(no_of_Queens(n-1)==true)
                    {
                        return true;
                    }
                    chessBoard[i][j] = 0;
                }
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of N for NxN chessboard");
        N = s.nextInt();

//        int i,j;

        no_of_Queens(N);

//        printing the output
        for(int i=0;i<N;i++){
            for (Integer j=0;j<N;j++){
                if(chessBoard[i][j]==1){
                    System.out.print((j+1)+" ");
                }
            }
        }
        System.out.println();


    }
}


