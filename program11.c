#include<stdio.h>
void EvenNum(int iNo)
{
   
   int iCnt=1,itemp=0,iCount=0;
   itemp=iNo;
   if(iNo<=0)
   {
       return;
   }
    for(iCnt=1;iCnt<=iNo;iCnt++)
    {
        if(iCnt%2==0)
    {
        printf("%d ",iCnt);
        iCount++;
    }
    else{
        iNo++;
        if(iCount==itemp)
        {
            break;
        }
    }
    
    
    }
}

int main()
{
    int iValue=0;
    printf("Enter a number\n");
    scanf("%d",&iValue);

    EvenNum(iValue);
return 0;
}