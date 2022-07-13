#include<stdio.h>
#include<stdlib.h>

void Display_DivisibleBy5N(int Arr[],int iLength)
{
    int iCnt=0;
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]%5==0)
    {
printf("%d ",Arr[iCnt]);
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


printf("Enter %d arraay values\n",iSize);
for(iCnt=0;iCnt<iSize;iCnt++)
{
    printf("Enter elements of array%d:",iCnt+1);
    scanf("%d",&ptr[iCnt]);
}
Display_DivisibleBy5N(ptr,iSize);
if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}


free(ptr);

    return 0;
}