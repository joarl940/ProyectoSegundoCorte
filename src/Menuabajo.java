import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class Menuabajo extends JPanel implements ActionListener  {
	private JButton btnmejorcliente, btnganancias;
	
public Menuabajo() {
		
		this.iniciar();
	}
	private void iniciar() {
		this.setLayout(new GridLayout(1, 3));
		btnmejorcliente = new JButton("Consulta mejor cliente");	
		btnganancias = new JButton("Ganancias de compra");	
		
		JLabel imagen = new JLabel( ); 
		 ImageIcon icono = new ImageIcon( "imagen/otro.png" );  
	        imagen.setIcon( icono );
	    this.add(imagen);    
		this.add(btnmejorcliente);
		this.add(btnganancias);
		
		btnmejorcliente.setActionCommand( "mejor" );
		btnmejorcliente.addActionListener(this);
		
		btnganancias.setActionCommand( "ganancia" );
		btnganancias.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		 String comando = arg0.getActionCommand( );
		 
		 	if( comando.equals( "mejor" ) )
	        {
	        }
		 	if( comando.equals( "ganancia" ) )
	        {
	        }
}
}
