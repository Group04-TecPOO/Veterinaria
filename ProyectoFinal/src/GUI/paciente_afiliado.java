package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paciente_afiliado extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public Gui_Veterinaria gv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			paciente_afiliado dialog = new paciente_afiliado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public paciente_afiliado() {
		setModal(true);
		setTitle("Paciente Afiliado");
		setBounds(100, 100, 671, 536);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(221, 160, 221));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("VER PACIENTES AFILIADOS");
		btnNewButton.setBounds(26, 22, 216, 34);
		contentPanel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 82, 211, 337);
		contentPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("ELIMINAR PACIENTE");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(288, 92, 177, 29);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MODIFICAR PACIENTE");
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setBounds(288, 133, 177, 34);
		contentPanel.add(btnNewButton_2);
	}
	public void actionPerformed(ActionEvent e) {
	}
}
