#include<stdio.h>
#include<stdlib.h>


int LastOccurance(int Arr[],int iLength,int iNo)
{
    int iCnt=0;
    
for(iCnt=iLength-1;iCnt>=0;iCnt--)
{
    if(Arr[iCnt]==iNo)
    {
        return iCnt;
        break;
    }
}
return iCnt;
}

int main()
{
  int iSize=0,iCnt=0,iValue=0,iRet=0;
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
printf("Enter such number which you want occurance\n");
scanf("%d",&iValue);

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}
iRet=LastOccurance(ptr,iSize,iValue);
if(iRet==-1)
{
    printf("There is no such number\n");
}
else{
    printf("Firsth occurance of number is:%d",iRet);
}
free(ptr);
return 0;
}