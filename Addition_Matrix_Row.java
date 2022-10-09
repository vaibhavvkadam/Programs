import java.lang.*;
import java.util.*;


class Addition_Matrix_Row
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();

        System.out.println("Enter col");
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

       

        for(int i=0; i<matrix.length;i++)
        {
            int Sum=0;
            for(int j=0;j<matrix[i].length;j++)
            {
Sum+=matrix[i][j];
            }
            System.out.println(Sum);
        }



    }
}