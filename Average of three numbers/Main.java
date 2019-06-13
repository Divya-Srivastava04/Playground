#include<stdio.h>
int main()
{
  int n1, n2, n3, sum, avg;
  scanf("%d \n %d \n %d \n", &n1, &n2, &n3);
  sum=n1+n2+n3;
  avg=sum/3;
  printf("%d",avg);
  return 0;
}