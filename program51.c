#include<stdio.h>
void Display(int iNo)
{
char ch='A';
int iCount=0;
for(iCount=0;iCount<5;iCount++)
{
printf("%c ",ch);
ch++;
}
}


int main()
{
int iValue=0;


printf("Enter number\n");
scanf("%d",&iValue);

Display(iValue);

    return 0;
}