#include<stdio.h>
void Pattern(int iRow,int iColumn)
{ 
    int iCntR=0,iCntC=0,iTemp=0;
   
    
    for(iCntR=1;iCntR<=iRow;iCntR++)
    {
        
        if(iCntR%2!=0)
        {
     iTemp=2;
        for(iCntC=1;iCntC<=iColumn;iCntC++)
        {
            printf("%d ",iTemp);
            iTemp=iTemp+2;
            }
        
        printf("\n");
        
         }
        
         else
         {
          iTemp=1;
        for(iCntC=1;iCntC<=iColumn;iCntC++)
        {
            printf("%d ",iTemp);
            iTemp=iTemp+2;
        }
        printf("\n");
         }
    }
}


int main()
{
    int iValue1=0,iValue2=0;
    printf("Enter numbers\n");
    scanf("%d %d",&iValue1,&iValue2);
    Pattern(iValue1,iValue2);
    return 0;
}