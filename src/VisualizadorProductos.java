import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class VisualizadorProductos extends JPanel {
	private DefaultTableModel referencia_tabla_model;
	public String [] columnas = {"Nombre","Marca","Peso","valor","Cantidad"};
	private Object[][] tableContents;
	private JTable tabla_Productos;
	
 public VisualizadorProductos() {
	/**
	 * creacion del panel para agregar la tabla
	 */

		
		setLayout(new BorderLayout());		
		Border borde1 = BorderFactory.createTitledBorder("VISUALIZADOR PRODUCTOS");
		setBorder (borde1);
		tableContents = new Object[0][0];
		referencia_tabla_model = new DefaultTableModel(tableContents, columnas);
		tabla_Productos = new JTable(referencia_tabla_model);
		this.add(new JScrollPane(tabla_Productos), BorderLayout.CENTER);
}
 /**
  * 
  * @param referenciaArraList
  * recibe el arrayList de productos para agregarlos a la tabla
  */
	public void refrescarLista(ArrayList<DatosProductos> referenciaArraList)
	{
	
		if(referenciaArraList.isEmpty()) 
		{
			JOptionPane.showMessageDialog(null, "No hay elementos en el arraylist","Mensaje",JOptionPane.WARNING_MESSAGE);
		}
		else {		
			
 
			tableContents = new Object[referenciaArraList.size()][5];
			  for (int i=0 ; i<referenciaArraList.size() ; i++) {
				tableContents[i][0] = referenciaArraList.get(i).getNombre();
				tableContents[i][1] = referenciaArraList.get(i).getMarca();
				tableContents[i][2] = referenciaArraList.get(i).getPeso();
				tableContents[i][3] = referenciaArraList.get(i).getValor();
				tableContents[i][4] = referenciaArraList.get(i).getCantidad();


				
			  }
			

			referencia_tabla_model.setDataVector(tableContents, columnas);
	

		}
		 
	}
 
}
