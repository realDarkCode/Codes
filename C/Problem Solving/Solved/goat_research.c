#include <stdio.h>
#include <string.h>
int main()
{
    int testCase, ll, aLen, maxALen = 0, sLen;
    scanf("%d", &testCase);
    char data[testCase][21];
    char lineInp[21];
    for (int i = 0; i < testCase; i++)
    {
        ll = 0;
        scanf("%s", &lineInp);
        while (lineInp[ll] != '\0')
        {
            data[i][ll] = lineInp[ll];
            ll++;
        }
        if (ll > maxALen)
        {
            maxALen = ll;
        }
        aLen = ll - 1;

        if (aLen == 1)
        {
            data[i][ll] = 'a';
            ll++;
        }
        else if (aLen % 2 != 0)
        {
            ll--;
        }

        data[i][ll] = '\0';
    }

    for (int i = 0; i < testCase; i++)
    {
        sLen = (maxALen - strlen(data[i])) / 2;
        while (sLen > 0)
        {
            printf(" ");
            sLen--;
        }

        printf("%s\n", data[i]);
    }

    return 0;
}
