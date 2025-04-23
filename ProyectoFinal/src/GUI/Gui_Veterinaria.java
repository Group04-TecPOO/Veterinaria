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
		setBounds(100, 100, 647, 322);
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
			btnRegistrar.setBounds(470, 180, 89, 23);
			contentPane.add(btnRegistrar);
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
		
		
	}
}
