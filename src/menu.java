/**
 * Clase menu 
 * contiene el menu princial que se verá en la ventana principal.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class menu extends JPanel implements ActionListener {
	private JButton btnproductos,btninventario,btnalerta,btnregcliente,	btnlistcliente,
	btnmejorclien,btncompra,btneliminar;
	private ventana referenciaVentaPrincipal;
	
	public menu(ventana _referencia) {
		referenciaVentaPrincipal=_referencia;
		this.iniciar();
	}
	private void iniciar()
	{
		
		/**
		 * creacion de los componentes del panel 
		*/
		setBorder( new TitledBorder( "MENU" ) );
		this.setLayout(new GridLayout(8, 1));
		btnproductos = new JButton("Agregar Productos");	
		btninventario= new JButton("Ver listado inventario");
		btnalerta = new JButton("Alerta inventario");
		btnregcliente = new JButton("Registrar cliente");
		btnlistcliente = new JButton("Listado cliente");	
		btnmejorclien = new JButton("Mejores clientes");
		btncompra = new JButton("Iniciar compra");
		btneliminar = new JButton("Eliminar compra");	
	
		this.add(btnproductos);
		this.add(btninventario);
		this.add(btnalerta);
		this.add(btnregcliente);
		this.add(btnlistcliente);
		this.add(btnmejorclien);
		this.add(btncompra);
		this.add(btneliminar);
		
		/**
		 * define los tipos de action para los eventos de cada boton
		 */
		btnproductos.setActionCommand( "agregar" );
		btnproductos.addActionListener(this);
		
		btninventario.setActionCommand( "inventario" );
		btninventario.addActionListener(this);
		
		btnalerta.setActionCommand( "alerta" );
		btnalerta.addActionListener(this);
	
		btnregcliente.setActionCommand( "registro" );
		btnregcliente.addActionListener(this);
		
		btnmejorclien.setActionCommand( "mejor" );
		btnmejorclien.addActionListener(this);
		
		btncompra.setActionCommand( "compra" );
		btncompra.addActionListener(this);
		
		btneliminar.setActionCommand( "eliminar" );
		btneliminar.addActionListener(this);
	}
	
	@Override
	/**
	 * eventos de los botones 
	 */
	public void actionPerformed(ActionEvent arg0) {
		 String comando = arg0.getActionCommand( );
		 
		 	if( comando.equals( "agregar" ) )
	        {
		 		/**
		 		 * llamado al Jframe para agregar el producto
		 		 */
		 		AgregarProducto agregar=new AgregarProducto(referenciaVentaPrincipal);
		 		agregar.setVisible(true);
		 		
	        }
		 	
			if( comando.equals( "inventario" ) )
	        {
			
	        }
			if( comando.equals( "alerta" ) )
	        {
	        }
			if( comando.equals( "registro" ) )
	        {
				/**
				 * llamado al jframe para el registro del cliente
				 */
				RegistrarCliente agregar=new RegistrarCliente(referenciaVentaPrincipal);
		 		agregar.setVisible(true);	
	        }
			if( comando.equals( "mejor" ) )
	        {
				
	        }
			if( comando.equals( "compra" ) )
	        {
	        }
			if( comando.equals( "eliminar" ) )
	        {
	        }
	        }
	

}
