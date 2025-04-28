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
import javax.swing.ImageIcon;

public class Gui_Veterinaria extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAfiliado;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnCIta;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;

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
		setBounds(100, 100, 629, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnAfiliado = new JButton("");
			btnAfiliado.setOpaque(false);
			btnAfiliado.setBorderPainted(false);
			btnAfiliado.setContentAreaFilled(false);
			btnAfiliado.addActionListener(this);
			btnAfiliado.setIcon(new ImageIcon("C:\\Users\\sebas\\Desktop\\Dario-Arnaez-Genesis-3G-User-Files.96.png"));
			btnAfiliado.setBounds(50, 72, 133, 134);
			contentPane.add(btnAfiliado);
		}
		{
			lblNewLabel = new JLabel("Paciente Afiliado");
			lblNewLabel.setBounds(80, 217, 92, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Paciente Nuevo");
			lblNewLabel_1.setBounds(451, 217, 82, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			btnCIta = new JButton("New button");
			btnCIta.setOpaque(false);
			btnCIta.setBorderPainted(false);
			btnCIta.setContentAreaFilled(false);
			btnCIta.addActionListener(this);
			btnCIta.setIcon(new ImageIcon("C:\\Users\\sebas\\Desktop\\cita.png"));
			btnCIta.setBounds(234, 240, 133, 113);
			contentPane.add(btnCIta);
		}
		{
			lblNewLabel_2 = new JLabel("Agendar Cita");
			lblNewLabel_2.setBounds(268, 374, 99, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("");
			btnNewButton.setOpaque(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.addActionListener(this);
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\sebas\\Desktop\\nuevo.png"));
			btnNewButton.setBounds(425, 72, 133, 134);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnCIta) {
			do_btnCIta_actionPerformed(e);
		}
		if (e.getSource() == btnAfiliado) {
			do_btnAfiliado_actionPerformed(e);
		}
	}
	
	
	// Sebastian Hernandez cambio y configuracion de botones
	protected void do_btnAfiliado_actionPerformed(ActionEvent e) {
		paciente_afiliado pa =  new paciente_afiliado();
		pa.setVisible(true);
		
	}
	protected void do_btnCIta_actionPerformed(ActionEvent e) {
		cita c = new cita();
		c.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		paciente_nuevo pn= new paciente_nuevo();
		pn.setVisible(true);
		
	}
}
