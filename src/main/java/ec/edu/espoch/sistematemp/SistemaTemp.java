
package ec.edu.espoch.sistematemp;

/**
 *
 * @author Willian Caisaguano , Cristhian Valencia , Marjorie Chimbo
 */
public class SistemaTemp {

    public static void main(String[] args) {
    System.out.println("== Sistema de Registro de Temperaturas Ambientales ===");

        ColaDouble registro = new ColaDouble(5);

        registro.encolar(23.5);
        registro.encolar(24.1);
        registro.encolar(22.9);

        registro.mostrar();

        System.out.println("Próxima temperatura a procesar: " + registro.verFrente() + "°C");

        System.out.println("Procesando: " + registro.desencolar() + "°C");
        registro.mostrar();

        registro.encolar(25.3);
        registro.mostrar();
    }
}

