package arrays;
import clases.Alumno;
import java.util.ArrayList;
public class ArrayAlumno
{
    //atri
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Alumno> listaAlumnosAux;
    
    //metoString id, String nombre, int edad, String sexo, double pc1, double pc2,String carrera) {
     public ArrayAlumno(){
         listaAlumnos=new ArrayList<Alumno>();
         listaAlumnos.add(new Alumno ("0001","AnJulio", 25, "M", 2,3,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","Manuel", 25, "M", 4,5,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","Jota", 25, "M", 2,3,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnGel", 25, "M", 4,5,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnLuis", 25, "M", 2,3,"Sistemas"));
         listaAlumnos.add(new Alumno ("0001","AnJose", 25, "M", 2,3,"Sistemas"));
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
}