package org.example;

import org.example.models.ModelContacto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static Scanner scannerInput = new Scanner(System.in);
    public static ArrayList<ModelContacto> listasContactos = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private static int mostrarOpciones() {
        int capturarOpcion = 0;

        do {
//            escribirConsola("""
//                    +-----------------------------+
//                    | Selecciona una operacion:   |
//                    |   1)VER TODOS LOS CONTACTOS |
//                    |   2)BUSCAR CONTACTO         |
//                    |   3)AGREGAR CONTACTO        |
//                    |   4)ELIMINAR CONTACTO       |
//                    |   5)SALIR                   |
//                    +-----------------------------+""");
//
//            verificarDatoEntrada();
//            capturarOpcion = scannerInput.nextInt();
//
//            if (capturarOpcion > 5) {
//                escribirConsola("\n[[ Opcion no encontrada ]]\n");
//            } else if (capturarOpcion == 0) {
//                escribirConsola("\n[[ Debes seleccionar solamente una opcion ]]\n");
//            }

        } while (capturarOpcion == 0 || capturarOpcion > 5);

        return capturarOpcion;
    }

    private static void verificarDatoEntrada() {
        while (!scannerInput.hasNextInt()) {
          //  escribirConsola("Ingresa un valor NUMERICO:");
            scannerInput.next();
        }
    }

    public static ArrayList buscarContactos() {

        scannerInput.nextLine();
//        escribirConsola("-----------------------");
//        escribirConsola("Escribe el nombre del contacto: ");
        String nombreBuscar = scannerInput.nextLine();

        ArrayList<ModelContacto> contactosEncontrados = new ArrayList<>();
//        for (int i = 0; i < listasContactos.size(); i++) {
//
//            ModelContacto select = listasContactos.get(i);
//            String nombreSeleccionado = select.getNombre().toLowerCase();
//
//            if (nombreSeleccionado.contains(nombreBuscar.toLowerCase())) {
//                contactosEncontrados.add(select);
//                escribirConsola("agrego a " + nombreSeleccionado + " id " + i);
//            }
//        }
//
//        if (!contactosEncontrados.isEmpty()) {
//
//            for (int i = 0; i < contactosEncontrados.size(
//
//            ); i++) {
//
//                ModelContacto seleccionado = contactosEncontrados.get(i);
//
//                escribirConsola("-----------------------");
//                escribirConsola("- ID: " + i);
//                escribirConsola("    " + seleccionado.getNombre());
//                escribirConsola("    " + seleccionado.getTelefono());
//                escribirConsola("-----------------------");
//            }
//
//            contactosEncontrados.clear();
//
//        } else {
//            escribirConsola("No encontramos contacto con ese nombre, prueba nuevamente...");
//            buscarContactos();
//        }
        return contactosEncontrados;
    }

    public static void agregarContacto() {
        scannerInput.nextLine();
//        escribirConsola("Ingrese nombre del contacto");
//        String name = scannerInput.nextLine();
//        escribirConsola("Ingrese telefono del contacto");
//        String cel = scannerInput.nextLine();
//        listasContactos.add(new ModelContacto(name, cel));
//        escribirConsola("contacto agregado");
    }

    public static void eliminarContacto() {
        ArrayList contactosSeleccionados = buscarContactos();
//
//        escribirConsola("Ingrese en id del contacto a eliminar");
//        verificarDatoEntrada();
//        int id = scannerInput.nextInt();
//
//        if (id > contactosSeleccionados.size()) {
//            escribirConsola("-----------------------");
//            escribirConsola("has ingresado un valor no valido");
//            escribirConsola("-----------------------");
//
//        } else {
//            escribirConsola("has eliminado a " + listasContactos.get(id).getNombre());
//            listasContactos.remove(id);
//        }
    }
}
