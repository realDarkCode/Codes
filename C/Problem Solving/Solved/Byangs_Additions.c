#include <stdio.h>

int checkByang(int num1, int num2)
{
    int reminderOfNum1, reminderOfNum2, result = 0;
    while (num1 != 0 || num2 != 0)
    {
        reminderOfNum1 = num1 % 10;
        reminderOfNum2 = num2 % 10;
        if (reminderOfNum1 + reminderOfNum2 >= 10)
        {
            result = 1;
            break;
        }
        num1 /= 10;
        num2 /= 10;
    }
    return result;
}
int main()
{
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    if (checkByang(num1, num2))
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }

    return 0;
}