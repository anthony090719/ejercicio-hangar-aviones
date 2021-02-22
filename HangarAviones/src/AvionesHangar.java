import javax.swing.JOptionPane;

public class AvionesHangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0,elemento=0;
		Pila pilita= new Pila();
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Añadir avion al hangar\n"
						+ "2. avion disponible para salir del hangar\n" 
						+ "3. ¿el hangar esta vacio?\n"
						+ "4. proximo avion en despegar\n"
						+ "5. aviones pendientes de despegar\n"
						+ "6. Vaciar hangar\n"
						+ "7. Salir\n"
						+ "QUE DESEA REALIZAR ", "Menu de opciones",
						JOptionPane.INFORMATION_MESSAGE));
				switch (opcion) {
				case 1:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
							"ingrese el numero de placa del avion a añadir", "Apilando Datos",
							JOptionPane.INFORMATION_MESSAGE));
				pilita.empujar(elemento);
					break;
				case 2:
					if(!pilita.estaVacia()) {
						JOptionPane.showMessageDialog(null, "el proximo avion en salir es"
								+ pilita.sacar(),
								"obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					if (pilita.estaVacia()) {
						JOptionPane.showMessageDialog(null, "el hangar esta vacio",
								"la pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "el hangar no esta vacio",
								"la pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					if(!pilita.estaVacia()) {
						JOptionPane.showMessageDialog(null, "el avion proximo para despegar es" + pilita.cima(),
						
								"cima de la pila", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "la pila esta vacia",
								"pila vacia", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
				{
					JOptionPane.showMessageDialog(null, "el numero de aviones pendientes de despegar son " + pilita.tamanioPila(),
							"vaciando hangar", JOptionPane.INFORMATION_MESSAGE);
				}
					break;
				case 6:
					if(!pilita.estaVacia()) {
						pilita.limpiarPila();
						JOptionPane.showConfirmDialog(null, "el hangar se ha vaciado" ,
								"vaciando hangar", JOptionPane.INFORMATION_MESSAGE);
						
				} else {
					JOptionPane.showMessageDialog(null, "hangar esta vacio, no hay nada que vaciar",
							"hangar vacio", JOptionPane.INFORMATION_MESSAGE);	
				}
					break;
				case 7:
					JOptionPane.showConfirmDialog(null, "aplicacion finalizada",
							"Fin", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showConfirmDialog(null, "opcion incorrecta",
							"Error", JOptionPane.INFORMATION_MESSAGE);
				}
				
											
			}catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
				
				
			}
		}while(opcion!=7);

	}

}
