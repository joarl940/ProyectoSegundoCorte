import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.FocusManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistrarCliente extends JFrame implements ActionListener {
	private JButton btnagregar,btnvolver,btnfoto;
	private JTextField txtnombre,txtapellido,txtcedula,txtedad,txtempresa,txtsueldo;
	private File fichero;
	private ventana referenciaVentaPrincipalC;
	//private ventana buscar=new ventana();
	public RegistrarCliente (ventana _referenciaC) {
		super("REGISTRAR CLIENTES");
		referenciaVentaPrincipalC=_referenciaC;
		
		this.iniciar(); //Configurar mi JFRAME
		this.configurarComponentes();

		this.pack();
		this.setVisible(true);
	}
	
	private RegistrarCliente iniciar() {
		
		Dimension dims = new Dimension(400, 450);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return this;
	}
private void configurarComponentes() {
		
		Container contentPane = this.getContentPane();
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(10, 30, 60, 20);
		contentPane.add(nombre);
		txtnombre=new JTextField(10);
		txtnombre.setBounds(70,30,250,20);
		contentPane.add(txtnombre);
		
		JLabel apellido= new JLabel("Apellido:");
		apellido.setBounds(10, 60, 60, 20);
		contentPane.add(apellido);
		txtapellido=new JTextField(10);
		txtapellido.setBounds(70,60,250,20);
		contentPane.add(txtapellido);
		
		JLabel cedula= new JLabel("Cedula:");
		cedula.setBounds(10, 90, 60, 20);
		contentPane.add(cedula);
		txtcedula=new JTextField(10);
		txtcedula.setBounds(70,90,250,20);
		contentPane.add(txtcedula);
		
		JLabel edad= new JLabel("Edad:");
		edad.setBounds(10, 120, 60, 20);
		contentPane.add(edad);
		txtedad=new JTextField(10);
		txtedad.setBounds(70,120,250,20);
		contentPane.add(txtedad);
		
		JLabel sueldo= new JLabel("Sueldo:");
		sueldo.setBounds(10, 150, 60, 20);
		contentPane.add(sueldo);
		txtsueldo=new JTextField(10);
		txtsueldo.setBounds(70,150,250,20);
		contentPane.add(txtsueldo);
		
		JLabel empresa= new JLabel("Empresa:");
		empresa.setBounds(10, 180, 60, 20);
		contentPane.add(empresa);
		txtempresa=new JTextField(10);
		txtempresa.setBounds(70,180,250,20);
		contentPane.add(txtempresa);
		
		JLabel foto= new JLabel("FOTO:");
		foto.setBounds(70, 210, 100, 100);
		contentPane.add(foto);
		btnfoto=new JButton("CARGAR FOTO");
		btnfoto.setBounds(100,300,150,40);
		contentPane.add(btnfoto);
		
		btnagregar=new JButton("REGISTAR");
		btnagregar.setBounds(20,360,100,40);
		contentPane.add(btnagregar);
		
		btnvolver=new JButton("VOLVER");
		btnvolver.setBounds(210,360,100,40);
		contentPane.add(btnvolver);
		
		btnagregar.setActionCommand( "agregar" );
		btnagregar.addActionListener(this);
		
		btnvolver.setActionCommand( "volver" );
		btnvolver.addActionListener(this);
		
		btnfoto.setActionCommand( "foto" );
		btnfoto.addActionListener(this);
		
		btnfoto.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser fc = new JFileChooser( "./data" );
	            fc.setDialogTitle( "Buscar imagen cliente" );
	            fc.setMultiSelectionEnabled( false );
	            FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
	            fc.setFileFilter(filtro);
	            int resultado = fc.showOpenDialog( null );
	            if( resultado == JFileChooser.APPROVE_OPTION )
	            {
	            	if (JFileChooser.APPROVE_OPTION == resultado){
	            		fichero = fc.getSelectedFile();
	            		try{
	            		ImageIcon icon = new ImageIcon(fichero.toString());
	            		Icon icono = new
	            		ImageIcon(icon.getImage().getScaledInstance(foto.getWidth(
	            		), foto.getHeight(), Image.SCALE_DEFAULT));
	            		foto.setText(null);
	            		foto.setIcon( icono );
	            		}catch(Exception ex){
	            			JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
	            		}
	            	}
	            }
			}});
			
}
		public void actionPerformed(ActionEvent arg0) {
			 String comando = arg0.getActionCommand( );
			 
			 if( comando.equals( "agregar" ) )
				        {
				 try {
			String nombre=txtnombre.getText();
			String apellido=txtapellido.getText();
			int cedula =Integer.parseInt(txtcedula.getText());
			int edad=Integer.parseInt(txtedad.getText());
			String empresa=txtempresa.getText();
			double sueldo=Double.parseDouble(txtsueldo.getText());
		   
			String foto=fichero.toString();
		    //String foto=txtnombre.getText();;
		    if(txtnombre==null||txtnombre.equals("")){
	            JOptionPane.showMessageDialog(this,"NOMBRE DEL CLIENTE INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	            txtnombre.setText("");
		    }else if(txtapellido==null||txtapellido.equals("")){
	            JOptionPane.showMessageDialog(this,"APELLIDO DEL CLIENTE INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	           txtapellido.setText(""); 
		    }else if(txtcedula==null||txtcedula.equals("")){
	            JOptionPane.showMessageDialog(this,"CEDULA DEL CLIENTE INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	          txtcedula.setText("");
		    }else  if(txtempresa==null||txtempresa.equals("")){
	                JOptionPane.showMessageDialog(this,"EMPRESA INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	       txtempresa.setText("");    
		    }	else  if(txtsueldo==null||txtsueldo.equals("")){
	            JOptionPane.showMessageDialog(this,"SUELDO INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	        txtsueldo.setText("");    
		    }else if(foto==null||foto.equals("")){
	            JOptionPane.showMessageDialog(this,"FOTO INCORRECTO", "ERROR",JOptionPane.ERROR_MESSAGE);
	           
		    }else  {
		    
		    	
		    boolean paso=referenciaVentaPrincipalC.agregarCliente(nombre,apellido,cedula,edad,sueldo,empresa,foto);
			if(paso) {
		    JOptionPane.showMessageDialog(null,"Cliente agregado. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
	        txtnombre.setText("");
	        txtapellido.setText("");
	        txtcedula.setText("");
	        txtedad.setText("");
	        txtempresa.setText("");
	        txtsueldo.setText("");
			}
			else {
				JOptionPane.showMessageDialog(this, "cliente ya registrado","error",JOptionPane.ERROR_MESSAGE);
			}
	        
		    }
		    }catch (NumberFormatException e) {
			            JOptionPane.showMessageDialog(this,"DATOS INCORRECTOS ","ERROR",JOptionPane.ERROR_MESSAGE);

			// TODO: handle exception
		}
		    
				
			}
					 	
					 	if( comando.equals( "volver" ) )
				        {
				Window v=FocusManager.getCurrentManager().getActiveWindow();
				v.setVisible(false);
		    
				
			}
			


}
}