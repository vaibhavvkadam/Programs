#include<stdio.h>
#include<stdlib.h>


void Range(int Arr[],int iLength,int iStart,int iEnd)
{
    int iCnt=0;
    
for(iCnt=0;iCnt<iLength;iCnt++)
{
    if(Arr[iCnt]>iStart && Arr[iCnt]<iEnd)
    {
        printf("%d ",Arr[iCnt]);
        
    }
}

}

int main()
{
  int iSize=0,iCnt=0,iValue=0,iValue1=0,iValue2=0;
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
printf("Enter starts number\n");
scanf("%d",&iValue1);

printf("Enter end number\n");
scanf("%d",&iValue2);

if(ptr==NULL)
{
    printf("Unable to allocate memory\n");
    return -1;
}


Range(ptr,iSize,iValue1,iValue2);

free(ptr);
return 0;
}