#include<stdio.h>
int main()
{
  int num, temp1, temp2, fd, td, sum;
  scanf("%d", &num);
  temp1= num/100;
  fd=temp1;
  temp1= num%100;
  temp2=temp1%10;
  td=temp2;
  sum= fd+td;
  printf("%d", sum);
  return 0;
}