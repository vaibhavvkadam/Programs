#include<stdio.h>
void Pattern(int iRow,int iColumn)
{ 
    int iCntR=0,iCntC=0;
    
   
    
    for(iCntR=1;iCntR<=iRow;iCntR++)
    {
        
       for(iCntC=iCntR;iCntC<=iColumn;iCntC++)
            {
            printf("* ");
           }
        for(iCntC=1;iCntC<=iCntR-1;iCntC++)
            {
            printf("# ");
           }
        
        printf("\n");
        
        
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