 /*
 #include<stdio.h>
 #include<stdlib.h>

 int main()
 {
	long int i,N,S;

	printf("Donner N = ");
	scanf("%Ld",&N);

	S=0;
	i=1;

	while(i <= N)
	{
		S = S + i;
		i = i + 1;
	}

	printf("La somme S = %Ld",S);

	return 0;
 }*/

/**************************************************/

 #include<stdio.h>
 #include<stdlib.h>
#include <time.h>

 int main()
 {
	long int n = 1000000;
	int test = 0;
	while ( n < 10000000000000 ) {
	long int i,N,S;
	
   	clock_t start_t, end_t, total_t;
   	start_t = clock();
//	printf("Donner N = ");
//	scanf("%Ld",&N);
	N = n;
	S=0; i=1;

	do
	{
		S = S + i;
		i = i + 1;
	} while(i <= N);
   	end_t = clock();
	printf("La somme S = %Ld\n",S);
   	total_t = (double) (end_t - start_t) / CLOCKS_PER_SEC;
	printf("pour %ld Iteration le programme prends %lf\n", N, total_t);
	if (test == 0) {
	n = n*2;
	test = 1;	
	}
	else {
		if (test == 1) {
		n = n*5;
		test = 0;
		}
	}
}
	return 0;
}

 /***********************************************/

/*
 #include<stdio.h>
 #include<stdlib.h>

 int main()
 {
	long int i,N,S;

	printf("Donner N = ");
	scanf("%Ld",&N);

	S=0;

	for(i=1 ; i <= N ; i++)
	{
		S = S + i;
	}

	printf("La somme S = %Ld",S);
	return 0;
 }
*/
