#include<stdio.h>
#include<string.h>
int main() {

    char str[26];
    int strLen, stack = 0;
    scanf("%s", &str);
    strLen = strlen(str);
    for (int i = 0; i < strLen; i++)
    {
        str[i] == '(' ? stack++ : stack--;


        if (stack < 0)
        {
            printf("No\n");
            return 0;
        }


    }
    
    stack == 0 ? printf("Yes\n") : printf("No\n");

    return 0;
}