#include <stdio.h>
int main() 
{
	int a,sum=0,n;
  scanf("%d",&a);
  while(a!=0)
  {
    n=a%10;
    sum=sum+n;
    a=a/10;
  }
  printf("%d",sum);
 
	return 0;
}