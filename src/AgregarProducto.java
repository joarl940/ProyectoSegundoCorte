import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class AgregarProducto extends JFrame {
ventana referenciaMenu;
	
	
	//PanelProductos pro;

	//PanelCentro panelCentro;
	//PanalIzquierdo panelOpciones;
//	PanelDerecho panelDerecho;
	
	public AgregarProducto(ventana _referenciaMenu){
		 super("AGREGAR PRODUCTOS");
		 referenciaMenu=_referenciaMenu;
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		// Centrar la ventana
         setLocationRelativeTo( null );
	}
	
	public AgregarProducto iniciar(){  //configura el jframer
				
				Dimension dims = new Dimension(300, 500);
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
		PanelProductos panel=new PanelProductos(referenciaMenu);
		add(panel, BorderLayout.CENTER);

      
	}
	

	
	
}