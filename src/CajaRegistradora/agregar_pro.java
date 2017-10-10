package CajaRegistradora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class agregar_pro extends JPanel implements ActionListener{
	
	private JTextField nombre,cantidad,marca,peso,valor;
	private String[] columnas = {"nombre","cantidad", "Marca", "peso","valor"};
	private JButton agregar;
	private DefaultTableModel referencia_tabla_model;
	private ArrayList<Object[]> referencia_almacen;
	
	public void agregar_pro (DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen) {
		//super();
		this.referencia_tabla_model = referencia_tabla_model;
		this.referencia_almacen = referencia_almacen;
		
		this.iniciar();
	}
	
	private void iniciar() {
		this.setLayout(new GridLayout(2, 4));
		
		nombre = new JTextField(10);
		cantidad = new JTextField(10);
		marca = new JTextField(10);
		peso = new JTextField(10);
		valor = new JTextField(10);
		agregar = new JButton("Agregar");

		this.add(new JLabel("nombre"));
		this.add(new JLabel("cantidad"));
		this.add(new JLabel("marca"));
		this.add(new JLabel("peso"));
		this.add(new JLabel("valor"));
		this.add(new JLabel(""));
		this.add(nombre);
		this.add(cantidad);
		this.add(marca);
		this.add(peso);
		this.add(valor);
		this.add(agregar);
		
		agregar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nombre = this.nombre.getText();
		String cantidad = this.cantidad.getText();
		String marca = this.marca.getText();
		String peso = this.peso.getText();
		String valor = this.valor.getText();
		
		referencia_almacen.add(productos.build(nombre,cantidad,marca,peso,valor).getDetalles());
		Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
		referencia_tabla_model.setDataVector(datos, columnas);
		
		this.nombre.setText("");
		this.cantidad.setText("");
		this.marca.setText("");
		this.peso.setText("");
		this.valor.setText("");
	}
		
}