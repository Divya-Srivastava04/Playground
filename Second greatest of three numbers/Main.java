#include<stdio.h>
int main()
{
 int n1, n2, n3;
 scanf("%d \n %d \n %d \n ", &n1, &n2, &n3);
 if(n1 > n2 && n1 < n3)
   printf("second greatest = %d", n1);
 else if(n2 > n1 && n2 < n3)
   printf("second greatest = %d", n2);
 else
   printf("second greatest = %d", n3);
  return 0;
}