#include <stdio.h>
#include<math.h>
int main()
{
  	int a,b,d;
  scanf("%d",&a);
  scanf("%d",&b);
  if(b>=0)
  {
    d=pow(a,b);
    printf("%d",d);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}