package com.example.pilascolas;

import java.util.Scanner;

public class PilaArray {
    int[] PILA;
    int TOPE;
    int MAX;

    /**
     * constructor del objeto que ayuda a dar el valor maximo al objeto
     * @param MAX
     */
    public PilaArray(int MAX)
    {
        this.TOPE = 0;
        this.MAX = MAX;
        this.PILA = new int[this.MAX+1];
    }

    public int GetTOPE()
    {
        return TOPE;
    }

    /**
     * Vaciar pila
     */
    public void VaciarPila()
    {
        this.TOPE = 0;
    }

    /**
     * Comprueba sí la pila esta llena
     * @return
     */
    public boolean IsPilaLlena()
    {
        if(this.MAX == this.TOPE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Comprueba sí la pila esta vacia
     * @return
     */
    public boolean IsPilaVacia()
    {
        if(this.TOPE == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Insertar un elemento de la pila
     */
    public void InsertarPila()
    {
        if(this.IsPilaLlena())
        {
            System.out.println("LA PILA ESTA LLENA");
        }
        else
        {
            Scanner sc = new Scanner(System.in);

            int ITEM;

            ITEM = sc.nextInt();


            this.TOPE++;
            this.PILA[this.TOPE] = ITEM;
            System.out.println("EL ITEM " + ITEM + " SE INSERTO A LA PILA");
        }
    }

    /**
     * Eliminar un elemento de la pila
     */
    public void EliminarPila()
    {
        if(this.IsPilaVacia())
        {
            System.out.println("LA PILA ESTA VACIA");
        }
        else
        {
            int ITEM = this.PILA[this.TOPE];
            this.TOPE--;

            System.out.println("EL ITEM " + ITEM + " SE ELIMINO DE LA PILA");
        }
    }

    /**
     * Mostrar datos de la pila
     */
    public void MostrarPila()
    {
        if(this.IsPilaVacia())
        {
            System.out.println("LA PILA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR");
        }
        else
        {
            int i;
            String MOSTRAR = "";

            for(i=1;i<=this.TOPE;i++)
            {
                MOSTRAR = MOSTRAR + this.PILA[i]+"\n";
            }
            System.out.println("TOTAL ES : "+this.TOPE+"\n"+"LOS DATOS DE LA PILA SON : \n"+MOSTRAR+"MOSTRAR DATOS");
        }
    }
}
