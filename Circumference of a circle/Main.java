#include<stdio.h>
#define PI 3.14
int main()
{
  float r, circum;
  scanf("%f", &r);
  circum = PI * r * r;
  printf("%0.2f", circum);
  return 0;
}