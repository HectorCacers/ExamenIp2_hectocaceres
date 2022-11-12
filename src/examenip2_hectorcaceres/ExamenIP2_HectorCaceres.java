
package examenip2_hectorcaceres;
import java.util.ArrayList;
import java.util.Scanner;



public class ExamenIP2_HectorCaceres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Robot> robots = new ArrayList<Robot>();
        String[][] matriz = new String[30][30];
        inicializarMatriz(matriz);
        Robot nuevoRobot = null;
        boolean noSalir = true;
        int opcion = 0;
        int opcionRobot = 0;
        int disponible = 0;
        int opcionAuto = 0;
        int posicionYRobot = 0;
        int posicionXRobot = 0;

        while (noSalir) {
            System.out.println("\n***MENU***");
            System.out.println("1- Crear Robot");
            System.out.println("2- Listar Robot");
            System.out.println("3- Simular AutomÃ¡ticamente");
            System.out.println("4- Actuar Manualmente");
            System.out.println("5- Salir");
            System.out.print("OpciÃ³n: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n**CREAR ROBOT***");

                    System.out.print("ID del robot: ");
                    String id = leer.next();
                    System.out.print("PosiciÃ³n X (1-30): ");
                    int x = leer.nextInt();
                    x--;
                    System.out.print("PosiciÃ³n Y (1-30): ");
                    int y = leer.nextInt();
                    y--;
                    Posicion posicion = new Posicion(x, y);
                    boolean cargado = false;
                    System.out.print("AÃ±o de fabricaciÃ³n: ");
                    int anioFabricacion = leer.nextInt();

                    System.out.println("\nEscoja el tipo de robot");
                    System.out.println("1- Androide");
                    System.out.println("2- Manos robÃ³ticas");
                    System.out.println("3- Robot Ã¡gil");
                    System.out.println("4- Robot pesado");
                    System.out.print("Opcion: ");
                    opcionRobot = leer.nextInt();

                    switch (opcionRobot) {
                        case 1:
                            System.out.println("\nTIPO ANDROIDE");
                            System.out.print("Peso: ");
                            float peso = leer.nextFloat();
                            System.out.print("Altura: ");
                            float altura = leer.nextFloat();
                            nuevoRobot = new Androide(id, posicion, cargado, anioFabricacion, peso, altura);
                            break;
                        case 2:
                            System.out.println("\nTIPO MANOS ROBÃ“TICAS");
                            System.out.print("NÃºmero de motores servo: ");
                            int numeroMotoresServo = leer.nextInt();
                            nuevoRobot = new ManosRoboticas(id, posicion, cargado, anioFabricacion, numeroMotoresServo);
                            break;
                        case 3:
                            System.out.println("\nTIPO ROBOT ÃGIL");
                            System.out.print("Cantidad de llantas: ");
                            int cantidadLlantas = leer.nextInt();
                            System.out.print("Velocidad punta: ");
                            int velocidadPunta = leer.nextInt();
                            nuevoRobot = new RobotAgil(id, posicion, cargado, anioFabricacion, cantidadLlantas, velocidadPunta);
                            break;
                        case 4:
                            System.out.println("\nTIPO ROBOT PESADO");
                            System.out.print("Peso: ");
                            float peso2 = leer.nextFloat();
                            System.out.print("Capacidad mÃ¡xima: ");
                            int capacidadMaxima = leer.nextInt();
                            nuevoRobot = new RobotPesado(id, posicion, cargado, anioFabricacion, peso2, capacidadMaxima);
                            break;
                        default:
                            System.out.println("\nÂ¡Ha ingresado una opciÃ³n invÃ¡lida!");
                    }

                    if (nuevoRobot != null) {
                        robots.add(nuevoRobot);
                        System.out.println("\nÂ¡SE HA GUARDADO EL NUEVO ROBOT!");
                    } else {
                        System.out.println("\nÂ¡NO SE HA LOGRADO GUARDAR AL NUEVO ROBOT!");
                    }

                    break;
                case 2:
                    listarRobots(robots);
                    break;
                case 3:
                    System.out.println("\n***SIMULAR AUTOMÃTICAMENTE***");
                    listarAutomaticos(robots);
                    System.out.print("\nEscriba el numero de robot disponible: ");
                    disponible = leer.nextInt();
                    disponible--; //Para estar en la misma posiciÃ³n en el ArrayList.
                    boolean seguirAutomatico = true;
                    ArrayList<Integer> instrucciones = new ArrayList<Integer>();

                    //Colocamos el robot en la matriz.
                    posicionXRobot = robots.get(disponible).getPosicion().getX();
                    posicionYRobot = robots.get(disponible).getPosicion().getY();
                    matriz[posicionYRobot][posicionYRobot] = "R";
                    mostrarMatriz(matriz);

                    System.out.println("Guarde las operaciones que desea que el robot automÃ¡tico haga:");
                    while (seguirAutomatico) {
                        System.out.println("\n1- Moverse");
                        System.out.println("2- Cargar");
                        System.out.println("3- Descargar");
                        System.out.println("4- Rotar");
                        System.out.println("5- Terminar");
                        System.out.print("OpciÃ³n: ");
                        if (opcionAuto < 1 || opcionAuto > 4) {
                            break;
                        }
                        opcionAuto = leer.nextInt();
                        instrucciones.add(opcionAuto);

                    }

                    while (!instrucciones.isEmpty()) {
                        switch (instrucciones.get(0)) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }

                        //Eliminamos siempre la primera instrucciÃ³n.
                        instrucciones.remove(0);
                    }

                    break;
                case 4:
                    System.out.println("\n***ACTUAR MANUALMENTE***");
                    listarManuales(robots);
                    System.out.print("\nEscriba el numero de robot disponible: ");
                    disponible = leer.nextInt();
                    disponible--; //Para estar en la misma posiciÃ³n en el ArrayList.
                    int opcionManual = 0;
                    boolean seguirManualmente = true;

                    //Colocamos el robot en la matriz.
                    posicionXRobot = robots.get(disponible).getPosicion().getX();
                    posicionYRobot = robots.get(disponible).getPosicion().getY();
                    matriz[posicionYRobot][posicionYRobot] = "R";

                    while (seguirManualmente) {
                        System.out.println("\n***MATRIZ***");
                        mostrarMatriz(matriz);

                        System.out.println("\n***MENU MANUALMENTE***");
                        System.out.println("1- Moverse");
                        System.out.println("2- Cargar");
                        System.out.println("3- Descargar");
                        System.out.println("4- Rotar");
                        System.out.println("5- Salir");
                        System.out.print("OpciÃ³n: ");
                        opcionManual = leer.nextInt();

                        switch (opcionManual) {
                            case 1:
                                System.out.println("Escrriba la nueva posiciÃ³n X: ");
                                x = leer.nextInt();
                                System.out.println("Escriba la nueva posiciÃ³n Y: ");
                                y = leer.nextInt();
                                posicion = new Posicion(x, y);

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                seguirManualmente = false;
                                System.out.println("\nÂ¡Ha salido!");
                                break;
                            default:
                                System.out.println("\nÂ¡Ha ingresado una opciÃ³n equivocada!");
                        }
                    }

                    break;
                case 5:
                    System.out.println("\nÂ¡Ha salido del sistema!");
                    noSalir = false;
                    break;
                default:
                    System.out.println("\nÂ¡Ha ingresado una opciÃ³n invÃ¡lida!");
            }
        }

    }

    public static void listarRobots(ArrayList<Robot> lista) {
        System.out.println("\nROBOTS");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + "- " + lista.get(i).toString());
        }
    }

    public static void listarAutomaticos(ArrayList<Robot> lista) {
        System.out.println("Robots AutomÃ¡ticos");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isAutomaticamente()) {
                System.out.println((i + 1) + "- " + lista.get(i).toString());
            }
        }
    }

    public static void listarManuales(ArrayList<Robot> lista) {
        System.out.println("Robots AutomÃ¡ticos");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isManualmente()) {
                System.out.println((i + 1) + "- " + lista.get(i).toString());
            }
        }
    }

    public static void inicializarMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = " ";
            }
        }
        colocarMuros(matriz);
        colocarCarga(matriz);
    }

    public static void colocarMuros(String matriz[][]) {
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < 40; i++) {
            numero1 = (int) (Math.random() * 30 + 1);
            numero1--;
            numero2 = (int) (Math.random() * 30 + 1);
            numero2--;
            matriz[numero1][numero2] = "X";
        }
    }

    public static void colocarCarga(String matriz[][]) {
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < 10; i++) {
            numero1 = (int) (Math.random() * 30 + 1);
            numero1--;
            numero2 = (int) (Math.random() * 30 + 1);
            numero2--;
            matriz[numero1][numero2] = "C";
        }
    }

    public static void mostrarMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}


    

