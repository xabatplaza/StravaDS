package Servidor;

public class Entrenamiento {

	String Titulo;
	String FechaInicio;
	int Distancia;
	String Duracion;
	String Deporte;
	String HoraInicio;
	
	public Entrenamiento(String titulo, String fechaInicio, int distancia, String duracion, String deporte,
			String horaInicio) {
		super();
		Titulo = titulo;
		FechaInicio = fechaInicio;
		Distancia = distancia;
		Duracion = duracion;
		Deporte = deporte;
		HoraInicio = horaInicio;
	}
	
	public Entrenamiento() {
		super();
		Titulo = "";
		FechaInicio = "";
		Distancia = 0;
		Duracion = "";
		Deporte = "";
		HoraInicio = "";
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public int getDistancia() {
		return Distancia;
	}

	public void setDistancia(int distancia) {
		Distancia = distancia;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getDeporte() {
		return Deporte;
	}

	public void setDeporte(String deporte) {
		Deporte = deporte;
	}

	public String getHoraInicio() {
		return HoraInicio;
	}

	public void setHoraInicio(String horaInicio) {
		HoraInicio = horaInicio;
	}

	@Override
	public String toString() {
		return "Entrenamiento [Titulo=" + Titulo + ", FechaInicio=" + FechaInicio + ", Distancia=" + Distancia
				+ ", Duracion=" + Duracion + ", Deporte=" + Deporte + ", HoraInicio=" + HoraInicio + "]";
	}
	
	
	
	
}
	
	