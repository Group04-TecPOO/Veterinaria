package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloVeterinaria;
import Clases.DueñoMascota;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paciente_nuevo extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel1;
	private JLabel lblNewLabel;
	private JLabel lblApellidos;
	private JLabel lblEdad;
	private JLabel lblDireccin;
	private JLabel lblTelfono;
	private JComboBox cboSexo;
	private JLabel lblNewLabel_1;
	private JTextField txtNomD;
	private JTextField txtApeD;
	private JTextField txtDni;
	private JTextField txtDirec;
	private JTextField txtTel;
	private JPanel panel2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JComboBox cboDia;
	private JComboBox cboMes;
	private JComboBox cboAnio;
	private JTextField txtNomM;
	private JTextField txtEdadM;
	private JTextField txtEspe;
	private JTextField txtRaza;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			paciente_nuevo dialog = new paciente_nuevo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public paciente_nuevo() {
		setModal(true);
		setTitle("Paciente Nuevo");
		setBounds(100, 100, 651, 625);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel1 = new JPanel();
			panel1.setBackground(new Color(230, 230, 250));
			panel1.setBounds(23, 24, 462, 261);
			panel1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Datos del dueño:", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));
			contentPanel.add(panel1);
			panel1.setLayout(null);
			{
				lblNewLabel = new JLabel("Nombres: ");
				lblNewLabel.setBounds(24, 48, 76, 19);
				panel1.add(lblNewLabel);
			}
			{
				lblApellidos = new JLabel("Apellidos:");
				lblApellidos.setBounds(24, 78, 76, 19);
				panel1.add(lblApellidos);
			}
			{
				lblEdad = new JLabel("DNI:");
				lblEdad.setBounds(24, 113, 76, 19);
				panel1.add(lblEdad);
			}
			{
				lblDireccin = new JLabel("Dirección:");
				lblDireccin.setBounds(24, 183, 76, 19);
				panel1.add(lblDireccin);
			}
			{
				lblTelfono = new JLabel("Teléfono:");
				lblTelfono.setBounds(24, 220, 76, 19);
				panel1.add(lblTelfono);
			}
			{
				txtNomD = new JTextField();
				txtNomD.setBounds(95, 47, 211, 20);
				panel1.add(txtNomD);
				txtNomD.setColumns(10);
			}
			{
				txtApeD = new JTextField();
				txtApeD.setColumns(10);
				txtApeD.setBounds(95, 77, 211, 20);
				panel1.add(txtApeD);
			}
			{
				txtDni = new JTextField();
				txtDni.setColumns(10);
				txtDni.setBounds(95, 112, 96, 20);
				panel1.add(txtDni);
			}
			{
				txtDirec = new JTextField();
				txtDirec.setColumns(10);
				txtDirec.setBounds(95, 182, 211, 20);
				panel1.add(txtDirec);
			}
			{
				txtTel = new JTextField();
				txtTel.setColumns(10);
				txtTel.setBounds(95, 219, 211, 20);
				panel1.add(txtTel);
			}
		}
		{
			panel2 = new JPanel();
			panel2.setBackground(new Color(230, 230, 250));
			panel2.setBounds(23, 319, 467, 200);
			panel2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Datos de la mascota:", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));
			panel2.setBounds(23, 319, 467, 237);
			contentPanel.add(panel2);
			panel2.setLayout(null);
			{
				lblNewLabel_2 = new JLabel("Nombres: ");
				lblNewLabel_2.setBounds(22, 36, 76, 19);
				panel2.add(lblNewLabel_2);
			}
			{
				lblNewLabel_3 = new JLabel("Edad:");
				lblNewLabel_3.setBounds(22, 66, 76, 19);
				panel2.add(lblNewLabel_3);
			}
			{
				lblNewLabel_4 = new JLabel("Especie:");
				lblNewLabel_4.setBounds(22, 96, 76, 19);
				panel2.add(lblNewLabel_4);
			}
			{
				lblNewLabel_5 = new JLabel("Raza:");
				lblNewLabel_5.setBounds(22, 126, 76, 19);
				panel2.add(lblNewLabel_5);
			}
			{
				lblNewLabel_6 = new JLabel("Fecha de Nacimiento:");
				lblNewLabel_6.setBounds(22, 189, 119, 19);
				panel2.add(lblNewLabel_6);
			}
			{
				cboDia = new JComboBox();
				cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
				cboDia.setBounds(141, 187, 37, 22);
				panel2.add(cboDia);
			}
			{
				cboMes = new JComboBox();
				cboMes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
				cboMes.setBounds(188, 187, 49, 22);
				panel2.add(cboMes);
			}
			{
				cboAnio = new JComboBox();
				cboAnio.setModel(new DefaultComboBoxModel(new String[] {"1800", "1801", "1802", "1803", "1804", "1805", "1806", "1807", "1808", "1809", "1810", "1811", "1812", "1813", "1814", "1815", "1816", "1817", "1818", "1819", "1820", "1821", "1822", "1823", "1824", "1825", "1826", "1827", "1828", "1829", "1830", "1831", "1832", "1833", "1834", "1835", "1836", "1837", "1838", "1839", "1840", "1841", "1842", "1843", "1844", "1845", "1846", "1847", "1848", "1849", "1850", "1851", "1852", "1853", "1854", "1855", "1856", "1857", "1858", "1859", "1860", "1861", "1862", "1863", "1864", "1865", "1866", "1867", "1868", "1869", "1870", "1871", "1872", "1873", "1874", "1875", "1876", "1877", "1878", "1879", "1880", "1881", "1882", "1883", "1884", "1885", "1886", "1887", "1888", "1889", "1890", "1891", "1892", "1893", "1894", "1895", "1896", "1897", "1898", "1899", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
				cboAnio.setBounds(249, 187, 64, 22);
				panel2.add(cboAnio);
			}
			{
				txtNomM = new JTextField();
				txtNomM.setColumns(10);
				txtNomM.setBounds(102, 35, 211, 20);
				panel2.add(txtNomM);
			}
			{
				txtEdadM = new JTextField();
				txtEdadM.setColumns(10);
				txtEdadM.setBounds(102, 65, 211, 20);
				panel2.add(txtEdadM);
			}
			{
				txtEspe = new JTextField();
				txtEspe.setColumns(10);
				txtEspe.setBounds(102, 96, 211, 20);
				panel2.add(txtEspe);
			}
			{
				txtRaza = new JTextField();
				txtRaza.setColumns(10);
				txtRaza.setBounds(102, 125, 211, 20);
				panel2.add(txtRaza);
			}
			{
				cboSexo = new JComboBox();
				cboSexo.setBounds(93, 156, 96, 22);
				panel2.add(cboSexo);
				cboSexo.setModel(new DefaultComboBoxModel(new String[] {"Macho", "Hembra"}));
				cboSexo.setToolTipText("");
			}
			{
				lblNewLabel_1 = new JLabel("Sexo:");
				lblNewLabel_1.setBounds(22, 160, 46, 14);
				panel2.add(lblNewLabel_1);
			}
		}
		{
			btnRegistrar = new JButton("REGISTRAR");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setBackground(new Color(176, 196, 222));
			btnRegistrar.setBounds(514, 259, 100, 95);
			contentPanel.add(btnRegistrar);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	 ArregloVeterinaria av = new ArregloVeterinaria();
	// Registro de datos - Melissa Guillen Olivera
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		//Carlos Garcia try catch
		try { 
			
			int edad = LeerEdad(); 
		    if (edad < 0) { 
		        MostrarError(); 
		        return; 
		    }
			DueñoMascota dm1= new DueñoMascota(LeerNomD(), LeerApe(), LeerDire(), LeerDni(), LeerTele(), LeerSexo(), LeerNomM(), LeerRaza(), LeerEspe(), LeerEdad(), LeerDia(), LeerMes(), LeerAño());
		av.Adicionar(dm1);
		} catch (Exception e2) {
			MostrarError();
		}
	}
	
	private void MostrarError() {//Se crea un metodo para que muestre un mensaje del error
		JOptionPane.showMessageDialog(this,"Ingrese edad valida");
	}
	
	String LeerNomD(){
		return txtNomD.getText();
	}
	String LeerApe(){
		return txtApeD.getText();
	}
	String LeerDire(){
		return txtDirec.getText();
	}
	String LeerDni(){
		return txtDni.getText();
	}
	String LeerTele(){
		return txtDni.getText();
	}
	String LeerNomM(){
		return txtNomM.getText();
	}
	String LeerRaza(){
		return txtRaza.getText();
	}
	String LeerEspe(){
		return txtEspe.getText();
	}
	int LeerEdad(){
		return Integer.parseInt(txtEdadM.getText());
	}
	int LeerDia(){
		return Integer.parseInt(cboDia.getSelectedItem().toString());
	}
	int LeerMes() {
		return Integer.parseInt(cboMes.getSelectedItem().toString());
	}
	int LeerAño() {
		return Integer.parseInt(cboAnio.getSelectedItem().toString());
	}
	boolean LeerSexo() {
		return Boolean.parseBoolean(cboSexo.getActionCommand());
	}
	
	
	
}
