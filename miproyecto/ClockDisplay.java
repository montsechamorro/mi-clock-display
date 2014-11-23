
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // atributos de la clase ClockDisplay
    //objeto NumberDisplay que nos guarda la hora
    private NumberDisplay horas;
    //objeto NumberDisplay que nos guarda los minutos
    private NumberDisplay minutos;
    //un string de  caracteres: la hora, dos puntos y los minutos
    private String horaActual;
    // objeto NumberDisplay que nos guarda el dia
    private NumberDisplay day;
    // objeto NumberDisplay que nos guarda el mes
    private NumberDisplay month;
    // objeto NumberDisplay que nos guarda el año
    private NumberDisplay year;

    
    /**
     * Constructor 
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(100);
        updateDisplay();

    }

    /**
     * Constructor que crea un reloj con las horas, minutos y fecha dados
     */
    public ClockDisplay(int newHoras, int newMinutos, int newDay, int newMonth, int newYear)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(100);

        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
        day.setValue(newDay);
        month.setValue(newMonth);
        year.setValue(newYear);

        updateDisplay();

    }
    /**
     * metodo que fija una nueva hora y fecha a partir de las horas, minutos, dia, mes y año dados
     */
    public void setTime (int actualHoras, int actualMinutos, int actualDay, int actualMonth, int actualYear)
    {
        horas.setValue(actualHoras);
        minutos.setValue(actualMinutos);
        day.setValue(actualDay);
        month.setValue(actualMonth);
        year.setValue(actualYear);
        updateDisplay();
    }

    /**
     * Devuelve una cadena de 5 caracteres con la hora y los minutos separados por dos puntos
     * la primera linea de este metodo no haria falta ponerlo pq siempre q cambio los valores de numberDisplay 
     * se actualiza este otro valor automaticamente pq esta definido asi. la kitariamos(es la linea del ultimo metodo)(ya la kite de aqui)
     */
    public String getTime()
    {
        updateDisplay(); // esta linea se puede omitir ya que  mantiene actualizados los valores actuales a traves del metodo
        return horaActual;
    }

    public void timeTick()
    {
        minutos.increment();
        if (minutos.getValue() == 0) {

            horas.increment();
        }
        if (horas.getValue() == 0) {
            day.increment();
        }
        if (day.getValue() == 0) {
            day.setValue(1);
            month.increment();
        }
        if (month.getValue() == 0) {
            month.setValue(1);
            year.increment();
        }
        updateDisplay();
    }

    /**
     * metodo interno(por eso se llama private) creado para sustituir el contenido por este metodo en el resto del código
     */
    private void updateDisplay()

    {
        if (horas.getValue() < 12)
        {
            if (horas.getValue() == 0) 
            {
                horaActual = 12 + ":" + minutos.getDisplayValue() + " am " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
            }
            else
            {
                horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " am " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
            }
        }
        else
        {
            int horarioPm = (horas.getValue() - 12);

            if ((horarioPm < 10) && (horarioPm > 0)) 
            {
                horaActual ="0" + horarioPm + ":" + minutos.getDisplayValue() + " pm " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
            }
            else if (horarioPm == 0)
            {
                horaActual = "12" + ":" + minutos.getDisplayValue() + " pm " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
            }
            else
            {
                horaActual =horarioPm + ":" + minutos.getDisplayValue() + " pm " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
            }
        }
    }

}
