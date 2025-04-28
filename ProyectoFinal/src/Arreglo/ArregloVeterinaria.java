package Arreglo;

import java.util.ArrayList;

import Clases.DueñoMascota;

public class ArregloVeterinaria {
	ArrayList<DueñoMascota>duema;
	
	public ArregloVeterinaria() {
		duema = new ArrayList<DueñoMascota>();
		Adicionar(new DueñoMascota("Felipe", "Ramos Diaz", "Av.Alcazar", "39230132", "923212123", false, "Pelusa", "Criollo", "Canino", 5, 12, 2, 2018));
		
	}
	public void Adicionar (DueñoMascota x) {
		duema.add(x); 
	}
	
	public int Tamaño() {
		return duema.size();
	}
	
	public DueñoMascota Obtener(int x) {
		return duema.get(x);
	}
	
}