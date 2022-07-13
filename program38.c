#include<stdio.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;
BOOL Check(int Arr[],int iLength)
{
int iCnt=0;
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]==11)
    {
        return TRUE;
        break;
    }

}
return FALSE;
}

int main()
{
  int iSize=0,iCnt=0;
  BOOL iRet=0;
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
iRet=Check(ptr,iSize);
if(iRet==TRUE)
{
    printf("11 is parsent\n");
}
else{
    printf("11 is not parsent");
}

free(ptr);
return 0;
}

