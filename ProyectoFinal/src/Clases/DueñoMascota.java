package Clases;

public class DueñoMascota {
	private String nomD, ape, direc, dni, tele, borrar;
	private boolean sexo;
	private String nomM, raza, especie;
	private int edadM, dia, mes, año;
	
	public DueñoMascota(String nomD, String ape, String direc, String dni, String tele, boolean sexo, String nomM,
			String raza, String especie, int edadM, int dia, int mes, int año) {
		super();
		this.nomD = nomD;
		this.ape = ape;
		this.direc = direc;
		this.dni = dni;
		this.tele = tele;
		this.sexo = sexo;
		this.nomM = nomM;
		this.raza = raza;
		this.especie = especie;
		this.edadM = edadM;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public String getNomD() {
		return nomD;
	}
	public void setNomD(String nomD) {
		this.nomD = nomD;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdadM() {
		return edadM;
	}
	public void setEdadM(int edadM) {
		this.edadM = edadM;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}

}
