
/*


    value       1 2 3 4 5 6
    position    0 1 2 3 4 5
    
    value       1 2 3 4 5 
    position    0 1 2 3 4 


*/
#include <stdio.h>
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void arrayRev(int array[], int arraylen)
{
    int count = arraylen / 2;
    for (int i = 0; i < count; i++)
    {

        swap(&array[i], &array[arraylen - 1]);
    }
}
void printArray(int array[], int arraylen)
{
    for (int i = 0; i < arraylen; i++)
    {
        printf("%d ", array[i]);
    }
    printf("\n");
}

void main()
{
    int marks[] = {10, 20, 30, 40};
    int arrayLen = sizeof(marks) / sizeof(int);
    printArray(marks, arrayLen);
    printf("after running function\n");
    arrayRev(marks, arrayLen);
    printArray(marks, arrayLen);
}