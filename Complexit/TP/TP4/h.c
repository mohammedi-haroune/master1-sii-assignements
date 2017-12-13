//Module : Conception et Complexité des Algorithmes
//Série Travaux Pratiques n°5 (TP n°5)
//Archivage: D:\BC45\M1_RSD_Complexité_2015\TP5.cpp)
//Ce programme résout le problème des tours de Hanoi.
//Ce programme est récursif

//développé par Mr. AMANI

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

//Déclaration de la fonction hanoi(int, int, int, int)
void hanoi(int, int, int, int);

int main(void)
{
  for (int i = 0; i < 36; ++i)
  {
    //int nb;                 //nb = nombre de déplacement des disques
  clock_t t1, t2;   //clock_t désigne le type temps
  double delta;     //delta mesure la durée d'exécution du programme entre
  //Partie 2: Traitement
  t1=clock();     //La variable t1 reçoit la valeur du temps fournie par la
        //la fonction clock(). C'est le début de la mesure du temps.
  hanoi(i, 1, 3, 2);            //appel de la fonction hanoi(n, 1, 3, 2)
        //On suppose : A=1, B=2 et C=3
  t2=clock();     //La variable t2 reçoit la valeur du temps fournie par la
        //la fonction clock(). C'est la fin de la mesure du temps.

  delta=(double)(t2-t1)/CLOCKS_PER_SEC; //formule permettant de calculer la
        //durée d'exécution du programme entre les points t1 et t2
  
  printf("n=%d disques, temps = %f\n", i, delta);
  }
  return(0);
}//fin du programme
  
//Définition de la fonction hanoi(int n, int A, int C, int B)
void hanoi(int n, int A, int C, int B)
{
  if (n >= 1) 
    {
        hanoi(n-1, A, B, C);
        hanoi(n-1, C, A, B);
    }
}//fin de la fonction hanoi(int n, int A, int C, int B)