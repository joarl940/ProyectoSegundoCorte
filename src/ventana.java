import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class ventana extends JFrame {
	public ArrayList<DatosProductos> listProductos;
	public ArrayList<DatosPersonas> listPersona;
	Titulo titulo;
	menu menu;
	Menuabajo abajo;
	Visualizador vista;
	//PanelCentro panelCentro;
	//PanalIzquierdo panelOpciones;
//	PanelDerecho panelDerecho;
	
	ventana(){
		 super("ELECTRODOMESTICOS UDEC");
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

       vista = new Visualizador();
        add( vista, BorderLayout.CENTER );

    //panelOpciones = new PanalIzquierdo(null, null);
     //add( panelOpciones, BorderLayout.WEST );
        
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
	
	
}
