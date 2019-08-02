#include<stdio.h>
#define PI 3.14
int main()
{
  float a,b,arc;
  scanf("%f",&a);
  scanf("%f",&b);
  arc=((b*2*PI*a)/360);
  printf("%.2f",arc);
  return 0;
}