#include<stdio.h>
void main()
{
    int p,n,count,r;
    float si;
    
    count=1;
    while(count<=3)
    {
        printf("\n Enter the valuee of p,n and r");
        scanf("%d%d%d",&p,&n,&r);
        si = p*n*r/100 ;
        printf("Simple interest =Rs. %f",si);
         
         count=count+1;
     }   
    

}