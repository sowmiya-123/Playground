#include<stdio.h>
int main()
{
  int num1,num2,lcm,small,i;
  scanf("%d",&num1);
  scanf("%d",&num2);
  small=num1>num2?num2:num1;
    for(i=small;i>-1;i--)
        {
          if(num1%i==0 && num2%i==0)
          {
            lcm=((num1*num2)/i);
            printf("%d",lcm);
            break;
          }
        }
  return 0;
}