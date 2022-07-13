#include<stdio.h>
#include<stdlib.h>

int DiffFrequenceEvenOdd(int Arr[],int iLength)
{
    int iCnt=0,iEvenCount=0,iOddCount=0;
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]%2==0)
    {
        iEvenCount++;
    }
    else{
iOddCount++;
    }
}
return iEvenCount-iOddCount;
}

int main()
{
  int iSize=0,iCnt=0,iRet=0;
  int *ptr=NULL;

  printf("Enter elements number which is you want\n");
  scanf("%d",&iSize);

ptr=(int *)malloc(iSize*sizeof(int));


printf("Enter %d arraay values\n",iSize);
for(iCnt=0;iCnt<iSize;iCnt++)
{
    printf("Enter elements of array%d:",iCnt+1);
    scanf("%d",&ptr[iCnt]);
}

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}
iRet=DiffFrequenceEvenOdd(ptr,iSize);
printf("Diff of Frequency of Even and odd number is:%d",iRet);
free(ptr);
return 0;
}