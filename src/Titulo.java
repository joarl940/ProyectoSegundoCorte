import java.awt.*;
import javax.swing.*;

public class Titulo extends JPanel {
	
	public Titulo() {  //constructor
		
		    setLayout( new BorderLayout( ) );  // organiza en el tipo de orden que quiero ""BorderLayout""
	        JLabel imagen = new JLabel( );   
	        JLabel imagen1 = new JLabel( );//carga una imagen 
	        ImageIcon icono = new ImageIcon( "imagen/titulo.png" );     //icono aloja la imagen   
	     
	        
	        imagen.setIcon( icono );
	      
	        //Define el icono que mostrará este componente.
	        
	        
	        imagen.setHorizontalAlignment( JLabel.CENTER );   //lo ubica
	    
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        
	        add( imagen, BorderLayout.CENTER);
	      
	        //ubicacion de mi imagen dentro del panel
	        
	        
	        setBackground( Color.WHITE );
	}
}
