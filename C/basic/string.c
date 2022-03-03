#include <stdio.h>
#include <string.h>

void main()
{
    char s1[16], s2[16];
    printf("Enter two of your frinds name:\n");
    gets(s1);
    gets(s2);
    char s3[] = " is a friend of ";

    char output[60];
    strcpy(output, strcat(strcat(s1, s3), s2));
    printf("%s\n", output);
}