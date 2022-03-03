#include <stdio.h>
int main()
{

    int s, si, ei, sum = 0;
    scanf("%d %d %d", &s, &si, &ei);
    int n[s];

    for (size_t i = 0; i < s; i++)
    {
        scanf("%d", &n[i]);
    }

    for (size_t i = si; i <= ei; i++)
    {

        sum += n[i];
    }
    printf("%d\n", sum);
    return 0;
}