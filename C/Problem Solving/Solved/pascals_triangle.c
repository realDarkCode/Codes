#include <stdio.h>
#include <math.h>
int main()
{
    int row;
    scanf("%d", &row);
    if (row == 1)
    {
        printf("1\n");
    }
    else
    {
        printf("%.0lf\n", pow(2, (row - 1)));
    }
    return 0;
}