#include <stdio.h>
#include <string.h>
int main()
{
    int shiftLen, strlength, k;
    char msg[101];

    scanf("%d\n", &shiftLen);
    gets(msg);
    strlength = strlen(msg);
    for (int i = 0; i < strlength; i++)
    {
        if (msg[i] >= 97 && msg[i] <= 122)
        {
            if (msg[i] - shiftLen >= 97)
            {
                msg[i] -= shiftLen;
            }
            else
            {
                k = shiftLen - 1;
                msg[i] = msg[i] + (25 - k);
            }
        }
    }
    printf("%s\n", msg);
    return 0;
}