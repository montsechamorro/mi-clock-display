
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // El limite al que puede llegar el valor
    private int limite;
    //El valor almacenado
    private int valorActual;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limit)
    {
        limite = limit;
        valorActual = 0;

    }

    /**
     * metodo que fija el valor actual del display
     */
    public void setValue(int newValorActual)
    {
        if ((newValorActual < limite) && (newValorActual >= 0)){
            valorActual = newValorActual;
        }
    }

    /**
     * metodo que devuelve el valor actual en forma de cadena de 2 caracteres
     */
    public String getDisplayValue()
    {

        int valorAc = valorActual;
        if (valorAc<10)
        {
            return "0" + valorAc;
        }
        else
        {
            return "" + valorAc;
        }

    }

    /**
     * metodo que devuelve el valor actual del display como entero
     */
    public int getValue()
    {
        return valorActual;
    }

    /**
     * metodo que incrementa en 1 al display y lo hace volver al principio si alcanza el límite
     */
    public void increment()
    {
        valorActual = valorActual + 1;
        if (valorActual == limite)
        {
            valorActual = 0;
        }
        

    }

          
}
