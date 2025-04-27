package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class servicios extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			servicios dialog = new servicios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public servicios() {
		setTitle("Servicios");
		setBackground(Color.PINK);
		setBounds(100, 100, 792, 706);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.PINK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("SERVICIOS:");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			lblNewLabel.setBounds(41, 38, 177, 22);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setBounds(41, 90, 61, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Precio");
			lblNewLabel_2.setBounds(41, 120, 61, 16);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("ejemplo corte de pelo o bano o desparasitacion no se");
			lblNewLabel_3.setBounds(34, 226, 569, 162);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(servicios.class.getResource("/imagenes/bexter-shampoo-para-perros-cuidado-total-500ml-2.jpg")));
			lblNewLabel_4.setBounds(552, 417, 162, 180);
			contentPanel.add(lblNewLabel_4);
		}
		{
			textField = new JTextField();
			textField.setBounds(138, 85, 130, 26);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(138, 115, 130, 26);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Anadir");
			btnNewButton.setBounds(418, 85, 117, 29);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Eliminar");
			btnNewButton_1.setForeground(Color.RED);
			btnNewButton_1.setBounds(418, 125, 117, 29);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("Modificar");
			btnNewButton_2.setForeground(Color.ORANGE);
			btnNewButton_2.setBounds(418, 166, 117, 29);
			contentPanel.add(btnNewButton_2);
		}
	}

}
