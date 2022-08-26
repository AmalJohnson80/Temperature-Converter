
import java.util.*;
public class FahrenheittoCelsius
{
    public static void main(String[]args){
        if(args.length != 1){
            System.out.println("You must pass ONE argument as the Fahrenheit value to be converted to Celsius.");
        } else {
            int fahrenheitValue = Integer.parseInt(args[0]);
            int celsiusValue = (fahrenheitValue-32)*5/9;
            System.out.printf("%d°F = %d°C", fahrenheitValue, celsiusValue);
        }
    }
}
