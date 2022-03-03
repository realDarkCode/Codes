#include <stdio.h>

void main(int argc, char const *argv[])
{
    int userInput, i = 0, lenOfPattern = 5;
    printf("Enter 0 for trinangular pattern\nEnter 1 for reverse trinangular pattern:\n");
    scanf("%d", &userInput);

    if (userInput == 0)
    {
        for (; i < lenOfPattern; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                printf("* ");
            }
            printf("\n");
        }
    }
    else if (userInput == 1)
    {
        for (i = lenOfPattern; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                printf("* ");
            }
            printf("\n");
        }
    }
}
