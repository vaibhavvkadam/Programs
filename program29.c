#include<stdio.h>

int Mult_Digits(int iNo)
{
int iDigits=0,iMult=1;
while(iNo)
{
iDigits=iNo%10;
iNo=iNo/10;
if(iDigits>0)
iMult*=iDigits;
}
return iMult;
}

int main()
{
int iValue=0;
int iRet=0;
printf("Enter a number\n");
scanf("%d",&iValue);

iRet=Mult_Digits(iValue);
printf("Multification of all Digits:%d",iRet);



    return 0;
}