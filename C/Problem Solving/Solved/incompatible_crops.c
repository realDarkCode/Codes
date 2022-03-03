#include <stdio.h>

int main()
{
    int dataRow, dataColum, compatibleCount = 0;
    short topSide = 0, rightSide = 0, bottomSide = 0, leftSide = 0;
    scanf("%d %d", &dataRow, &dataColum);
    char dataSet[dataRow][dataColum], line[dataColum + 1];

    for (int row = 0; row < dataRow; row++)
    {
        scanf("%s", &line);
        for (int colum = 0; colum < dataColum; colum++)
        {

            dataSet[row][colum] = line[colum];
        }
    }

    for (int row = 0; row < dataRow; row++)
    {
        for (int colum = 0; colum < dataColum; colum++)
        {
            topSide = 0, rightSide = 0, bottomSide = 0, leftSide = 0;
            // check self
            if (dataSet[row][colum] == '*')
            {
                continue;
            }

            // check top side
            if (row - 1 >= 0 && dataSet[row - 1][colum] == '*')
            {

                topSide = 1;
            }
            // check right side
            if (colum + 1 < dataColum && dataSet[row][colum + 1] == '*')
            {

                rightSide = 1;
            }
            // check bottom side
            if (row + 1 < dataRow && dataSet[row + 1][colum] == '*')
            {

                rightSide = 1;
            }
            // check left side
            if (colum - 1 >= 0 && dataSet[row][colum - 1] == '*')
            {

                leftSide = 1;
            }

            if (topSide == 0 && rightSide == 0 && bottomSide == 0 && leftSide == 0)
            {
                compatibleCount++;
            }
        }
    }
    printf("%d\n", compatibleCount);

    return 0;
}