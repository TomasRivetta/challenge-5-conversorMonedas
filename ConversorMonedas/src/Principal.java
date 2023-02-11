import javax.swing.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Function monedas = new Function();
		
		String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda","Conversor de temperatura"},"Seleccion")).toString();
		
		switch (opciones) {
		case "Conversor de Moneda":{
			
				String cantConvertirMone = JOptionPane.showInputDialog("Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(cantConvertirMone);
				monedas.ConvertirMonedas(valorRecibido);
				
				int seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion o deseas salir?");
				if(JOptionPane.OK_OPTION == seleccion) {
					System.out.println("Selecciona opcion afirmativa");
					cantConvertirMone = JOptionPane.showInputDialog("Ingrese el valor a convertir");
					valorRecibido = Double.parseDouble(cantConvertirMone);
					monedas.ConvertirMonedas(valorRecibido);
					
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
				
				
			}
		case "Conversor de temperatura":{
			
				String cantConvertirTemp = JOptionPane.showInputDialog("Ingrese el valor a convertir");
			
			}
		}
	}
	
}
