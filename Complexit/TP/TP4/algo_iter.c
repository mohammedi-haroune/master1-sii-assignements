#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include<time.h>

int start = 5;
int nbInputs = 6;
long int inputs[] = {50000 , 100000 , 200000 , 400000 , 800000 , 3200000 , 6400000 , 12800000 , 25600000 , 1024000000 , 2048000000};
               
double sortedTime(long int n) {
    
	long int *array = malloc(n*sizeof(long int));
	long int i;
	
	for (i = 0; i < n; i++)
	{
    	array[i] = i;
	}
	clock_t start = clock();
	insertionSort(array, n); //replace with your function 
	clock_t end = clock();
	
	return (double) (end - start)/CLOCKS_PER_SEC;
}

double inversedTime(long int n) {
    
	long int *array = malloc(n*sizeof(long int));
	long int i;
	
	for (i = 0; i < n; ++i)
	{
		array[i] = n - i;
	}
	clock_t start = clock();
	insertionSort(array, n); //replace with your function 
	clock_t end = clock();

	return (double) (end - start)/CLOCKS_PER_SEC;
}

double randomTime(long int n) {
    
	long int *array = malloc(n*sizeof(long int));
	long int i;
	
	for (i = 0; i < n; ++i)
	{
		array[i] = (int) rand()%n;
	}
	clock_t start = clock();
	insertionSort(array, n); //replace with your function 
	clock_t end = clock();

	return (double) (end - start)/CLOCKS_PER_SEC;
}



	void saveResults(double array[], long int n, char* name) {

	   long int i;
	   FILE * fp;
	   fp = fopen ("results","a");
	   fprintf(fp, name);
	   fprintf(fp, "[");

	   for(i = 0;i<n;i++) {
		  fprintf(fp, "%lf, ",array[i]);
	   }

	   fprintf(fp, "]\n");
	   fclose (fp);
	}

void insertionSort(long int *array, long int n) {
   for(int i = 1; i < n; i++) { 
    long int valueToInsert = array[i];
    long int j = i;
    
    // check if previous no. is larger than value to be inserted 
    while (j > 0 && array[j-1] > valueToInsert) {
        array[j] = array[j-1];
        j--;
    }
    array[i] = valueToInsert;   
    }
}

int main(int argc, char const *argv[])
	{
	double *inversedTimes = malloc(nbInputs*sizeof(double));
	double *sortedTimes = malloc(nbInputs*sizeof(double));
	double *randomTimes = malloc(nbInputs*sizeof(double));

	for (int i = start; i < nbInputs; i++)
	{
		inversedTimes[i] = inversedTime(inputs[i]);
		sortedTimes[i] = sortedTime(inputs[i]);
		randomTimes[i] = randomTime(inputs[i]);
	}

	saveResults(inversedTimes,nbInputs, "inversed = ");
	saveResults(sortedTimes,nbInputs, "sorted = ");
    saveResults(randomTimes,nbInputs, "random = ");

	return 0;
	}
