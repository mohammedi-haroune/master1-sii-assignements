#include <stdlib.h>
#include <stdio.h>

int main()
{

	int i,N,prem = 1;


	printf("donner la valeur de N = ");
	scanf("%d",&N);

	i=2;

	while( i < sqpr(N) && prem == 1){

		if( N%i == 0)
			prem = 0;
		else
			i = i + 1;
	}

	if(prem == 1)
    {
        printf("Le nombre saisi : %d est premier! \n",N);
    }
	else{
        printf("Le nombre saisi : %d n'est pas premier! \n",N);
	}


return 0;

}

//temporell 
//millieur cas : 6
//pire cas : 6*racine(N) - 8

//spaciale
//millieur cas : 5 + 2
//pire cas : 6*racine(N) - 5