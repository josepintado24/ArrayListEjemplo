package clases;
public class Alumno{
   //id, nombre, edad, sexo, pc1, pc2, promedio, carrera
	
	 private String id;
	   private String nombre;
	   private int edad;
	   private String sexo;
	   private double pc1;
	   private double pc2;
	   private double promedio;
	   private String carrera;
	   
	   
	   public Alumno(String id, String nombre, int edad, String sexo, double pc1, double pc2,String carrera) {
		
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.pc1 = pc1;
		this.pc2 = pc2;
		setPromedio();
		this.carrera = carrera;
	}
	   
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPc1() {
		return pc1;
	}
	public void setPc1(double pc1) {
		this.pc1 = pc1;
	}
	public double getPc2() {
		return pc2;
	}
	public void setPc2(double pc2) {
		this.pc2 = pc2;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio() {
		this.promedio = (getPc1()+getPc2())/2;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
		
	}
}