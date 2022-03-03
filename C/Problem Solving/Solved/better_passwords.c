#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void placeMe(char *strPtr, unsigned int index, char replaceWith)
{
    int strLength = strlen(strPtr), k, j = 0;
    k = strLength + 1;
    char *strBackup = (char *)malloc(strLength);
    strcpy(strBackup, strPtr);
    strPtr = realloc(strPtr, (k));
    for (int i = 0; i < strLength + 1; i++)
    {
        if (i == index)
        {
            strPtr[j] = replaceWith;
            j++;
        }

        strPtr[j] = strBackup[i];
        j++;
    }

    free(strBackup);
}
int main()
{

    // char password[] = "polo";
    char *str;
    int len;
    str = (char *)malloc(16);
    // strcpy(str, password);
    scanf("%s", str);
    len = strlen(str);
    str[0] = str[0] - 32;
    for (int i = 1; i < len; i++)
    {
        if (str[i] == 's')
        {
            str[i] = '$';
        }
        else if (str[i] == 'i')
        {
            str[i] = '!';
        }
        else if (str[i] == 'o')
        {
            str[i] = '(';
            placeMe(str, i + 1, ')');
            len = strlen(str);
        }
    }
    len = strlen(str);
    placeMe(str, len, '.');
    printf("%s\n", str);
    free(str);

    return 0;
}
