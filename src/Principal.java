import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Function monedas = new Function();

		boolean flag = true;
		while (flag) {

			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de moneda", "Otro conversor" },
					"Seleccion")).toString();

			switch (opciones) {
			case "Conversor de moneda":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input)) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
					if (JOptionPane.OK_OPTION== respuesta) {
						System.out.println("Selecciona opcion afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				}
				break;

			case "Otro conversor":

				break;

			default:
				break;
			}
		}

	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x <= 0)
				;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
