#include<stdio.h>
#include<stdlib.h>

int Diff_EvenOdd(int Arr[],int iLength)
{
    int iCnt=0,iESum=0, iOSum=0,iDiff=0;
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]%2==0)
    {
iESum+=Arr[iCnt];
    }
    else{
        iOSum+=Arr[iCnt];
    }
}
iDiff=iESum-iOSum;
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
iRet=Diff_EvenOdd(ptr,iSize);
if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}

printf("Differance of summation of even and odd numbers:%d",iRet);
free(ptr);

    return 0;
}