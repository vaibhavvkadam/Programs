#include<stdio.h>

int Diff_Of_SumEvenAndSumOddDigits(int iNo)
{
int iDigits=0,iEvenSum=0,iOddSum=0,iDiffSum_Of_Even_Odd;
while(iNo)
{
iDigits=iNo%10;
iNo=iNo/10;
if(iDigits%2==0){
    iEvenSum+=iDigits;
}
else{
    iOddSum+=iDigits;
}

}
iDiffSum_Of_Even_Odd=iEvenSum-iOddSum;
return iDiffSum_Of_Even_Odd;
}

int main()
{
int iValue=0;
int iRet=0;
printf("Enter a number\n");
scanf("%d",&iValue);

iRet=Diff_Of_SumEvenAndSumOddDigits(iValue);
printf("Diff Of Summation of Even And Odd Digits is:%d",iRet);



    return 0;
}