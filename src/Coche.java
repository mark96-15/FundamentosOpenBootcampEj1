public class Coche {
    private int nroPuertas;

    public Coche() {
        this.nroPuertas = 4;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void incrementarPuerta(){
        this.nroPuertas++;
    }
}
