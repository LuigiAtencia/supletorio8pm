import java.util.Objects;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public objVehiculo[][] registraVehiculo() {
        objVehiculo[][] m = new objVehiculo[2][2];

        int respuesta = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                while (respuesta == 1) {
                    objVehiculo o = new objVehiculo();
                    System.out.println("Ingrese la placa del vehiculo: ");
                    o.setPlaca(sc.next());
                    System.out.println("Ingresa el nombre del propietario: ");
                    o.setNombre(sc.next());
                    System.out.println("Ingrese el cilindraje: ");
                    o.setCilindraje(sc.nextDouble());
                    System.out.println("Ingrese el modelo del vehiculo: ");
                    o.setModelo(sc.next());
                    o.setDisponible(false);
                    System.out.println("¿Desea Ingresar otro vehiculo? 1.Si 2.No: ");
                    respuesta = sc.nextInt();

                    m[i][j] = o;
                }

            }

        }

        return m;
    }

    public void mostrarMatriz(objVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objVehiculo objeto = m[i][j];
                if (objeto != null) {
                    if (m[i][j].getDisponible().equals(null)) {
                        System.out.println("Celdas: " + (i + 1) + "," + (j + 1) + " Está Disponible");
                    } else {
                        System.out.println("Celdas: " + (i + 1) + "," + (j + 1) + " Está ocupado");
                    }
                }

            }
        }
    }

    public objVehiculo[][] sacarVehiculo(objVehiculo[][] m2, String Placa2) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                objVehiculo o = new objVehiculo();
                if (m2[i][j].getPlaca().equalsIgnoreCase(Placa2)) {
                    o.setPlaca("");
                    o.setNombre("");
                    o.setCilindraje(0.0);
                    o.setModelo("");
                    o.setDisponible(true);
                    m2[i][j] = o;
                }
            }
        }
        return m2;
    }
}
