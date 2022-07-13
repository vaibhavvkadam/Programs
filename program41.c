#include<stdio.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL Check(int Arr[],int iLength,int iNo)
{
    int iCnt=0;
    
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]==iNo)
    {
        return TRUE;
        break;
    }
}
return FALSE;
}

int main()
{
  int iSize=0,iCnt=0,iValue=0;
  BOOL bRet=FALSE;
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
printf("Enter such number which is find wheter number is parsent or not\n");
scanf("%d",&iValue);

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}
bRet=Check(ptr,iSize,iValue);
if(bRet==TRUE)
{
    printf("Number is parsent\n");
}
else{
    printf("Number is not parsent\n");
}
free(ptr);
return 0;
}