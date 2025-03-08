import java.util.Scanner;

public class TempratureConvertor {
    public static void main(String[] args) {
        double celsius = getInput("Enter temperature in Celsius: ");
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is " + fahrenheit + "°F");

        fahrenheit = getInput("Enter temperature in Fahrenheit: ");
        celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is " + celsius + "°C");
    }
    //generating user input
    private static double getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }
    //celsius to fahrennheit
    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    //fahrenheit to celsius
    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
//input celsius 37 
//output 98.6
//input fahrenheit 98
//output 36.9999999
