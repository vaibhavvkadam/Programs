#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;
BOOL Check_Zero_Digits(int iNo)
{
int iDigits=0;
while(iNo)
{
iDigits=iNo%10;
if(iDigits==0)
{
    return TRUE;
    break;
}
iNo=iNo/10;
}
return FALSE;
}

int main()
{
int iValue=0;
BOOL bRet=FALSE;
printf("Enter a number\n");
scanf("%d",&iValue);

bRet=Check_Zero_Digits(iValue);
if(bRet==TRUE)
{
printf("it contains zero");
}
else{
    printf("no zero");
}

    return 0;
}