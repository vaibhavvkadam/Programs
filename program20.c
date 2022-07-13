#include<stdio.h>

int SumNonFact(int iNo)
{
    int iCnt=0,iSumFact=0,iSumNonFact=0,iDiff=0;
    for(iCnt=1;iCnt<iNo;iCnt++)
    {
        if(iNo%iCnt!=0)
        {
       iSumNonFact+=iCnt;
       
        }
        else{
            iSumFact+=iCnt;
        }
    }
    iDiff=iSumFact-iSumNonFact;
    if(iDiff<=0)
    {
        iDiff=-iDiff;
        }
    return iDiff;
}

int main()
{
int iValue=0;
int iRet=0;
printf("Enter Number\n");
scanf("%d",&iValue);

iRet=SumNonFact(iValue);
printf("Difference of summation of facto and non factor numbers:%d",iRet);

return 0;
}