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
