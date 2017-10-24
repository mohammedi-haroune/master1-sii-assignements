#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main()
{

	long int i,j,prem;
	clock_t deb,fin;
	double total;

	long int tab1[]={1000003, 2000003,	4000037,	8000009,	16000057,	32000011,	64000031,
	128000003,	256000001,	512000009,	1024000009,	2048000011};

	double tab2[12];



for(j = 0 ; j < 12 ; j++)
{

	deb = clock();

	i = 2;
	prem = 1;

	while(i < tab1[j] / 2 && prem == 1){

		if(tab1[j] % i == 0)
			prem = 0;
		else
			i = i + 1;
	}

	fin = clock();

	total = (double) (fin - deb)/CLOCKS_PER_SEC;

	tab2[j]= total ;

	printf("%lf, ", tab2[j]);
}

return 0;

}


