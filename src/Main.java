public class Main {

    public static int sumasTres(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public static void main(String[] args) {

        System.out.println("Suma: " + Main.sumasTres(2,5,8));

        Coche coche = new Coche();

        coche.incrementarPuerta();

        System.out.println("Cantidad de Puertas del coche: " + coche.getNroPuertas());


    }
}