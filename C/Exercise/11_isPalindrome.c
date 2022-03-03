#include <stdio.h>
// #define debug 1
int isPalindrome(int number)
{
    int reversedNumber = 0, reminder, n = number;
    while (number != 0)
    {
        reminder = number % 10;
        reversedNumber = reversedNumber * 10 + reminder;
        number /= 10;
#ifdef debug
        printf("Reminder: %d, Reversed Number: %d, Number: %d\n", reminder, reversedNumber, number);
#endif
    }

    return (n == reversedNumber);
}

void main()
{
    int userInput, isP;
    printf("Enter the number to check the number is palindrome or not:\n");
    scanf("%d", &userInput);

    isP = isPalindrome(userInput);
#ifdef debug
    printf("isPalinDrome Func return %d\n", isP);
#endif
    if (isP)
    {
        printf("%d the number is palindrome.\n", userInput);
    }
    else
    {
        printf("%d the number is not palindrome.\n", userInput);
    }
}