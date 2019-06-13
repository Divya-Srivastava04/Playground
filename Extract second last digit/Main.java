#include<stdio.h>
int main()
{
  int num,temp,digit;
  scanf("%d", &num);
  temp=num%100;
  temp=temp%100;
  temp=temp%100;
  digit=temp/10;
  printf("%d", digit);
  return 0;
}