#include<stdio.h>
#include<stdlib.h>


void Digit(int Arr[],int iLength)
{
    int iCnt=0,iCount=0,iNo=0;
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        iNo=Arr[iCnt];
        while(iNo!=0)
        {
            iNo=iNo/10;
            iCount++;
        }
        
        if(iCount==3){
            printf("%d ",Arr[iCnt]);
            iCount=0;
        }
        else
        if(iCount>3 || iCount<3)
        {
            iCount=0;
        }
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

Digit(ptr,iSize);

free(ptr);

return 0;
}