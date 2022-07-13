#include<stdio.h>
#include<stdlib.h>


int DigitSum(int Arr[],int iLength)
{
    int iCnt=0,iSum=0,iDigits=0,iNo=0;
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        iNo=Arr[iCnt];
        while(iNo!=0)
        {
            iDigits=iNo%10;
            iSum=iSum+iDigits;
            iNo=iNo/10;
        }
     printf("%d ",iSum);
     iSum=0;
        }
    }

int main()
{
  int iSize=0,iCnt=0;
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

DigitSum(ptr,iSize);

free(ptr);

return 0;
}