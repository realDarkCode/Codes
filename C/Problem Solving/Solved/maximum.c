#include <stdio.h>

int main()
{

    int length, number, maximum = 0;
    scanf("%d", &length);
    for (int i = 0; i < length; i++)
    {
        scanf("%d", &number);
        if (number > maximum)
            maximum = number;
    }
    printf("%d\n", maximum);

    return 0;
}