package entidades;

public abstract class Propiedad {
	private int id, m2;
	private String direccion;
	private double importeBase;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getImporteBase() {
		return importeBase;
	}
	public void setImporteBase(double importeBase) {
		this.importeBase = importeBase;
	}
	
	

}
