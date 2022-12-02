#include<stdio.h>
#include<conio.h>
int main()
{
clrscr();
int a,i,j=1,x=0;
printf("Input the number of lines: ");
scanf("%d",&a);
for(i=1;i<=a;i++)
{
printf("%d %d %d",i,i*i,i*i*i);
}
getch();
}