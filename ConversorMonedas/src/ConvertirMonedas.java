import javax.swing.*;

public class ConvertirMonedas {
	
	
	public void ConvertirPesosArgADolar(double valorRecibido){
		
		double monedaDolar = valorRecibido / 370;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
			
	}
	
	public void ConvertirPesosArgAEuro(double valorRecibido){
		
		double monedaEuro = valorRecibido / 383;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euro");
			
	}
		

}
