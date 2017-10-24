#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <math.h>

int main()
{

	long int i,j,prem = 1;
	clock_t deb,fin;
	double total;

	long int tab1[]={1000003, 2000003,	4000037,	8000009,	16000057,	32000011,	64000031,
	128000003,	256000001,	512000009,	1024000009,	2048000011};

	double tab2[12];


for(j=0 ; j<12 ; j++)
{

	deb = clock();
	i = 2;
	printf("%d ------->   %d\n", i, (int) sqrt(tab1[j]));
	while( i < (int) sqrt(tab1[j]) && prem == 1){
		if(tab1[j] % i == 0)
			prem = 0;
		else
			i = i + 1;
	}

	fin = clock();

	total = (double) (fin - deb)/CLOCKS_PER_SEC;

	printf("tab2[%d] == %lf, prem = %d\n", j, tab2[j], prem);

	
	tab2[j]= total ;

}

return 0;

}


