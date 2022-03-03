#include <stdio.h>

int main()
{
    int number, r = 1;
    scanf("%d", &number);
    for (int i = 2; i < number; i++)
    {
        if (number % i == 0)
        {
            r = 0;
            break;
        }
    }

    if (r == 1)
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }

    return 0;
}