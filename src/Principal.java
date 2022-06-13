import java.io.*;

public class Principal {

	public static void main(String[] args)  {

		System.out.println("Inicio del programa");
		
		GestorDeArchivos gestorDeArchivos = new GestorDeArchivos();
		try {
			gestorDeArchivos.guardarArchivo("c:/pepe.txt", "Hola...");
		} catch (GestorDeArchivosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// LUEGO ME PONGO A LEER EL ARCHIVO.....,
		
		
		System.out.println("Fin del programa");
	}

}
