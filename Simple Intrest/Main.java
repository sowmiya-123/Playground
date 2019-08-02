#include<stdio.h>
int main()
{
   int n;
  float p,rate,si;
  scanf("%f",&p);
  scanf("%d",&n);
  scanf("%f",&rate);
  si=((p*n*rate)/100.0);
  printf("%f",si);
return 0;
}