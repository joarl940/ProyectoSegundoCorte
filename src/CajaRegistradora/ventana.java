package CajaRegistradora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.SystemColor;


public class ventana extends JFrame{
	private JPanel panel;
	private JLabel lblEspecie,lblMenu;
	private JButton btnSubir,btnGanador,btnNewButton,btnVerListadoDe,btnRegistrarCliente,btnNewButton_1,btnListadoDeClientes,btnMejoresClientes,btnIniciarCompra,btnEliminarCompra;
    private JList list;
	public ventana(String string) {
		this.inicio();
		
		
		
		getContentPane().setLayout(null);
		
		JLabel lblEspecie = new JLabel("Electrodomesticos UDEC");
		lblEspecie.setBounds(176, 11, 131, 14);
		getContentPane().add(lblEspecie);
		
		JButton btnSubir = new JButton("agregar productos");
		btnSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.getClass();
				/*JTextField nombre;
				JTextField cantidad;
				JTextField marca;
				JTextField peso;
				JTextField valUn;
				String[] columnas = {"nombre","cantidad", "Marca", "peso", "valor"};
				JButton agregar;
				DefaultTableModel referencia_tabla_model;
				ArrayList<Object[]> referencia_almacen;
				
		*/	} 
		});
		btnSubir.setBounds(10, 174, 166, 23);
		getContentPane().add(btnSubir);
		 
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(43, 160, 92, 14);
		getContentPane().add(lblMenu);
		
		JButton btnGanador = new JButton("consultar ganancias de las compras");
		btnGanador.setBounds(342, 511, 226, 23);
		getContentPane().add(btnGanador);
		
		JButton btnNewButton = new JButton("Consultar mejor cliente");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(189, 511, 143, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnVerListadoDe = new JButton("ver listado de inventario");
		btnVerListadoDe.setBounds(10, 208, 166, 23);
		getContentPane().add(btnVerListadoDe);
		
		JButton btnNewButton_1 = new JButton("alerta de inventario");
		btnNewButton_1.setBounds(10, 242, 166, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnRegistrarCliente = new JButton("registrar cliente");
		btnRegistrarCliente.setBounds(10, 303, 166, 23);
		getContentPane().add(btnRegistrarCliente);
		
		JButton btnListadoDeClientes = new JButton("listado de clientes");
		btnListadoDeClientes.setBounds(10, 338, 166, 23);
		getContentPane().add(btnListadoDeClientes);
		
		JButton btnMejoresClientes = new JButton("mejores clientes");
		btnMejoresClientes.setBounds(10, 372, 166, 23);
		getContentPane().add(btnMejoresClientes);
		
		JButton btnIniciarCompra = new JButton("iniciar compra");
		btnIniciarCompra.setBounds(10, 434, 166, 23);
		getContentPane().add(btnIniciarCompra);
		
		JButton btnEliminarCompra = new JButton("eliminar compra");
		btnEliminarCompra.setBounds(10, 468, 166, 23);
		getContentPane().add(btnEliminarCompra);
		
		JList list = new JList();
		list.setBounds(207, 159, 348, 333);
		getContentPane().add(list);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 160, 190, 351);
		getContentPane().add(panel);
		
	}
	private void inicio() {
		// TODO Auto-generated method stub
		Dimension d = new Dimension(1280,1000);
		this.setSize(d);
	    //this.setPreferredSize(d);
		this.getContentPane().setLayout(new BorderLayout() );
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	}
