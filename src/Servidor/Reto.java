package Servidor;

public class Reto {
	String Nombre;
	String FechaInicio;
	String FechaFin;
	String Objetivo;
	String Deporte;
	
	public Reto(String nombre, String fechaInicio, String fechaFin, String objetivo, String deporte) {
		super();
		Nombre = nombre;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		Objetivo = objetivo;
		Deporte = deporte;
	}
	
	public Reto() {
		super();
		Nombre = "";
		FechaInicio = "";
		FechaFin = "";
		Objetivo = "";
		Deporte = "";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	public String getObjetivo() {
		return Objetivo;
	}

	public void setObjetivo(String objetivo) {
		Objetivo = objetivo;
	}

	public String getDeporte() {
		return Deporte;
	}

	public void setDeporte(String deporte) {
		Deporte = deporte;
	}

	@Override
	public String toString() {
		return "Reto [Nombre=" + Nombre + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", Objetivo="
				+ Objetivo + ", Deporte=" + Deporte + "]";
	}
	
	
	

	

}
