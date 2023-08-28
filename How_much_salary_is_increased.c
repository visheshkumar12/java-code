#include<stdio.h>
int main()
{
	int emp,salary,cursal,hour,totalsal,work;
//	cursal :  current salary ,emp : employee , totalsal : total salary
	printf("Enter the employee number from 1 to 10 :");
	scanf("%d",&emp);
	
	if(emp<=10){
		printf("Your current salary :");
	scanf("%d",&cursal);
	
	for(emp=0;emp<=10;emp++)
	{
		printf("Number of hours :");
		scanf("%d",&hour);
		if(hour==8)
		{
			printf("Salary will increase by $50\n");
			printf("Total Salary :$%d", (cursal+50));
			break;
	}
		else if(hour>=8 && hour<=10)
		{
			printf("Salary will increse by $100\n");
			printf("Total Salary :$%d", (cursal+100));
			break;
		}
		else if(hour>=12)
		{
			printf("Salary will increse by $150\n");
			printf("Total Salary :$%d", (cursal+150));
			break;
		}
			
	}

}
}