
package examenip2_hectorcaceres;


public class Posicion {

    //Constructor.
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Atributos.
    private int x;
    private int y;

    //Getters y setters.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Posicion{" + "x=" + x + ", y=" + y + '}';
    }

}
