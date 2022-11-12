package examenip2_hectorcaceres;

public class ManosRoboticas extends Robot {

    //Constructor.
    public ManosRoboticas(String ID, Posicion posicion, boolean cargado, int anioFabricacion, int numeroServoMotores) {
        super(ID, posicion, cargado, anioFabricacion);
        this.setManualmente(true);
        this.setAutomaticamente(false);
        this.numeroServoMotores = numeroServoMotores;
    }

    //Atributos.
    private int numeroServoMotores;

    //Getters y setters.
    public int getNumeroServoMotores() {
        return numeroServoMotores;
    }

    public void setNumeroServoMotores(int numeroServoMotores) {
        this.numeroServoMotores = numeroServoMotores;
    }

    @Override
    public String toString() {
        return super.toString() + "ManosRoboticas{" + "numeroServoMotores=" + numeroServoMotores + '}';
    }

    @Override
    public void adv(Posicion posActual, Posicion posNueva) {
        this.setPosicion(posNueva);
    }

    @Override
    public void chr() {
        if (!this.isCargado()) {
            super.chr();
        } else {
            System.out.println("\nÂ¡Ha superado el lÃ­mite de carga!");
        }
    }

    @Override
    public void dmnt() {
        this.setCarga(0);
    }

    @Override
    public void gir(int grados, char direccion) {
        switch (direccion) {
            case '^':
                break;
            case 'v':
                break;
            case '>':
                break;
            case '<':
                break;
        }
    }
}
