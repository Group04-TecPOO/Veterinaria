package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglo.ArregloVeterinaria;

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
	private JButton btnNewButton;

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
		setBounds(100, 100, 917, 536);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(221, 160, 221));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnNewButton = new JButton("VER PACIENTES AFILIADOS");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(30, 206, 216, 34);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ELIMINAR PACIENTE");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(521, 209, 177, 29);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MODIFICAR PACIENTE");
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setBounds(288, 206, 177, 34);
		contentPanel.add(btnNewButton_2);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 284, 881, 150);
			contentPanel.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	ArregloVeterinaria av = new ArregloVeterinaria();
	private JScrollPane scrollPane;
	private JTextArea textArea;
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Listado();
		
	}
	
	//Sebastián Felipe Hermoza Quispe -- Mostrar datos
	void Listado() {
		Imprimir("NombreDueño\tApellido\tDirección\tDNI\tTelefono\tSexo\tNombreMascota\tRaza\tEspecia\tEdad\tDia\tMes\tAño");
		for(int i=0;i<av.Tamaño();i++) {
			Imprimir(""+av.Obtener(i).getNomD()+"\t"+av.Obtener(i).getApe()+"\t"+av.Obtener(i).getDirec()+"\t"+av.Obtener(i).getDni()+"\t"+av.Obtener(i).getTele()
					+"\t"+av.Obtener(i).isSexo()+"\t"+av.Obtener(i).getNomM()+"\t\t"+av.Obtener(i).getRaza()+"\t"+av.Obtener(i).getEspecie()+"\t"+av.Obtener(i).getEdadM()+"\t"+av.Obtener(i).getDia()+"\t"+av.Obtener(i).getMes()+"\t"+av.Obtener(i).getAño());
		}
	}
		void Imprimir(String s) {
			textArea.append(s+"\n");
		}
}
