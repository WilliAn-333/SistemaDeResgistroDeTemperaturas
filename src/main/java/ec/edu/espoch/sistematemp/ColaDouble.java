
package ec.edu.espoch.sistematemp;


public class ColaDouble {
    private double[] datos;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaDouble(int capacidad) {
        datos = new double[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public boolean isfull() {
        return tamaño == datos.length;
    }

    // Registrar nueva temperatura
    public void encolar(double valor) {
        if (isfull()) {
            System.out.println("La cola está llena. No se puede registrar otra temperatura.");
            return;
        }
        fin = (fin + 1) % datos.length;
        datos[fin] = valor;
        tamaño++;
    }

    // Procesar la temperatura más antigua
    public double desencolar() {
        if (isEmpty()) {
            System.out.println("No hay temperaturas para procesar.");
            return -1;
        }
        double temp = datos[frente];
        frente = (frente + 1) % datos.length;
        tamaño--;
        return temp;
    }

    // Ver la siguiente temperatura a procesar
    public double verFrente() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return -1;
        }
        return datos[frente];
    }

    // Visualizar el registro completo
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Registro vacío.");
            return;
        }

        System.out.print(" Registro actual de temperaturas: ");
        int index = frente;

        for (int i = 0; i < tamaño; i++) {
            System.out.print(datos[index] + "°C  ");
            index = (index + 1) % datos.length;
        }
        System.out.println();
    }
    
}
