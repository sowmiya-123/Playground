#include<stdio.h>
int main()
{
	int n,a,d,nt,nte;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    nt=(n+1)/2;
    nte=a+((nt-1)*d);
    printf("%d",nte);
  }
  else
  {
    a=0,d=1;
    nt=n/2;
    nte=a+((nt-1)*d);
    printf("%d",nte);
  }
  return 0;
}