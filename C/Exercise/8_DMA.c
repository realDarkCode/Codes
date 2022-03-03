#include <stdio.h>
#include <stdlib.h>

void main()
{
    int lengthOfID = 1;
    char *id;
    id = (char *)malloc(lengthOfID * sizeof(char));
    for (int i = 0; i < 3; i++)
    {

        printf("Please enter the length of employe id:\n");
        scanf("%d", &lengthOfID);
        id = (char *)realloc(id, lengthOfID * sizeof(char));
        printf("Enter the ID of your employe:\n");
        scanf("%s", &(*id));
        printf("Your Employe ID is:%s\n", id);
    }
}