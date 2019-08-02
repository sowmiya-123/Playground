#include <stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int count=1;
  int temp=1;
  while(temp<=n)
  {
    if(count%2==1)
    {
      printf("%d\n",count);
      temp=temp+1;
    }
    count=count+1;
  }
	return 0;
}