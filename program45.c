#include<stdio.h>
#include<stdlib.h>


int Product(int Arr[],int iLength)
{
    int iCnt=0,iMult=1;
    
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]%2!=0)
    {
        iMult=iMult*Arr[iCnt];
        
  }
}
if(iMult>1)
{
    return iMult;
}
else
{
    return iMult=0;
}
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

iRet=Product(ptr,iSize);
printf("Product of Odd elements is:%d",iRet);
free(ptr);
return 0;
}