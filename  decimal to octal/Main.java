#include<stdio.h>
int main()
{
  int a,i,arr[100],rem=0;
  scanf("%d",&a);
  while(a>0)
  {
    arr[rem++]=a%8;
    a=a/8;
  }
  for(i=rem-1;i>=a;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}