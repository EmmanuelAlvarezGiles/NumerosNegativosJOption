import javax.swing.JOptionPane;

public class NumerosJOption{

    public static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        int numero = obtenerNumero("Ingresa números negativos:");

        while (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Número ingresado: " + numero);
            numero = obtenerNumero("Ingresa otro número negativo:");
        }
    }
}