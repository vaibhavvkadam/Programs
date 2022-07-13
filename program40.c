#include<stdio.h>
#include<stdlib.h>

int Frequence(int Arr[],int iLength,int iNo)
{
    int iCnt=0,iCount=0;
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]==iNo)
    {
        iCount++;
    }
}
return iCount;
}

int main()
{
  int iSize=0,iCnt=0,iRet=0,iValue=0;
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
printf("Enter such number which is you want frequency\n");
scanf("%d",&iValue);

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}
iRet=Frequence(ptr,iSize,iValue);
printf("Frequency of given  number by user is:%d",iRet);
free(ptr);
return 0;
}