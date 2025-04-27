package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class productos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			productos dialog = new productos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public productos() {
		setTitle("Productos");
		setBackground(Color.PINK);
		setForeground(Color.PINK);
		setBounds(100, 100, 639, 484);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.PINK);
		contentPanel.setForeground(Color.PINK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTOS:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(33, 21, 109, 16);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(33, 59, 61, 16);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setBounds(33, 87, 61, 16);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tamano");
		lblNewLabel_3.setBounds(33, 115, 61, 16);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Codigo ID");
		lblNewLabel_4.setBounds(33, 143, 89, 16);
		contentPanel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(122, 54, 130, 26);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 82, 130, 26);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 110, 130, 26);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 143, 130, 26);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Anadir");
		btnNewButton.setBounds(354, 54, 117, 29);
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Stock");
		lblNewLabel_5.setBounds(33, 176, 61, 16);
		contentPanel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 171, 130, 26);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(354, 87, 117, 29);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setBounds(354, 130, 117, 29);
		contentPanel.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(productos.class.getResource("/imagenes/2730587-2.png")));
		lblNewLabel_6.setBounds(473, 313, 109, 137);
		contentPanel.add(lblNewLabel_6);
	}
}
