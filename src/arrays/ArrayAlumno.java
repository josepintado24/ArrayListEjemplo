package arrays;
import clases.Alumno;
import java.util.ArrayList;
public class ArrayAlumno
{
    //atri
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Alumno> listaAlumnosAux;
    private ArrayList<Alumno> listaAlumnosAprobadosPC1;
    private ArrayList<Alumno> listaAlumnosAprobadosPC2;
    
    //metoString id, String nombre, int edad, String sexo, double pc1, double pc2,String carrera) {
     public ArrayAlumno(){
         listaAlumnos=new ArrayList<Alumno>();
         listaAlumnos.add(new Alumno ("0001","AnJulio", 25, "F", 2,3,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","Manuel", 25, "M", 4,5,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","Jota", 25, "F", 2,2,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnGel", 25, "M", 4,5,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnLuis", 25, "F", 2,3,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnJose", 25, "M", 2,2,"Sistemas"));
        }
     
    public int tamanio(){
        return listaAlumnos.size();
    }
    
    public Alumno obtener(int posi){
        return listaAlumnos.get(posi);
    }
    
    public void agreguListaAuxiliar(){
        listaAlumnosAux=new ArrayList<Alumno>();
        for (int b=0;b<=tamanio();b++ ){
            if(listaAlumnos.get(b).getPromedio()>=3){
                   listaAlumnosAux.add(listaAlumnos.get(b));  
            } 
        }
        
    }
    
    public void eliminar(){
	    
	    while (buscaMyAN()!=0) {
			for (int b=0;b<=tamanio();b++ ){
		        if ( "M".equals(obtener(b).getSexo()) & "An".equals(obtener(b).getNombre().substring(0,2))){
		        	listaAlumnos.remove(b);
		        	b=tamanio();
		    }
		        
			}
	    }
	}
     
    
    private int buscaMyAN() {
    	int cont=0;
    	for (int b=0;b<tamanio();b++ ){
            if ( "M".equals(listaAlumnos.get(b).getSexo()) & "An".equals(listaAlumnos.get(b).getNombre().substring(0,2))){
            	cont++;
            }
            
        }
    	
    	return cont;
    }
    
    public ArrayList<Alumno> alumnosAprobadosPC1() {
    	listaAlumnosAprobadosPC1 =new ArrayList<Alumno>();
    	for (int i=0;i<tamanio();i++ ){
           if (listaAlumnos.get(i).getPc1()>=3) {
        	   listaAlumnosAprobadosPC1.add(listaAlumnos.get(i));
           }
            
        }
    	return listaAlumnosAprobadosPC1;
    }
    
    public double porcentajesPC(ArrayList<Alumno> test) {
    	ArrayList<Alumno> listaAlumnosAprob =new ArrayList<Alumno>();
    	listaAlumnosAprob=alumnosAprobadosPC2();
    	int totalAlumnos=listaAlumnos.size();
		int totalAprobados=listaAlumnosAprob.size();
		
    	
    	return 0;
    }
    
    public ArrayList<Alumno> alumnosAprobadosPC2() {
    	listaAlumnosAprobadosPC2 =new ArrayList<Alumno>();
    	for (int i=0;i<tamanio();i++ ){
           if (listaAlumnos.get(i).getPc2()>=3) {
        	   listaAlumnosAprobadosPC2.add(listaAlumnos.get(i));
           }
            
        }
    	return listaAlumnosAprobadosPC2;
    }
    
}