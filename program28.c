#include<stdio.h>

int Count_Number_Between_ThreeAndSeven(int iNo)
{
int iDigits=0,iCount=0;
while(iNo)
{
iDigits=iNo%10;
if(iDigits>3 && iDigits<7)
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

iRet=Count_Number_Between_ThreeAndSeven(iValue);
printf("Count  Number Between Three And Seven:%d",iRet);



    return 0;
}