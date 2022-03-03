#include <stdio.h>
void kmToMiles(float kilometer)
{
    printf("%.3f kilometer = %.3f mile\n", kilometer, kilometer / 1.609);
}
void inchToFoot(float inch)
{
    printf("%.3f inch = %.3f foot\n", inch, inch / 12);
}
void cmToInch(float centimeter)
{
    printf("%.3f centimeter = %.3f meter\n", centimeter, centimeter / 2.54);
}
void inchToMeter(float inch)
{
    printf("%.3f inch = %.3f meter\n", inch, inch / 39.37);
}

float takeInput(short option)
{
    float userInput;

    if (option == 0) // taking input for selecting type conversation of quiting the porgram
        printf("Please enter the one of the option:\n");
    scanf("%f", &userInput);
    {
        if ((int)userInput < 0 && (int)userInput < 5)
        {
            printf("Wrong option!, select again \n");
            takeInput(0);
        }
        else
        {
            (int)userInput;
        }
    }
    if (option == 1)
    {
        printf("Enter the value you want to convert:\n");
        scanf("%f", &userInput);
        return userInput;
    }
}

void main()
{
    printf("select 1 to convert kilometer to mile\n");
    printf("select 2 to convert inch to foot\n");
    printf("select 3 to convert centimeter to inch\n");
    printf("select 4 to convert inch to meter\n");
    printf("select 0 to quit\n");
    int option = takeInput(0);
    float unitValue = takeInput(1);
    switch (option)
    {
    case 0:
        goto end;
        break;
    case 1:
        kmToMiles(unitValue);
        break;
    case 2:
        inchToFoot(unitValue);
        break;

    case 3:
        cmToInch(unitValue);
        break;

    case 4:
        inchToMeter(unitValue);
        break;
    default:
        break;
    }
end:
    printf("quiting program.\n");
}