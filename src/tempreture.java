import java.util.Scanner;

public class tempreture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tempreture: ");
        float temperature = input.nextFloat();
        System.out.print("Enter celsius or fahrenheit: ");
        char a = input.next().charAt(0);

        if (a == 'C' || a == 'c') {
            System.out.println("K(" + temperature + ") -> C(" + toCelsius(temperature) + ")");
        } else if (a == 'F' || a == 'f')
            System.out.println("K(" + temperature + ") -> C(" + toFahrenheit(temperature) + ")");
        else System.out.println("Invalid util");

    }

    static double toFahrenheit(double temperatureInKelvin) {
        return temperatureInKelvin * 9 / 5 - 459.67;
    }

    static double toCelsius(double temperatureInKelvin) {
        return (temperatureInKelvin - 273.15);
    }


}

