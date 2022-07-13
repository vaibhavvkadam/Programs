#include<stdio.h>
void Pattern(int iRow,int iColumn)
{ 
    int iCntR=0,iCntC=0,iTemp=1;
    for(iCntR=1;iCntR<iColumn;iCntR++)
    {
        for(iCntC=1;iCntC<=iColumn;iCntC++)
        {
            printf(" %d ",iTemp);  
            iTemp++;

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