#include<stdio.h>
void Pattern(int iRow,int iCol)
{
int i=0,j=0;
for(i=iRow;i>=1;i--)
{
    for(j=1;j<=i;j++)
    {
        printf("* ");
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