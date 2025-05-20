import javax.swing.JOptionPane;

public class NumerosJOption{

    public static void obtenerNumerosNegativos() {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Ingresa un número negativo (positivo para terminar):")
        );

        while (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Número ingresado: " + numero);
            numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa otro número negativo (positivo para terminar):")
            );
        }
    }

    public static void main(String[] args) {
        obtenerNumerosNegativos();
    }
}