#include<stdio.h>
int main()
{
  int num=365;
  int divisor=4;
  int quotient=num/divisor;
  int remainder=num%divisor;
  printf("Quotient: %d \n", quotient);
  printf("Remainder: %d \n", remainder);
  return 0;
}