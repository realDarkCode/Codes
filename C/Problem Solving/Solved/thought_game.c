#include<stdio.h>

int main() {

    int n, x, y;
    scanf("%d", &n);
    while (n > 0)
    {
        scanf("%d %d", &x, &y);
        if (((x + y) / 2) % 2 == 0)
        {
            printf("Sadia will be happy.\n");
        }
        else {
            printf("Oops!\n");
        }

        n--;
    }

    return 0;
}