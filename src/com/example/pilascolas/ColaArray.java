package com.example.pilascolas;

import java.util.Scanner;

public class ColaArray
{
    // Variables del objeto
    private int MAX;
    private int[] COLA;
    private int FRENTE;
    private int FINAL;

    /**
     * constructor del objeto que ayuda a dar el valor maximo al objeto
     * @param MAX
     */
    public ColaArray(int MAX)
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.MAX+1];
    }

    /**
     * Regresa si la cola esta lleno
     * @return
     */
    public boolean IsColaLlena()
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Regresa sí la cola esta vacia
     * @return
     */

    public boolean IsColaVacia()
    {
        if(this.FRENTE == this.FINAL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Ayuda a meterlos elementos en la cola
     */
    public void InsertarCola()
    {
        if(this.IsColaLlena())
        {
            System.out.println("LA COLA ESTÁ LLENA");

        }
        else
        {
            Scanner sc = new Scanner(System.in);
            int ITEM;

            ITEM = sc.nextInt();

            this.FINAL++;
            this.COLA[FINAL] = ITEM;

        }
    }

    /**
     * Elimina un dato del que esta en la primera posicion es el primer que sale.
     */

    public void EliminarCola()
    {
        if(this.FRENTE == this.FINAL)
        {
            System.out.println("LA COLA ESTA VACIA");
        }
        else
        {
            for(int i=FRENTE;i < FINAL;i++)
            {
                COLA[i] = COLA[i+1];
            }

            FINAL--;
        }
    }

    /**
     * Imprime los datos
     */
    public void MostrarCola()
    {
        if(this.IsColaVacia())
        {
            System.out.println("LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR");

        }
        else
        {
            String MOSTRAR = "";

            for(int i=FRENTE+1;i<=FINAL;i++)
            {
                MOSTRAR = MOSTRAR + COLA[i]+"\n";
            }
            System.out.print("TOTAL ES : "+this.FINAL+"\n"+"LOS DATOS DE LA COLA SON : \n"+MOSTRAR);

        }
    }

    public void VaciarCola()
    {
        FRENTE = 0;
        FINAL = 0;
    }
}