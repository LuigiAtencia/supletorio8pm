import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        objVehiculo[][] M = new objVehiculo[4][4];
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        
        M = m.registraVehiculo();
        m.mostrarMatriz(M);
        System.out.println("Ingrese la placa a retirar");
        String placa = sc.next();
        m.sacarVehiculo(M,placa);
     
    }
}
