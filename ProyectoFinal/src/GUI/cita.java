package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cita extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDni;
	private JTextField txtCodM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cita dialog = new cita();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public cita() {
		setModal(true);
		setTitle("Cita");
		setBounds(100, 100, 620, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(76, 63, 46, 14);
		contentPanel.add(lblNewLabel);
		
		txtDni = new JTextField();
		txtDni.setBounds(112, 60, 132, 20);
		contentPanel.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Mascota");
		lblNewLabel_1.setBounds(315, 63, 82, 14);
		contentPanel.add(lblNewLabel_1);
		
		txtCodM = new JTextField();
		txtCodM.setBounds(407, 60, 137, 20);
		contentPanel.add(txtCodM);
		txtCodM.setColumns(10);
	}
}
