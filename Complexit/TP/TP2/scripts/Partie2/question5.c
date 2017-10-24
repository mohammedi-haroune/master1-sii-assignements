#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main()
{

	long int i,j,prem = 1;
	clock_t deb,fin;
	double total;

	long int tab[]={1000003, 2000003,	4000037,	8000009,	16000057,	32000011,	64000031,
	128000003,	256000001,	512000009,	1024000009,	2048000011};



	i=2;

for(j=0 ; j<12 ; j++)
{

	deb = clock();

	while( i < tab[j] / 2 && prem == 1){

		if( tab[j]%i == 0)
			prem = 0;
		else
			i = i + 1;
	}

	deb = clock();

	if(prem == 1)
    {
        printf("Le nombre saisie : %ld est premier! \n",tab[j]);
    }
	else{
        printf("Le nombre saisie : %ld n'est pas premier! \n",tab[j]);
	}

	total = (double) (fin - deb)/CLOCKS_PER_SEC;
	printf("temps d'exe = %lf \n",total);

}

return 0;

}

/**
Le nombre saisie : 1000003 est premier!
temps d'exe = 4201.006000
Le nombre saisie : 2000003 est premier!
temps d'exe = 4200.991000
Le nombre saisie : 4000037 est premier!
temps d'exe = 4200.975000
Le nombre saisie : 8000009 est premier!
temps d'exe = 4200.944000
Le nombre saisie : 16000057 est premier!
temps d'exe = 4200.897000
Le nombre saisie : 32000011 est premier!
temps d'exe = 4200.772000
Le nombre saisie : 64000031 est premier!
temps d'exe = 4200.554000
Le nombre saisie : 128000003 est premier!
temps d'exe = 4200.102000
Le nombre saisie : 256000001 est premier!
temps d'exe = 4199.197000
Le nombre saisie : 512000009 est premier!
temps d'exe = 4197.403000
Le nombre saisie : 1024000009 est premier!
temps d'exe = 4193.799000
Le nombre saisie : 2048000011 est premier!
temps d'exe = 4186.592000
**/
