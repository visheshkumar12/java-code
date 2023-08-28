#include<stdio.h>
#include<math.h>
// CHECKING UPPERCASE OR LOWERCASE

int main(){
    char alpha;
    printf("ENTER A ALPHABET :");
    scanf("%c",&alpha);

    if(alpha>='A' && alpha<='Z'){
        printf("ALPHABET IS IN UPPERCASE");
    }else if(alpha>='a' && alpha<='z'){
        printf("ALPHABET IS IN LOWERCASE");
    }else{
        printf("NOT A ALPHABET");
        return 0;
    }
}