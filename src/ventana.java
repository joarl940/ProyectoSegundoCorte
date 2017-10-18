import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class ventana extends JFrame {
	public ArrayList<DatosProductos> listProductos;
	public ArrayList<DatosPersonas> listPersona;
	Titulo titulo;
	menu menu;
	Menuabajo abajo;
	VisualizadorProductos vista;
	VisualizadorClientes vistaC;
	//PanelCentro panelCentro;
	//PanalIzquierdo panelOpciones;
//	PanelDerecho panelDerecho;
	
	ventana(){
		 super("ELECTRODOMESTICOS UDEC");
		 listProductos= new ArrayList<DatosProductos>();
		 listPersona = new ArrayList<DatosPersonas>();
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		// Centrar la ventana
         setLocationRelativeTo( null );
	}
	
	public ventana iniciar(){  //configura el jframer
				
				Dimension dims = new Dimension(800, 600);
				this.setSize(dims);
				this.setPreferredSize(dims);
				/*
				 * Ordenamiento del Jframe
				 * */
				this.getContentPane( ).setLayout( new BorderLayout( ) );  //organiz el panel interno del j framer         BorderLayout: ventanas de los bordes 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
	}
	
	
	public void componente() {
		
		
		
		// Creación de los paneles aquí   los agrega aljframer
		
		titulo = new Titulo( );
        add( titulo, BorderLayout.NORTH );

       menu = new menu();
        add( menu, BorderLayout.WEST );

       vista = new VisualizadorProductos();
      add( vista, BorderLayout.CENTER );
        
      //  vistaC = new VisualizadorClientes();
       // add( vistaC, BorderLayout.CENTER );

        
      abajo = new Menuabajo();
      add( abajo, BorderLayout.SOUTH );
	}
	public void  agregarProducto(String _nombreP, String _marca,double _peso,double _valor,int _cantidad) {
		DatosProductos productos = new DatosProductos(_nombreP, _marca, _peso, _valor, _cantidad);
     listProductos.add(productos);
		actualizarTabla();
	}
	public void actualizarTabla() {
		vista.refrescarLista(listProductos);
	}
	public void  agregarCliente(String _nombre, String _apellido,int _cedula,int _edad,double _sueldo,String _empresa,String _foto) {
		DatosPersonas cliente = new DatosPersonas(_nombre,_apellido,_cedula,_edad,_empresa,_sueldo,_foto);
     listPersona.add(cliente);
		actualizarTabla();
	}
	public void actualizarTablaC() {
		vistaC.refrescarLista(listPersona);
	}
	
	
}
