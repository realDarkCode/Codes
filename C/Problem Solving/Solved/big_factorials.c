#include <stdio.h>
unsigned long long int factorial(unsigned long long int n)
{
    if (n == 1)
    {
        return n;
    }
    return n * factorial(n - 1);
}
int main()
{
    int number;
    long long int facto;

    scanf("%d", &number);
 
    if (number >= 20)
    {
        printf("0000\n");
        return 0;
    }

    facto = factorial(number);

    printf("%lld\n", facto % 10000);

    return 0;
}