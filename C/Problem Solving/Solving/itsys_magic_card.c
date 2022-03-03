
#include <stdio.h>
#include <string.h>
int count = 0;
// Generate all permutation
char block[2][2] = {
    {'B', 'D'},
    {'B', 'E'},
};
void swap(char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

void permute(char *str, int startIndex, int endIndex)
{
    int i;
    int len;
    if (startIndex == endIndex)
    {
        len = strlen(str);
        printf("%s : %d\n", str, isPlaceable(str, len, block, 1));
        if (isPlaceable(str, len, block, 1))
        {
            count++;
        }
    }
    else
    {
        for (i = startIndex; i <= endIndex; i++)
        {
            swap((str + startIndex), (str + i));
            permute(str, startIndex + 1, endIndex);
            swap((str + startIndex), (str + i));
        }
    }
}
int isPlaceable(char *str, int strLen, char block[][2], int blockLen)
{
    for (int i = 0; i < blockLen; i++)
    {
        for (int j = 0; j < strLen - 1; j++)
        {
            if (str[j] == block[i][0] || str[j] == block[i][1])
            {
                if (str[j + 1] == block[i][0] || str[j + 1] == block[i][1])
                {
                    return 0;
                }
            }
        }
    }
    return 1;
}
int main()
{
    char inp[] = "ABC";
    int mainStrLen = strlen(inp);
    char block[2][2] = {
        {'A', 'B'},
    };
    permute(inp, 0, mainStrLen - 1);
    printf("count: %d\n", count);
    return 0;
}
