#include<stdio.h>
int main()
{
  int a,n,sum=0;
  scanf("%d",&n);
   while(n>0)
  {
  a=(n%10);
  sum=sum+a;
  n=(n/10);
  }
  printf("%d",sum);
  return 0;
}