#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int randomNumGen(int max)
{
    srand(time(NULL));
    return (rand() % max) + 1;
}

int whoWin(int playerChoice)
{
    int computerChoice = randomNumGen(3);
    // choice: 1 -> rock, 2-> paper 3 -> scissors
    // return value: 0 -> draw, 1 -> Players wins, 2 -> Computer Wins
    if (computerChoice == playerChoice)
    {
        return 0;
    }
    else if ((computerChoice == 1 && playerChoice == 3) || (computerChoice == 2 && playerChoice == 1) || (computerChoice == 3 && playerChoice == 2))
    {
        return 1;
    }
    else
    {
        return 2;
    }
}

int takePlayeInput()
{
    int userChoice;
    printf("Please Enter A number:\n1 for rock\n 2 for paper\n 3 for scissor:\n");
    scanf("%d", &userChoice);
    if ((userChoice == 1) || (userChoice == 2) | (userChoice == 3))
    {
        return userChoice;
    }
    else
    {
        printf("Please inter a valid number:\n");
        takePlayeInput();
    }
}
void main()
{
    int gameData[2][2] = {{1, 0}, {2, 0}};
    char playerName[20];

    printf("Enter your name:\n");
    scanf("%s", &playerName);

    int temp, userChoice, i = 0;
    while (i < 3)
    {
        userChoice = takePlayeInput();
        temp = whoWin(userChoice);
        if (temp == 1)
        {
            printf("%s wins this round\n", playerName);
            gameData[0][1]++;
        }
        else if (temp == 2)
        {
            printf("Computer Wins this round\n");
            gameData[1][1]++;
        }
        else if (temp == 0)
        {
            printf("It's Draw\n");
        }
        else
        {
            printf("Unknown game logic");
        }
        i++;
    }

    //result announcement
    if (gameData[0][1] > gameData[1][1])
    {
        printf("Congratulation %s win this Match with %d:%d\n", playerName, gameData[0][1], gameData[1][1]);
    }
    else if (gameData[0][1] < gameData[1][1])
    {
        printf("Computer win this Match with %d:%d\n", gameData[0][1], gameData[1][1]);
    }
    else
    {
        printf("this match is draw\n");
    }
}