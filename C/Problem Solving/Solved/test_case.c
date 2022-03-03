#include<stdio.h>

int main() {
    int n, cpuLimit, memoryLimit;
    int ansDiff, cpu, memory;
    int wa = 0, cpuE = 0, memoryE = 0;
    scanf("%d %d %d", &n, &cpuLimit, &memoryLimit);
    while (n > 0)
    {
        scanf("%d %d %d", &ansDiff, &cpu, &memory);
        if (cpu > cpuLimit)
        {
            cpuE++;
            break;
        }
        else if (memory > memoryLimit)
        {
            memoryE++;
            break;
        }
        else if (ansDiff != 0) {
            wa++;
            break;
        }

        n--;

    }
    if (cpuE)
    {
        printf("CLE\n");
    }
    else if (memoryE) {
        printf("MLE\n");
    }
    else if (wa) {
        printf("WA\n");
    }
    else {
        printf("AC\n");
    }


    return 0;
}