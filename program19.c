#include<stdio.h>

int SumNonFact(int iNo)
{
    int iCnt=0,iSum=0;
    for(iCnt=1;iCnt<iNo;iCnt++)
    {
        if(iNo%iCnt!=0)
        {
       iSum+=iCnt;
       
        }
    }
    return iSum;
}

int main()
{
int iValue=0;
int iRet=0;
printf("Enter Number\n");
scanf("%d",&iValue);

iRet=SumNonFact(iValue);
printf("Sum of non factor numbers:%d",iRet);

return 0;
}