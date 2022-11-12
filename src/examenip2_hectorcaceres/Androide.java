
package examenip2_hectorcaceres;

public class Androide extends Robot {

    //Constructor.
    public Androide(String ID, Posicion posicion, boolean cargado, int anioFabricacion, float peso, float altura) {
        super(ID, posicion, cargado, anioFabricacion);
        this.peso = peso;
        this.altura = altura;
    }

    //Atributos.
    private float peso;
    private float altura;

    //Getters y setters.
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Androide{" + "peso=" + peso + ", altura=" + altura + '}';
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
