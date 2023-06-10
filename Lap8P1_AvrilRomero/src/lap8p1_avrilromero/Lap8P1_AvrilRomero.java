/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap8p1_avrilromero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rodge
 */
public class Lap8P1_AvrilRomero {
//validar si no ha entrado libros no puede modificar
    //segundo ejercicio usar gets
    //no empieza en 0 

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    static int cont = 0;//validar si entro en ingresar libros
    static Libro[][] libreria;
    static boolean valid = true;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Ingresar el libro");
            System.out.println("2.Modificar libro");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    libreria = llenarLibrero();
                    imprimirLibrero(libreria);
                    cont++;
                }
                break;
                case 2: {
                    if (cont >= 1) {
                        System.out.println("Ingrese el titulo del libro: ");
                        String titulo = sc.nextLine();
                        System.out.println("Ingrese el escritor: ");
                        String escritor = sc.nextLine();
                        System.out.println("Ingrese el año de publicacion: ");
                        String year = sc.nextLine();
                        if (valid == false) {
                            imprimirLibrero2(ModificarLibro(titulo, escritor, year, libreria));
                        } else {
                            System.out.println("El libro no se encuentra en la libreria");
                        }
                    } else {
                        System.out.println("Debe crear el librero primero");
                    }

                }
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default: {
                    System.out.println("Opcion Incorrecta");
                }
                break;
            }

        }

    }//fin del main

    public static Libro[][] llenarLibrero() {
        System.out.println("Ingrese la cantidad de filas para el librero: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas para el librero: ");
        int columnas = leer.nextInt();
        boolean valid = true;
        if (filas < 0 || columnas < 0) {
            valid = false;
        }
        while (valid == false) {
            System.out.println("Ingrese la cantidad de filas para el librero: ");
            filas = leer.nextInt();
            System.out.println("Ingrese la cantidad de columnas para el librero: ");
            columnas = leer.nextInt();
            if (filas < 0 || columnas < 0) {
                valid = false;
            }
        }
        Libro[][] librero = new Libro[filas][columnas];
        System.out.println("");
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                System.out.println("Ingrese el titulo del libro: ");
                String titulo = sc.nextLine();
                System.out.println("Ingrese el escritor: ");
                String escritor = sc.nextLine();
                System.out.println("Ingrese el año de publicacion: ");
                String year = sc.nextLine();
                System.out.println("El libro fue agregado exitosamente");
                System.out.println("");
                Libro L = new Libro(titulo, escritor, year);
                librero[i][j] = L;
            }
        }
        return librero;
    }//fin metodo 1

    public static void imprimirLibrero(Libro[][] matriz) {
        System.out.println("El librero completo es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Libro librito = matriz[i][j];
                System.out.print("[" + librito.getTitulo() + "]");
            }
            System.out.println("");
        }
    }//fin metodo 2

    public static Libro[][] ModificarLibro(String titulo, String autor, String year, Libro[][] matrizog) {
        // Libro[][] newlibrero = new Libro[matrizog[0].length][matrizog.length];
        int fila;
        int columna;
        for (int i = 0; i < matrizog.length; i++) {
            for (int j = 0; j < matrizog[i].length; j++) {
                Libro librito = matrizog[i][j];
                String titulo1 = librito.getTitulo();
                String autor1 = librito.getEscritor();
                String year1 = librito.getYear();
                if (titulo1.equalsIgnoreCase(titulo) && autor1.equalsIgnoreCase(autor) && year1.equalsIgnoreCase(year)) {
                    fila = i + 1;
                    columna = j + 1;
                    System.out.println("El libro fue encontrado en la fila " + fila + " columna " + columna);
                    System.out.println("");
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo2 = sc.nextLine();
                    System.out.println("Ingrese el escritor: ");
                    String escritor2 = sc.nextLine();
                    System.out.println("Ingrese el año de publicacion: ");
                    String year2 = sc.nextLine();
                    System.out.println("El libro fue modificado exitosamente");
                    librito.setTitulo(titulo2);
                    librito.setEscritor(escritor2);
                    librito.setYear(year2);
                    valid = false;
                    break;
                }
            }//fin for
        }//fin for 2

        return matrizog;
    }

    public static void imprimirLibrero2(Libro[][] matriz) {
        System.out.println("El librero modificado es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Libro librito = matriz[i][j];
                System.out.print("[" + librito.getTitulo() + "]");
            }
            System.out.println("");
        }
    }//fin metodo 2

}//fin de la clase
