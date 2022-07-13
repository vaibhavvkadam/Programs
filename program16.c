#include<stdio.h>

int MultFact(int iNo)
{
    int iCnt=0,iMult=1;
    for(iCnt=1;iCnt<=iNo/2;iCnt++)
    {
        if(iNo%iCnt==0)
        {
            iMult*=iCnt;
        }
    }
    return iMult;
}

int main()
{
int iValue=0,iRet=0;
printf("Enter Number\n");
scanf("%d",&iValue);

iRet=MultFact(iValue);
printf("Multification of all factor is:%d",iRet);



    return 0;
}