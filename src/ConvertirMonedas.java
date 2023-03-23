import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolares(double valor) {
		double monedaDolar= valor/3739.00;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaDolar= valor/4000.00;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaDolar+ " Dolares");
	}
	
}
