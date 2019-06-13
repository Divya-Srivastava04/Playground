#include<stdio.h>
int main()
{
  int num, temp, fd, sum;
  scanf("%d", &num);
  temp=num/10;
  fd=temp;
  temp=num%10;
  sum= fd+temp;
  printf("%d",sum);
  return 0;
}