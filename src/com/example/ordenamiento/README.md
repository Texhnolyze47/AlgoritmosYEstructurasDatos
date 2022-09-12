# Metodos de Ordenamiento

- Burbuja

Burbuja (A,N)
{A es un arreglo de N elementos}

N es longitud del arreglo

{L, J y AUX son variables de tipo entero}

1. Repetir con I desde 2 hasta N
   2. Repetir con J desde N hasta I
      3. Si A(j-1) > A[j] entonces
      
         Hacer AUX <- A[J-1]
      
         A[j-1] <- A[j]
   
         A[I] <- AUX
      4. Fin 
   5. Fin
6. Fin
   
A = {15,67,8,16,44,27,12,37}

- Sacudida(A,N)
I, IZQ,DER,K y AUX son entonces

1. Hacer IQZ <-  2, DER <-  N, K <-
2. Repetir mientras DEA >= IZQ
   1. Repetir con I desde DER hasta IZQ
      
      1. Si A[I-1] > A[I] entonces
      hacer AUX <-  A[I-1]
      2. A[I-1] <-  A[I]
      3. A[I] <-  AUX
      4. K <-  I
   2. {Fin de condicional del paso}
3. Fin del ciclo del paso 2
   1. Hacer  IQZ <-  K+1
4. Repetir (en I desde IZQ hasta DER)
   1. Si A[I-1] > A[I] entonces
      1. Hacer Aux <-  A[I-1]
         1. A[I-1] <-  A[I]
         2. A[I]  <-  AUX
         3. k <-  1

   
   


