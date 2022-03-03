#include<stdio.h>
#include<string.h>


/*
input: "        <h1> This is the best heading </h1>    ""
Output:"This is the best heading"
*/
void parser(char *string) {
    int index = 0, inside = 0, stringLength = strlen(string);
    // parsing the text
    for(int i = 0; i < stringLength; i++) {
        if(string[i] == '<') {
            inside = 1;
            continue;
        }else if (string[i] == '>') {
            inside =  0;
            continue;
        }
        if(inside == 0) {
            string[index] = string[i];
            index++;
        }
    }
     string[index] = '\0';
    // tailling before spaces 
    while(string[0] == ' ') {
        for(int i = 0; i < strlen(string); i++) {
            string[i] = string[i+ 1];
        }
    }
    // tailling after spaces
       while(string[strlen(string) - 1] == ' ') {
       string[strlen(string) - 1] = '\0';
    }

}

void main() {
    char text[] = "<h1>    This is the best heading           </h1>";
    parser(text);
    printf("Parsed text: ~~%s~~", text);
}