#include <stdio.h>

int main()
{
    int x, y, i = 0;
    scanf("%d %d", &x, &y);
    while (y % x != 0)
    {
        i++;
        y++;
    }
    printf("%d\n", i);
    return 0;
}