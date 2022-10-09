 import java.util.*;
 import java.lang.*;
 
 class SerachKey_Matrix
 {

    public static int MatrixDS(int R,int C)
    {
     int matrix[][]=new int[R][C];


    Scanner sc=new Scanner(System.in);

    System.out.println("Enter matrix elements");


    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
matrix[i][j]=sc.nextInt();
        }
    }
int count=0;
int Sum=0;
       for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
if(i+1==2)
{
Sum+=matrix[i][j];
}

        }

        
    }
    return Sum;
    }

 public static void main(String arg[])
    {
int Row,Col,key;
int Ret;
Scanner sc=new Scanner(System.in);


System.out.println("Enter row number");
 Row=sc.nextInt();


System.out.println("Enter col number");
 Col=sc.nextInt();


//System.out.println("Enter a key value");
//key=sc.nextInt();



Ret=MatrixDS(Row,Col);
System.out.println("sum of 2nd row :"+Ret);
    }
 
 }