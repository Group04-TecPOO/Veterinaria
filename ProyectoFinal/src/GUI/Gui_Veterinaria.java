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
import java.awt.Color;

public class Gui_Veterinaria extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnPacienteNuevo;
	private JButton btnCita;

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
		setTitle("Menú Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnNewButton = new JButton("Paciente Afiliado");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(30, 138, 133, 35);
			contentPane.add(btnNewButton);
		}
		{
			btnPacienteNuevo = new JButton("Paciente Nuevo");
			btnPacienteNuevo.addActionListener(this);
			btnPacienteNuevo.setBounds(453, 138, 133, 35);
			contentPane.add(btnPacienteNuevo);
		}
		{
			btnCita = new JButton("Cita");
			btnCita.addActionListener(this);
			btnCita.setBounds(231, 252, 133, 35);
			contentPane.add(btnCita);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCita) {
			do_btnCita_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnPacienteNuevo) {
			do_btnPacienteNuevo_actionPerformed(e);
		}
	//Sebastián Felipe Hermoza Quispe - Creación de botones 
	}
	protected void do_btnPacienteNuevo_actionPerformed(ActionEvent e) {
		paciente_nuevo panu = new paciente_nuevo();
		panu.setVisible(true);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		paciente_afiliado afinu = new paciente_afiliado();
		afinu.setVisible(true);
		
	}
	protected void do_btnCita_actionPerformed(ActionEvent e) {
		cita cinu =new cita();
		cinu.setVisible(true);
	}
}
