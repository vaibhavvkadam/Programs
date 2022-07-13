#include<stdio.h>

int Check_Frequency_Four(int iNo)
{
int iDigits=0,iCount=0;
while(iNo)
{
iDigits=iNo%10;
if(iDigits==4)
{
    iCount++;
}
iNo=iNo/10;
}
return iCount;
}

int main()
{
int iValue=0;
int iRet=0;
printf("Enter a number\n");
scanf("%d",&iValue);

iRet=Check_Frequency_Four(iValue);
printf("Frequency of 4 is:%d",iRet);



    return 0;
}