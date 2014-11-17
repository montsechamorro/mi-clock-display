
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // atributos de la clase ClockDisplay
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaActual;

    /**
     * Constructor 
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
        horas.setValue(0);
        minutos.setValue(0);
        horaActual = horas + ":" + minutos;

    }

    /**
     * Constructor que fija las horas y minutos
     */
    public ClockDisplay(int newHoras, int newMinutos)
    {
        horas = new NumberDisplay(23);
        minutos = new NumberDisplay(59);
        horas.setValue (newHoras);
        minutos.setValue (newMinutos);
        horaActual = horas + ":" + minutos;

    }

    public void setTime (int actualHoras, int actualMinutos)
    {
        horas = new NumberDisplay (actualHoras);
        minutos = new NumberDisplay (actualMinutos);
    }

    public String getTime()
    {
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        return horaActual;
    }

    public void timeTick()
    {
        minutos.increment();
    }

}
