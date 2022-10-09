import java.lang.*;
import java.util.*;


class CountChess
{
public static boolean isSafe(char boared[][],int row,int col)
{
    for(int i=row-1;i>=0;i--)
    {
        if(boared[i][col]=='Q')
        {
            return false;
        }
    }
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
    {
        if(boared[i][j]=='Q')
        {
            return false;
        }
    }
    for(int i=row-1,j=col+1;i>=0 && j<boared.length;i--,j++)
    {
        if(boared[i][j]=='Q')
        {
            return false;
        }
    }
    return true;
}


public static void nQueens(char boared[][],int row)
{
if(row==boared.length)
{
    count++;
    return;
}

    for(int j=0;j<boared.length;j++)
    {
        if(isSafe(boared,row,j))
        {
        boared[row][j]='Q';
        nQueens(boared,row+1);
        boared[row][j]='X';
        }
    }
}
    public static void Printall(char boared[][])
    {

        System.out.println("------------Chess Boared-----------");
 for(int i=0;i<boared.length;i++)
        {

            for(int j=0;j<boared.length;j++)
            {
           System.out.print(boared[i][j]+" ");
            }
            System.out.println();
        }
    }

public static int count=0; 
    
    public static void main(String arg[])
    {
        int n=5;
        char boared[][]=new char[n][n];

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<n;j++)
            {
            boared[i][j]='X';
            }
        }

        //Printall(boared);
        nQueens(boared,0);
        System.out.println("Number ways to solve n queen problems="+count);
       //System.out.println(boared.length);
    }
}