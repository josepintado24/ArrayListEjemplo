package test;
import arrays.*;
public class TestArrayAlumno {
	static ArrayAlumno   alumnos=new ArrayAlumno();
	public static void main(String[] args) {
		for (int b=0;b<alumnos.tamanio();b++ ){
            System.out.println(alumnos.obtener(b).getNombre());
        }
		alumnos.eliminar();
		
            System.out.println("-----------");
        
		
            for (int b=0;b<alumnos.tamanio();b++ ){
                System.out.println(alumnos.obtener(b).getNombre());
            }
			//System.out.println(alumnos.buscaMyAN());
        
		
	}
	
	

}
