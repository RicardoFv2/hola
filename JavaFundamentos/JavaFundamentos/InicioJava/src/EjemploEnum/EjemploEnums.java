package EjemploEnum;

public class EjemploEnums {
    public static void main(String[] args) {

        System.out.println("Valor 1: " + Dias.JUEVES);

        indicarDia(Dias.VIERNES);

        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());

        System.out.println("");
        indicarPaises(Continentes.AFRICA);

        System.out.println("");
        imprimirContinentes();
    }

    public static void indicarDia(Dias dias) {
        switch (dias) {
            case LUNES :
                System.out.println("Primer dia de la semana");
                break;

            case MARTES :
                System.out.println("Segundo dia de la semana");
                break;

            case MIERCOLES :
                System.out.println("Tercer dia de la semana");
                break;

            case JUEVES :
                System.out.println("Cuarto dia de la semana");
                break;

            case VIERNES :
                System.out.println("Quinto dia de la semana");
                break;

            case SABADO :
                System.out.println("Sexto dia de la semana");
                break;

            case DOMINGO :
                System.out.println("Septimo dia de la semana");
                break;

            default:
                System.out.println("Dia no valido");
        }
    }
    public static void  indicarPaises(Continentes continentes){
        switch (continentes){
            case AFRICA:
                System.out.println("No. Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los " + "demas continentes");
        }
    }
    public static void imprimirContinentes(){
        for (Continentes c: Continentes.values()) {
            System.out.println("Continente: " + c + " continente " + c.getPaises() + " paises");
        }
    }
}
