
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

    /**
     * Constructor for objects of class clockDisplay
     */
    public clockDisplay()
    {
        // initialise instance variables
        horas = 0;
        minutos = 0;

    }

    /**
     * Fija unas horas y unos minutos dados
     */

    public void setTime(int newHours, int newMinutes)
    {
        if (newHours <24 && newHours >= 0){
            horas = newHours;
        }
        if (newMinutes < 60 && newMinutes >= 0){
            minutos = newMinutes;
        }
    }

    /**
     * Hace avanzar un mituto al reloj
     */

    public void timeTick()
    {
        if (minutos < 59) {
            minutos = minutos + 1;
        }
        else{
            minutos = 0;
            if (horas <23) {
                horas = horas + 1;
            }
            horas = 0;
        }
    }

    

    /**
     * Devuelve una cadena de 5 caracteres mostrando la hora y los minutos actuales separados por dos puntos
     */
    public String getTime()
    {
        String time = "";

        if (horas < 10) {
            time = "0" + horas;
        }
        else {
            time = "" + horas;
        }

        time = time + ":";

        if (minutos < 10){
            time = time + "0" + minutos;
        }
        else {
            time = time + minutos;
        }

        return time;

    }
}
