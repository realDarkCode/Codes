#include <stdio.h>
void printBangladesh(int timesToPrint);
void main()
{

    printBangladesh(5);
}
void printBangladesh(int timesToPrint)
{
    for (int i = 0; i < timesToPrint; i++)
    {
        printf("Hello World\n");
    }
}