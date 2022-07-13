#include<stdio.h>


void Display(int iNo)
{
int iCount=0;
for(iCount=iNo;iCount>0;iCount--)
{
printf("%d ",iCount);
printf("# ");
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