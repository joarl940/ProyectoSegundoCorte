import java.awt.*;
import javax.swing.*;


public class ventana extends JFrame {
	Titulo titulo;
	menu menu;
	Menuabajo abajo;
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

       // panelCentro = new PanelCentro( );
       // add( panelCentro, BorderLayout.CENTER );

    //panelOpciones = new PanalIzquierdo(null, null);
     //add( panelOpciones, BorderLayout.WEST );
        
      abajo = new Menuabajo();
      add( abajo, BorderLayout.SOUTH );
	}
	
}