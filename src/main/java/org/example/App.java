package org.example;

import java.util.Scanner;

public class App {

    public static Scanner scannerInput = new Scanner(System.in);
    private static MLog mLog = new MLog();
    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            int opcion = mostrarOpciones();
            switch (opcion) {
                case 1:
                   // verContactos();
                    break;
                case 2:
                   // buscarContactos();
                    break;
                case 3:
                  //  agregarContacto();
                    break;
                case 4:
                  //  eliminarContacto();
                    break;
                case 5:
                default:
                    mLog.showOtherData("Gracias por utilizar la aplicacion!! Vuelve pronto!");
                    salir = true;
                    break;
            }
        }
    }

    private static int mostrarOpciones() {
        int capturarOpcion = 0;

        do {
            mLog.showMenu("+-----------------------------+ \n" +
                    "| Selecciona una operacion:   |\n" +
                    "|   1)VER TODOS LOS CONTACTOS |\n" +
                    "|   2)BUSCAR CONTACTO         |\n" +
                    "|   3)AGREGAR CONTACTO        |\n" +
                    "|   4)ELIMINAR CONTACTO       |\n" +
                    "|   5)SALIR                   |\n" +
                    "+-----------------------------+\n");

            verificarDatoEntrada();
            capturarOpcion = scannerInput.nextInt();

            if (capturarOpcion > 5) {
                mLog.showOtherData("\n[[ Opcion no encontrada ]]\n");
            } else if (capturarOpcion == 0) {
                mLog.showOtherData("\n[[ Debes seleccionar solamente una opcion ]]\n");
            }

        } while (capturarOpcion == 0 || capturarOpcion > 5);

        return capturarOpcion;
    }

    private static void verificarDatoEntrada() {
        while (!scannerInput.hasNextInt()) {
            mLog.showOtherData("Ingresa un valor NUMERICO:");
            scannerInput.next();
        }
    }
}
