#include<stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d",&n1);
  scanf("%d",&n2);
   scanf("%d",&n3);
        if((n1>n2)&&(n1>n3))
        {
          if(n2>n3)
          {
            printf("%d",n2);
          }
          else
          {
            printf("%d",n3);
          }
        }
        else if(n2>n3)
        {
          if(n1>n3)
          {
            printf("%d",n1);
          }
          else
          {
            printf("%d",n3);
          }
        }
        else
        {
          if(n1>n2)
          {
            printf("%d",n1);
          }
          else 
          {
            printf("%d",n2);
          }
        }
        return 0;
        }
