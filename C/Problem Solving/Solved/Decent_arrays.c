#include <stdio.h>
#include <stdlib.h>
int main()
{
    int i, size, isAscending = 1;
    int *numberArray;
    scanf("%d", &size);
    numberArray = malloc(size * sizeof(int));
    for (i = 0; i < size; i++)
    {
        scanf("%d", &numberArray[i]);
    }
    for (i = 0; i < size - 1; i++)
    {

                if (numberArray[i] > numberArray[i + 1])
        {
            isAscending = 0;
            break;
        }
    }
    free(numberArray);
    if (isAscending)
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }

    return 0;
}