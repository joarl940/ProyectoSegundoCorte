import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelProductos extends JPanel implements ActionListener {
	private Insets in;
	private GridBagConstraints c;
	private JButton btnagregar,btnvolver;
	private JTextField txtpeso,txtvalor, txtcantidad;
	private JComboBox jcbnombre,jcbmarca;
	private ventana referenciaVentaPrincipal;
	
	public PanelProductos(ventana _referenciaVentaPrincipal) {

		referenciaVentaPrincipal=_referenciaVentaPrincipal;
		
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("AGREGAR PODUCTOS");
		setBorder (borde1);
		
		JLabel jlbnombre= new JLabel("Nombre ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( jlbnombre,c);
        
        
        jcbnombre=new JComboBox();
		jcbnombre.setModel(new DefaultComboBoxModel(new String[] {"seleccionar","Televisor","Nevera","lavadora","Teatro en casa","Licuadora","Sanduchera","Estufa","Cafetera","DVD","Otro"}));
		
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(jcbnombre,c);
        
        JLabel jlbmarca= new JLabel("Marca");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=2;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( jlbmarca,c);
        
        jcbmarca=new JComboBox();
		jcbmarca.setModel(new DefaultComboBoxModel(new String[] {"seleccionar","SONY","HACEB","HOME ELEMENTS","MABE","SAMSUNG","LG","CHALLENGUER","Otro"}));
		c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=3;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(jcbmarca,c);
        
        JLabel jlbpeso= new JLabel("Peso:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=4;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( jlbpeso,c);
        
        txtpeso = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=5;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(txtpeso,c);
        
        JLabel jlbvalor= new JLabel("Valor:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=6;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( jlbvalor,c);
        
        txtvalor = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=7;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(txtvalor,c);
        
        JLabel jlbcantidad= new JLabel("Cantidad:");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=8;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( jlbcantidad,c);
        
        txtcantidad = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=9;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(txtcantidad,c);
	
        btnagregar = new JButton("Agregar");
        btnagregar.addActionListener(this);
        btnagregar.setActionCommand("agregar");
        c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=10;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;
        add(btnagregar,c);
	
        btnvolver = new JButton("Volver");
        btnvolver.addActionListener(this);
        btnvolver.setActionCommand("volver");
        c=new GridBagConstraints();
        c.gridx=1;
        c.gridy=10;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;
        add(btnvolver,c);
	
	}
	public void actionPerformed(ActionEvent arg0) {
		 String comando = arg0.getActionCommand( );
		 
		 	if( comando.equals( "agregar" ) )
	        {

			try {
		String nombre=(String)jcbnombre.getSelectedItem();
		String marca=(String)jcbmarca.getSelectedItem();	
		int cantidad=Integer.parseInt(txtcantidad.getText());
		double valor=Double.parseDouble(txtvalor.getText());
		double peso=Double.parseDouble(txtpeso.getText());
		 if(txtcantidad==null||txtcantidad.equals("")){
	            JOptionPane.showMessageDialog(this,"CANTIDAD INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	     txtcantidad.setText("");       
		 }else  if(txtpeso==null||txtpeso.equals("")){
	            JOptionPane.showMessageDialog(this,"PESO INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	     txtpeso.setText("");       
		 }else  if(txtvalor==null||txtvalor.equals("")){
	            JOptionPane.showMessageDialog(this,"VALOR INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	     txtvalor.setText("");       
		 }else {
		referenciaVentaPrincipal.agregarProducto(nombre, marca,peso, valor, cantidad);
		
		JOptionPane.showMessageDialog(null,"Producto agregado. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		txtcantidad.setText("");
       txtpeso.setText("");
       txtvalor.setText("");
		}
			}catch (NumberFormatException e1) {
	        JOptionPane.showMessageDialog(this,"DATOS INCORRECTOS ","ERROR",JOptionPane.ERROR_MESSAGE);
	       
	        txtcantidad.setText("");
	        txtpeso.setText("");
	        txtvalor.setText("");
		}
		
      }
		 	if( comando.equals( "volver" ) )
	        {

				Window v=FocusManager.getCurrentManager().getActiveWindow();
				v.setVisible(false);
	        }
	}
	
	

}
