#include <stdio.h>

int main()
{
    char number[100010];
    int result[10][2] = {{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}};
    int i = 0, r, rr;
    scanf("%s", &number);
    while (number[i] != '\0')
    {
        result[number[i] - '0'][1]++;
        i++;
    }
    r = result[0][1];
    rr = result[0][0];
    for (int count = 0; count < 10; count++)
    {
        if (result[count][1] > r)
        {
            r = result[count][1];
            rr = result[count][0];
        }
    }
    printf("%d\n", rr);
    return 0;
}