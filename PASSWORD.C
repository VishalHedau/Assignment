#include<stdio.h>
#include<conio.h>
int main()
{
clrscr();
int pass, x=10;
while(x!=0)
{
printf("\nInput the password:");
scanf("%d",&pass);
if(pass==1234)
{
printf("correcty password");
x=0;
}
else
{
printf("Wrong password");
}
printf("\n");
}
getch();
}