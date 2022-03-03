#include <stdio.h>
#include <stdlib.h>
int doesNotContain(int* arr, int number, int length) {
    for (int i = 0; i < length; i++) {
        if (arr[i] == number)
            return 0;

    }
    return 1;
}
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
void selectionSort(int* arr, int arrLen) {
    int minIndex;
    for (int i = 0; i < arrLen - 1; i++)
    {
        minIndex = i;
        for (int j = minIndex; j < arrLen - 1; j++)
        {
            if (arr[j] < arr[minIndex])
            {
                swap(&arr[i], &arr[j]);
            }

        }


    }

}
int main() {
    int m, n, len, num, index = 1;
    int* array;
    array = ( int* )malloc(sizeof(int) * index);
    scanf("%d %d", &m, &n);
    len = m + n;
    for (size_t i = 0; i < len; i++) {
        scanf("%d", &num);
        if (doesNotContain(array, num, index))
        {
            array[index - 1] = num;
            index++;
            array = ( int* )realloc(array, sizeof(int) * index);
        }

    }
    selectionSort(array, index);
    for (int i = 0; i < index - 1; i++)
    {
        if (i == index - 2)
        {
            printf("%d", array[i]);

        }
        else {
            printf("%d ", array[i]);

        }


    }
    free(array);
    return 0;
}
