package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Gui_Veterinaria extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtDni;
	private JTextField txtTel;
	private JTextField txtDi;
	private JButton btnRegistrar;
	private JLabel lblMascota;
	private JLabel lblNombre_1;
	private JLabel lblEdad;
	private JLabel lblEspecie;
	private JLabel lblRaza;
	private JTextField txtNomM;
	private JTextField txtEdadM;
	private JTextField txtEspecie;
	private JTextField txtRaza;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_Veterinaria frame = new Gui_Veterinaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_Veterinaria() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 565);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Cita");
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Agendar cita");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Dueño:");
			lblNewLabel.setBounds(27, 73, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(66, 114, 46, 14);
			contentPane.add(lblNombre);
		}
		{
			lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(66, 147, 46, 14);
			contentPane.add(lblApellido);
		}
		{
			lblDni = new JLabel("DNI");
			lblDni.setBounds(66, 183, 46, 14);
			contentPane.add(lblDni);
		}
		{
			lblTelefono = new JLabel("Telefono");
			lblTelefono.setBounds(66, 225, 46, 14);
			contentPane.add(lblTelefono);
		}
		{
			lblDireccion = new JLabel("Direccion");
			lblDireccion.setBounds(66, 262, 46, 14);
			contentPane.add(lblDireccion);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(143, 111, 222, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtApe = new JTextField();
			txtApe.setColumns(10);
			txtApe.setBounds(143, 144, 222, 20);
			contentPane.add(txtApe);
		}
		{
			txtDni = new JTextField();
			txtDni.setColumns(10);
			txtDni.setBounds(143, 180, 222, 20);
			contentPane.add(txtDni);
		}
		{
			txtTel = new JTextField();
			txtTel.setColumns(10);
			txtTel.setBounds(143, 222, 222, 20);
			contentPane.add(txtTel);
		}
		{
			txtDi = new JTextField();
			txtDi.setColumns(10);
			txtDi.setBounds(143, 259, 222, 20);
			contentPane.add(txtDi);
		}
		{
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setBounds(416, 228, 146, 83);
			contentPane.add(btnRegistrar);
		}
		{
			lblMascota = new JLabel("Mascota:");
			lblMascota.setBounds(27, 322, 46, 14);
			contentPane.add(lblMascota);
		}
		{
			lblNombre_1 = new JLabel("Nombre");
			lblNombre_1.setBounds(66, 359, 46, 14);
			contentPane.add(lblNombre_1);
		}
		{
			lblEdad = new JLabel("Edad");
			lblEdad.setBounds(66, 395, 46, 14);
			contentPane.add(lblEdad);
		}
		{
			lblEspecie = new JLabel("Especie");
			lblEspecie.setBounds(66, 431, 46, 14);
			contentPane.add(lblEspecie);
		}
		{
			lblRaza = new JLabel("Raza");
			lblRaza.setBounds(66, 471, 46, 14);
			contentPane.add(lblRaza);
		}
		{
			txtNomM = new JTextField();
			txtNomM.setColumns(10);
			txtNomM.setBounds(143, 356, 222, 20);
			contentPane.add(txtNomM);
		}
		{
			txtEdadM = new JTextField();
			txtEdadM.setColumns(10);
			txtEdadM.setBounds(143, 392, 222, 20);
			contentPane.add(txtEdadM);
		}
		{
			txtEspecie = new JTextField();
			txtEspecie.setColumns(10);
			txtEspecie.setBounds(143, 428, 222, 20);
			contentPane.add(txtEspecie);
		}
		{
			txtRaza = new JTextField();
			txtRaza.setColumns(10);
			txtRaza.setBounds(143, 468, 222, 20);
			contentPane.add(txtRaza);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		
		String nombre = txtNom.getText();
		String apellido = txtApe.getText();
		int dni = Integer.parseInt(txtDni.getText());
		int telefono = Integer.parseInt(txtTel.getText());
		String direccion = txtDi.getText();
		
		String nombreMa = txtNomM.getText();
		int edad = Integer.parseInt(txtEdadM.getText());
		String especie = txtEspecie.getText();
		String raza = txtRaza.getText();
		
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
	
	}
}
