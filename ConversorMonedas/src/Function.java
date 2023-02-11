import javax.swing.*;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double ValorRecibido) {
		
		String opcion = (JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De peso a dolar","De peso a Euro"},"Seleccion")).toString();
		
		switch (opcion) {
		case "De peso a dolar":{
			
				monedas.ConvertirPesosArgADolar(ValorRecibido);
				break;
				
			}
		case "De peso a Euro":{
			
				monedas.ConvertirPesosArgAEuro(ValorRecibido);
				break;
			
			}
		}
	}
}