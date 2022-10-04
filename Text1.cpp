#include <stdio.h>

int main(){

char name[20];
int b; 

printf("name: ");
scanf("%s",&name);

printf("age:");
scanf("%d",&b);

if(b>=18){
    printf("you can vote");
}

else{
printf("you cant vote");
}


return 0;
}


