
public class ConvertTemperature {
    public static void main(String[] args) {
 
        double celsius = Double.parseDouble(args[1]);
        double Farenheit = (celsius* 9/5)+32;
        System.out.println(celsius+" °C = "+ Farenheit+" °F");
    }
}
