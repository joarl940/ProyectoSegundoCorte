import java.awt.*;
import javax.swing.*;



public class AgregarProducto extends JFrame {
	private JButton btnagregar,btnvolver;
	private JTextField txtpeso,txtvalor;
	private JComboBox jcbnombre,jcbmarca;
	
	public AgregarProducto () {
		super("AGREGAR PRODUCTOS");
		
		this.iniciar(); //Configurar mi JFRAME
		this.configurarComponentes();

		this.pack();
		this.setVisible(true);
	}
	private AgregarProducto iniciar() {
			
		Dimension dims = new Dimension(400, 450);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return this;
	}
	private void configurarComponentes() {
		
		Container contentPane = this.getContentPane();
		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(10, 30, 350, 20);
		contentPane.add(nombre);
		jcbnombre=new JComboBox();
		jcbnombre.setModel(new DefaultComboBoxModel(new String[] {"seleccionar","Televisor","Nevera","lavadora","Teatro en casa","Licuadora","Sanduchera","Estufa","Cafetera","DVD","Otro"}));
		jcbnombre.setBounds(10,60,350,20);
		contentPane.add(jcbnombre);
		
		JLabel marca = new JLabel("Marca");
		marca.setBounds(10, 90, 350, 20);
		contentPane.add(marca);
		jcbmarca=new JComboBox();
		jcbmarca.setModel(new DefaultComboBoxModel(new String[] {"seleccionar","SONY","HACEB","HOME ELEMENTS","MABE","SAMSUNG","LG","CHALLENGUER","Otro"}));
		jcbmarca.setBounds(10,120,350,20);
		contentPane.add(jcbmarca);
		
		JLabel peso = new JLabel("Peso  Kg.");
		peso.setBounds(10, 150, 350, 20);
		contentPane.add(peso);
		txtpeso=new JTextField(10);
		txtpeso.setBounds(10,180,250,20);
		contentPane.add(txtpeso);
		
		JLabel valor = new JLabel("Valor  $.");
		valor.setBounds(10, 210, 250, 20);
		contentPane.add(valor);
		txtvalor=new JTextField(10);
		txtvalor.setBounds(10,240,250,20);
		contentPane.add(txtvalor);
		
		
		btnagregar=new JButton("AGREGAR");
		btnagregar.setBounds(10,270,100,20);
		contentPane.add(btnagregar);
		
		btnvolver=new JButton("VOLVER");
		btnvolver.setBounds(150,270,100,20);
		contentPane.add(btnvolver);
		
		
	
	}
}