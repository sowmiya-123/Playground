#include <stdio.h>
int main() 
{
	int b,a,n,sum=0;
  scanf("%d",&n);
  b=n;
  while(n>0)
  {
    a=n%10;
    sum=sum+(a*a*a);
    n=n/10;
  }
  if(sum==b)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}