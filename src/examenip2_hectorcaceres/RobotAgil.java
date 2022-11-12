
package examenip2_hectorcaceres;

public class RobotAgil extends Robot {

    //Constructor.
    public RobotAgil(String ID, Posicion posicion, boolean cargado, int anioFabricacion, int cantidadLlantas, int velocidadPunta) {
        super(ID, posicion, cargado, anioFabricacion);
        this.setManualmente(false);
        this.setAutomaticamente(true);
        this.cantidadLlantas = cantidadLlantas;
        this.velocidadPunta = velocidadPunta;
    }

    //Atributos.
    private int cantidadLlantas;
    private int velocidadPunta;

    //Getters y setters.
    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public int getVelocidadPunta() {
        return velocidadPunta;
    }

    public void setVelocidadPunta(int velocidadPunta) {
        this.velocidadPunta = velocidadPunta;
    }

    @Override
    public String toString() {
        return super.toString() + "RobotAgil{" + "cantidadLlantas=" + cantidadLlantas + ", velocidadPunta=" + velocidadPunta + '}';
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
