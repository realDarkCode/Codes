#include <stdio.h>

int main()
{

    int len, i = 0;
    double avg, num, sum = 0;
    scanf("%d", &len);
    while (len > 0)
    {
        scanf("%lf", &num);
        sum += num;
        i++;
        avg = sum / i;
        if (avg - (int)avg == 0)
        {

            printf("%.0f\n", avg);
        }
        else
        {
            printf("%.10f\n", avg);
        }
        len--;
    }

    return 0;
}