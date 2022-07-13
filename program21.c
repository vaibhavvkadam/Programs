#include<stdio.h>
void Display_Digits(int iNo)
{
int iDigits=0;
while(iNo)
{
iDigits=iNo%10;
printf("%d\n",iDigits);
iNo=iNo/10;
}
}
int main()
{
int iValue=0;
printf("Enter a number\n");
scanf("%d",&iValue);

Display_Digits(iValue);

    return 0;
}