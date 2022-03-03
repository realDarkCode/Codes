#include <stdio.h>
#include <string.h>
void swap(char *a, char *b)
{
    char temp = *a;
    *a = *b;
    *b = temp;
}
int main()
{
    char string[99];
    int stringLength, n, result;
    scanf("%s", &string);
    stringLength = strlen(string);
    // copying the string
    char stringCopy[stringLength];
    for (int i = 0; i < stringLength; i++)
    {
        stringCopy[i] = string[i];
    }
    stringCopy[stringLength] = '\0';

    //reversing the main string
    n = stringLength / 2;
    stringLength--;
    for (int i = 0; i < n; i++)
    {
        swap(&string[i], &string[stringLength - i]);
    }
    // comparing both string
    result = strcmp(string, stringCopy);
    if (result == 0)
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }

    return 0;
}