
//program to print only even factor of given number by user
#include<stdio.h>
void Display_Factor(int iNo)
{
    int iCnt=1;
if(iNo<=0)
{
    iNo=-iNo;
}
for(iCnt=1;iCnt<=iNo/2;iCnt++)
{
    if(iNo%iCnt==0 && iCnt%2==0)
    {
        printf("%d ",iCnt);
    }
}



}
int main()
{
int iValue=0;
printf("Enter a number\n");
scanf("%d",&iValue);

Display_Factor(iValue);
    return 0;
}