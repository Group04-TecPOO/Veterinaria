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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Dueño:");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(49, 52, 46, 14);
			contentPane.add(lblNombre);
		}
		{
			lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(49, 85, 46, 14);
			contentPane.add(lblApellido);
		}
		{
			lblDni = new JLabel("DNI");
			lblDni.setBounds(49, 121, 46, 14);
			contentPane.add(lblDni);
		}
		{
			lblTelefono = new JLabel("Telefono");
			lblTelefono.setBounds(49, 163, 46, 14);
			contentPane.add(lblTelefono);
		}
		{
			lblDireccion = new JLabel("Direccion");
			lblDireccion.setBounds(49, 200, 46, 14);
			contentPane.add(lblDireccion);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(126, 49, 222, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtApe = new JTextField();
			txtApe.setColumns(10);
			txtApe.setBounds(126, 82, 222, 20);
			contentPane.add(txtApe);
		}
		{
			txtDni = new JTextField();
			txtDni.setColumns(10);
			txtDni.setBounds(126, 118, 222, 20);
			contentPane.add(txtDni);
		}
		{
			txtTel = new JTextField();
			txtTel.setColumns(10);
			txtTel.setBounds(126, 160, 222, 20);
			contentPane.add(txtTel);
		}
		{
			txtDi = new JTextField();
			txtDi.setColumns(10);
			txtDi.setBounds(126, 197, 222, 20);
			contentPane.add(txtDi);
		}
		{
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setBounds(469, 228, 93, 32);
			contentPane.add(btnRegistrar);
		}
		{
			lblMascota = new JLabel("Mascota:");
			lblMascota.setBounds(10, 260, 46, 14);
			contentPane.add(lblMascota);
		}
		{
			lblNombre_1 = new JLabel("Nombre");
			lblNombre_1.setBounds(49, 297, 46, 14);
			contentPane.add(lblNombre_1);
		}
		{
			lblEdad = new JLabel("Edad");
			lblEdad.setBounds(49, 333, 46, 14);
			contentPane.add(lblEdad);
		}
		{
			lblEspecie = new JLabel("Especie");
			lblEspecie.setBounds(49, 369, 46, 14);
			contentPane.add(lblEspecie);
		}
		{
			lblRaza = new JLabel("Raza");
			lblRaza.setBounds(49, 409, 46, 14);
			contentPane.add(lblRaza);
		}
		{
			txtNomM = new JTextField();
			txtNomM.setColumns(10);
			txtNomM.setBounds(126, 294, 222, 20);
			contentPane.add(txtNomM);
		}
		{
			txtEdadM = new JTextField();
			txtEdadM.setColumns(10);
			txtEdadM.setBounds(126, 330, 222, 20);
			contentPane.add(txtEdadM);
		}
		{
			txtEspecie = new JTextField();
			txtEspecie.setColumns(10);
			txtEspecie.setBounds(126, 366, 222, 20);
			contentPane.add(txtEspecie);
		}
		{
			txtRaza = new JTextField();
			txtRaza.setColumns(10);
			txtRaza.setBounds(126, 406, 222, 20);
			contentPane.add(txtRaza);
		}
	}
	public void actionPerformed(ActionEvent e) {
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
}
