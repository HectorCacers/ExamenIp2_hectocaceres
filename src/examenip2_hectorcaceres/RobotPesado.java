/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenip2_hectorcaceres;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class RobotPesado extends Robot {

    //Constructor.
    public RobotPesado(String ID, Posicion posicion, boolean cargado, int anioFabricacion, float peso, int capacidadMaxima) {
        super(ID, posicion, cargado, anioFabricacion);
        this.peso = peso;
        this.setCapacidadMaxima(capacidadMaxima);
    }

    //Atributos.
    private float peso;
    private int capacidadMaxima;

    //Getters y setters.
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        Scanner leer = new Scanner(System.in);
        while (capacidadMaxima < 5) {
            System.out.print("Ingrese la capacidad maxima (4>): ");
            capacidadMaxima = leer.nextInt();
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "RobotPesado{" + "peso=" + peso + ", capacidadMaxima=" + capacidadMaxima + '}';
    }

    @Override
    public void adv(Posicion posActual, Posicion posNueva) {
        this.setPosicion(posNueva);
    }

    @Override
    public void chr() {

        Scanner leer = new Scanner(System.in);

        if (!this.isCargado()) {
            while (this.getCarga() < 5) {
                super.chr();
            }
        } else {
            System.out.print("\n1 -> para cargar UN elemento mÃ¡s: ");
            int opcion = leer.nextInt();
            if (opcion == 1) {
                super.chr();
            } else {
                System.out.println("\nÂ¡No se ha cargado nada!");
            }
        }

        if (this.getCarga() >= 5) {
            this.setCargado(true);
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
