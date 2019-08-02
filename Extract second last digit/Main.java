#include<stdio.h>
int main()
{
  int a,b,n;
  scanf("%d\n",&n);
  a=(n%100);
  b=(a/10);
  printf("%d",b);
  return 0;
}