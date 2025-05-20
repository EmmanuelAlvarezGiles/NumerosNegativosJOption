import javax.swing.JOptionPane;

public class NumerosJOption{

    public static int obtenerNumeros(String mensaje) {
        int numeroTemporal= 0;

        while (numeroTemporal <= 0){
            String numero = JOptionPane.showInputDialog(": ");
            numeroTemporal= Integer.parseInt(numero);
        }
        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero = obtenerNumeros("Ingrese un numero");
    }
}
