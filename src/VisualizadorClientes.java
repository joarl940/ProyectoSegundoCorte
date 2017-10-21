import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class VisualizadorClientes  extends JPanel{
	private DefaultTableModel referencia_tabla_model;
	public String [] columnas = {"Nombre","Apellido","Cedula","Edad","Empresa","Sueldo","Foto"};
	private Object[][] tableContents;
	private JTable tabla_Clientes;
	
	 public VisualizadorClientes() {
			// TODO Auto-generated constructor stub

				
				setLayout(new BorderLayout());		
				Border borde1 = BorderFactory.createTitledBorder("VISUALIZADOR CLIENTES");
				setBorder (borde1);
				tableContents = new Object[0][0];
				referencia_tabla_model = new DefaultTableModel(tableContents, columnas);
				tabla_Clientes = new JTable(referencia_tabla_model);
				this.add(new JScrollPane(tabla_Clientes), BorderLayout.CENTER);
		}
		public void refrescarLista(ArrayList<DatosPersonas> referenciaArraList) {
			
			if(referenciaArraList.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay elementos en el arraylist","Mensaje",JOptionPane.WARNING_MESSAGE);
			}
			else {		
				
	 
				tableContents = new Object[referenciaArraList.size()][7];
				  for (int i=0 ; i<referenciaArraList.size() ; i++) {
					tableContents[i][0] = referenciaArraList.get(i).getNombre();
					tableContents[i][1] = referenciaArraList.get(i).getApellido();
					tableContents[i][2] = referenciaArraList.get(i).getCedula();
					tableContents[i][3] = referenciaArraList.get(i).getEdad();
					tableContents[i][4] = referenciaArraList.get(i).getEmpresa();
					tableContents[i][5] = referenciaArraList.get(i).getSueldo();
					tableContents[i][6] = referenciaArraList.get(i).getFoto();

					
				  }
				

				referencia_tabla_model.setDataVector(tableContents, columnas);
		

			}
			 
		}
}
