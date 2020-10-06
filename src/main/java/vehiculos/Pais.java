package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	public static List<Pais> paises=new ArrayList<Pais>();
	public int fabricantesAsociados;
	
	
	public static Pais paisMasVendedor() {
		int max=0;
		int aux=0;
		
		for(int i=0;i<paises.size();i++) {
			if(paises.get(i).fabricantesAsociados>aux) {
				aux=paises.get(i).fabricantesAsociados;
				max=i;
			}
		}
		return paises.get(max);
	}
	
	

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}