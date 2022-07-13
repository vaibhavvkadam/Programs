#include<stdio.h>
#include<stdlib.h>


int Largest(int Arr[],int iLength)
{
    int iCnt=0,iMax=0;
    iMax=Arr[iCnt];
    
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]>iMax)
    {
        iMax=Arr[iCnt];
        
  }
}
return iMax;
}

int main()
{
  int iSize=0,iCnt=0,iRet=0;
  int *ptr=NULL;

  printf("Enter elements number which is you want\n");
  scanf("%d",&iSize);

ptr=(int *)malloc(iSize*sizeof(int));

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}

printf("Enter %d arraay values\n",iSize);

for(iCnt=0;iCnt<iSize;iCnt++)
{
    printf("Enter elements of array%d:",iCnt+1);
    scanf("%d",&ptr[iCnt]);
}

iRet=Largest(ptr,iSize);

printf("Largest number is:%d",iRet);

free(ptr);

return 0;
}