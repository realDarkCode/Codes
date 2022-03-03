#include <stdio.h>

int main()
{
    int a11, a12, a21, a22, b11, b12, b21, b22;
    scanf("%d %d", &a11, &a12);
    scanf("%d %d", &a21, &a22);
    scanf("%d %d", &b11, &b12);
    scanf("%d %d", &b21, &b22);
    printf("%d %d\n", (a11 * b11 + a12 * b21), (a11 * b12 + a12 * b22));
    printf("%d %d\n", (a21 * b11 + a22 * b21), (a21 * b12 + a22 * b22));

    return 0;
}