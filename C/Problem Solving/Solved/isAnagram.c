#include <stdio.h>
#include <string.h>
int main()
{
    char inputA[100];
    char inputB[100];
    int result = 0, stringLength, matched = 0;
    gets(inputA);
    gets(inputB);
    stringLength = strlen(inputA);
    if (stringLength != strlen(inputB))
    {
        printf("No\n");
        return 0;
    }
    for (int i = 0; i < stringLength; i++)
    {
        for (int j = 0; j < stringLength; j++)
        {
            if (inputA[i] == inputB[j])
            {
                matched = 1;
                inputA[i] = '.';
                break;
            }
        }
        if (matched == 1)
        {
            matched = 0;
        }
        else
        {
            printf("No\n");
            return 0;
        }
    }
    printf("Yes\n");
    return 0;
}