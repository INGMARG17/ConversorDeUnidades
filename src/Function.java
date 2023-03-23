import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	//convertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "de pesos a Dolar", "De pesos a Euro" },
				"Seleccion")).toString();

		switch (opcion) {
		case "de pesos a Dolar":
			monedas.ConvertirPesosADolares(Minput);
			break;
		case "De pesos a Euro":
			monedas.ConvertirPesosAEuros(Minput);
			break;

		default:
			break;
		}

	}

}
