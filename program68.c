#include<stdio.h>
void Pattern(int iRow,int iColumn)
{ 
    int iCntR=0,iCntC=0;
    char ch='a';
   
    
    for(iCntR=1;iCntR<=iRow;iCntR++)
    {
        
        if(iCntR%2==0)
        {
     
        for(iCntC=1;iCntC<=iColumn;iCntC++)
            {
            printf("%d ",iCntC);
            
            }
        
        printf("\n");
        
         }
        
         else
         {
          ch='a';
        for(iCntC=1;iCntC<=iColumn;iCntC++)
        {
            printf("%c ",ch);
            ch++;
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