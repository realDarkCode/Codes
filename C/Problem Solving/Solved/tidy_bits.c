#include <stdio.h>
#include <math.h>
int main()
{
    long long n, r, i, count = 0, sum = 0, p;
    scanf("%lld", &n);
    while (n != 0)
    {
        r = n % 2;
        if (r == 1)
            count++;
        n /= 2;
    }
    for (i = 0; i < count; i++)
    {
        p = pow(2, i) + 0.000000001;
        sum += p;
    }
    printf("%lld\n", sum);
    return 0;
}