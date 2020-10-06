package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static List<Fabricante> fabricantes= new ArrayList<Fabricante>();
	public int vehiculosAsociados;

	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
		pais.fabricantesAsociados++;
	}
	public static Fabricante fabricaMayorVentas() {
		int max=0;
		int aux=0;
		
		for(int i=0;i<fabricantes.size();i++) {
			if(fabricantes.get(i).vehiculosAsociados>aux) {
				aux=fabricantes.get(i).vehiculosAsociados;
				max=i;
			}
		}
		return fabricantes.get(max);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}


}