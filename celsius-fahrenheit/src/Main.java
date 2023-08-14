public class Main {
    public static void main(String[] args) {

        double celsius = 31.7;
        int fahrenheit = 0;

        fahrenheit = (int) ((celsius * 1.8) + 32);

        System.out.println("Temperatura em Celsius: " + celsius + "ºC");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}