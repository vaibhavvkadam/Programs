#include<stdio.h>

void Display(int iNo)
{
int iCount=0,iTemp=0,iCnt=0;
iTemp=iNo;
for(iCnt=1;iCnt<=iNo;iCnt++)
{
    if(iCnt%2==0)
    {
        printf("%d ",iCnt);
        iCount++;
        if(iCount==iTemp)
        {
            break;
        }
    }
    else{
        iNo++;
    }
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