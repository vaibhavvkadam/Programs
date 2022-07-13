#include<stdio.h>
void Pattern(int iRow,int iCol)
{
int i=0,j=0;
for(i=1;i<=iRow;i++)
{
    for(j=1;j<=iCol;j++)
    {
        if(i==j||i==iRow||j==iCol||i==1||j==1)
        {
           printf("* ");
        }
       
        else{
            printf("  ");
        }
    }
    printf("\n");
}


}
int main()
{
int iValue1=0,iValue2=0;
printf("Enter a row number");
scanf("%d",&iValue1);

printf("Enter a col number\n");
scanf("%d",&iValue2);
Pattern(iValue1,iValue2);
    return 0;
}