#include<stdio.h>

int Check_Frequency_LessNum_Six(int iNo)
{
int iDigits=0,iCount=0;
while(iNo)
{
iDigits=iNo%10;
if(iDigits<6)
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

iRet=Check_Frequency_LessNum_Six(iValue);
printf("Frequency of less than six number is:%d",iRet);



    return 0;
}