#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

int CHKVowel(char cVal)
{
if(cVal=='a'||cVal=='e'||cVal=='i'||cVal=='o'||cVal=='u')
{
    return TRUE;
}
else{
    return FALSE;
}

}
int main()
{
    char cValue='\0';
    BOOL bRet=FALSE;

    printf("Enter character\n");
    scanf("%c",&cValue);

    bRet=CHKVowel(cValue);
    if(bRet==TRUE)
    {
        printf("%c is vowel",cValue);
    }
    else{
        printf("%c is not vowel",cValue);
    }

}