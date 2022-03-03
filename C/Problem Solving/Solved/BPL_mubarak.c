#include <stdio.h>

int main()
{
    int testCase, count, over, ball, i, j = 0;
    char line[101];
    scanf("%d", &testCase);
    while (j < testCase)
    {

        scanf("%s", &line);
        count = 0;
        i = 0;
        while (line[i] != '\0')
        {
            if (line[i] != 'N' && line[i] != 'D' && line[i] != 'W')
            {
                count++;
            }
            i++;
        }
        over = count / 6;
        ball = count % 6;
        if (ball == 0)
        {
            printf("%d %s\n", over, over > 1 ? "OVERS" : "OVER");
        }
        else if (over == 0)
        {
            printf("%d %s\n", ball, ball > 1 ? "BALLS" : "BALL");
        }
        else
        {
            printf("%d %s %d %s\n", over, over > 1 ? "OVERS" : "OVER", ball, ball > 1 ? "BALLS" : "BALL");
        }
        j++;
    }
    return 0;
}