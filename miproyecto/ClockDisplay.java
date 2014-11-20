
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // atributos de la clase ClockDisplay
    //obeto NumberDisplay que nos guarda la hora
    private NumberDisplay horas;
    //objeto NumberDisplay que nos guarda los minutos
    private NumberDisplay minutos;
    //un string de  caracteres: la hora, dos puntos y los minutos
    private String horaActual;

    /**
     * Constructor 
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor que crea un reloj con las horas y minutos dados
     */
    public ClockDisplay(int newHoras, int newMinutos)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);

        horas.setValue(newHoras);
        minutos.setValue(newMinutos);

        updateDisplay();

    }

    /**
     * metodo que fija una nueva hora a partir de los horas y minutos dados
     */
    public void setTime (int actualHoras, int actualMinutos)
    {
        horas.setValue(actualHoras);
        minutos.setValue(actualMinutos);
        updateDisplay();
    }

    /**
     * Devuelve una cadena de 5 caracteres con la hora y los minutos separados por dos puntos
     * la primera linea de este metodo no haria falta ponerlo pq siempre q cambio los valores de numberDisplay 
     * se actualiza este otro valor automaticamente pq esta definido asi. la kitariamos(es la linea del ultimo metodo)(ya la kite de aqui)
     */
    public String getTime()
    {

        return horaActual;
    }

    public void timeTick()
    {
        minutos.increment();
        if (minutos.getValue() == 0) {

            horas.increment();
        }

        updateDisplay();
    }

    /**
     * metodo creado para sustituir el contenido por este metodo en el resto del código
     */
    private void updateDisplay()
    {
        if (horas.getValue() < 12) {
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " am";
        }
        else
        {
            int horarioPm = (horas.getValue() - 12);

            if (horarioPm < 10) {
                horaActual ="0" + horarioPm + ":" + minutos.getDisplayValue() + " pm";
            }
            else {
                horaActual =horarioPm + ":" + minutos.getDisplayValue() + " pm";
            }
        }
    }

    }
