#include <stdio.h>

int main()
{
    int row;
    scanf("%d", &row);

    for (size_t i = 1; i <= row; i++)
    {
        for (size_t s = 0; s < row - i; s++)
        {
            printf(" ");
        }

        for (size_t j = 1; j <= i; j++)
        {
            if (i == j)
            {
                printf("*");
                continue;
            }

            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
