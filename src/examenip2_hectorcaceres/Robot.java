package examenip2_hectorcaceres;

public class Robot {

    //Constructor.
    public Robot(String ID, Posicion posicion, boolean cargado, int anioFabricacion) {
        this.ID = ID;
        this.posicion = posicion;
        this.cargado = cargado;
        this.anioFabricacion = anioFabricacion;
        this.carga = 0;
        this.setManualmente(true);
        this.setAutomaticamente(true);
    }

    //Atributos.
    private String ID;
    private Posicion posicion;
    private boolean cargado;
    private int anioFabricacion;
    private int carga;
    private boolean manualmente;
    private boolean automaticamente;

    //Getters y setters.
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean isCargado() {
        return cargado;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isManualmente() {
        return manualmente;
    }

    public void setManualmente(boolean manualmente) {
        this.manualmente = manualmente;
    }

    public boolean isAutomaticamente() {
        return automaticamente;
    }

    public void setAutomaticamente(boolean automaticamente) {
        this.automaticamente = automaticamente;
    }

    @Override
    public String toString() {
        return "Robot{" + "ID=" + ID + ", posicion=" + posicion.toString() + ", cargado=" + cargado + ", anioFabricacion=" + anioFabricacion + ", carga=" + carga + ", manualmente=" + manualmente + ", automaticamente=" + automaticamente + '}';
    }

    //Implementadas en las clases heredadas.
    public void adv(Posicion posActual, Posicion posNueva) {
    }

    public void chr() {
        this.carga++;
    }

    public void dmnt() {
        this.carga = 0;
    }

    public void gir(int grados, char direccion) {
    }

}
