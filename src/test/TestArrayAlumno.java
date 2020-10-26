package test;
import arrays.*;
import clases.Alumno;
public class TestArrayAlumno {
	static ArrayAlumno   alumnos;
	public static void main(String[] args) {
		
		/*for (int b=0;b<alumnos.tamanio();b++ ){
            System.out.println(alumnos.obtener(b).getNombre());
        }
		alumnos.eliminar();*/
		 alumnos=new ArrayAlumno();
		int totalAlumnos=alumnos.tamanio();
		int totalAprobados=alumnos.alumnosAprobadosPC2().size();
		 System.out.println((100*totalAprobados)/totalAlumnos);
		//for (int b=0;b<alumnos.alumnosAprobadosPC2().size();b++ ){
			
			
           //System.out.println(alumnos.alumnosAprobadosPC2().get(b).getPc2()+"\t"+alumnos.alumnosAprobadosPC2().get(b).getNombre());
		//}
            
        
		
	}
	
	

}
