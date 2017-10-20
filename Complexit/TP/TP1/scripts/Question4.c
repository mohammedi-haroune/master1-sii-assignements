#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void SommeRecursive(double N, double* S)
{
	if(N > 0)
	{
		printf("We are in the numbe %lf with sum = %lf\n", N, *S);
		*S = *S + N;
		SommeRecursive(N - 1, S);
	}
	else {
	}
}


int main()
{
	/*
	double i,j,N,S;
	clock_t start_t, end_t;
    double total_t;
	 
	double tab[14]={pow(10,6),2*pow(10,6),pow(10,7),2*pow(10,7),pow(10,8),2*pow(10,8),
	pow(10,9),2*pow(10,9),pow(10,10),2*pow(10,10),pow(10,11),2*pow(10,11),pow(10,12),2*pow(10,12)};

	printf("L'algorithme recursive\n");

	for(j=0 ; j < 14 ; j++) {
		printf("Start with : tab[%ld] = %lf \n", (long int) j, tab[(long int) j]);
        start_t = clock();
        S=0; i=1;
        printf("Before SommeRecursive\n");
        S = SommeRecursive(tab[(long int) j]);
        printf("After SommeRecursive\n");
        end_t = clock();

        printf("La somme S = %lf \n",S);
        total_t = (double) (end_t - start_t) / CLOCKS_PER_SEC;
        printf("pour %lf Iteration le programme prends %lf\n\n", tab[(long int) j], total_t);

    }
    */
    double* S = malloc(sizeof(double));
    *S = 0;
    double N = 10000000;
    SommeRecursive(N, S);
    printf("SommeRecursive(10, *S) = %lf \n", *S);
    return 0;
}
