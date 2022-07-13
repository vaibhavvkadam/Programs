#include<stdio.h>


void Display(int iNo)
{
int iCount=0;
for(iCount=1;iCount<=iNo;iCount++)
{
     printf("# ");
   printf("%d ",iCount);
   printf("* ");
}
}
int main()
{
int iValue=0;


printf("Enter number\n");
scanf("%d",&iValue);

Display(iValue);

    return 0;
}