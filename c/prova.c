#include <stdio.h>
#include <string.h>
 
int main ()
{
  char *str1 = "apple";
  char *str2 = "orange";
  int ret;
 
  ret = strncmp(str1, str2, 6);
 
  if(ret > 0)
  {
    printf("str1 es más larga");
  }
  else if(ret < 0)
  {
    printf("str2 es más larga");
  }
  else
  {
    printf("Las cadenas son iguales");
  }
 
  return(0);
}
