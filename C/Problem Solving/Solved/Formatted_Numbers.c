#include <stdio.h>
#include <string.h>

int main()
{
    char input[20];
    int i;
    gets(input);
    int index = 0, count = 0;
    int output[30];
    // 5000
    for (i = strlen(input) - 1; i >= 0; i--)
    {
        if (count == 3)
        {
            output[index++] = ',';
            output[index++] = input[i];
            count = 0;
        }
        else
            output[index++] = input[i];
        count++;
    }

    for (i = index - 1; i >= 0; i--)
    {
        printf("%c", output[i]);
    }
    printf("\n");
}