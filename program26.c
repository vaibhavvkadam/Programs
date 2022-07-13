#include<stdio.h>

int Count_Even_Num(int iNo)
{
int iDigit=0,iCount=0;
while(iNo)
{
    iDigit=iNo%10;
    if(iDigit%2==0)
    {
       iCount++;
    }
    iNo=iNo/10;
}
return iCount;
}


int main()
{
    int iValue=0,iRet=0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    iRet=Count_Even_Num(iValue);
    printf("Count of Even number is:%d",iRet);
    return 0;
}