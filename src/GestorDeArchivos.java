import java.io.*;

public class GestorDeArchivos {

	public void guardarArchivo(String ruta, String texto) throws GestorDeArchivosException {

		File miArchivo = new File(ruta);
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(miArchivo);
			fileWriter.write(texto);
		} catch (IOException e) {
			System.out.println("Error al grabar el archivo ....");
			
			throw new GestorDeArchivosException("No pudimos guardar tu archivo", e);
		} finally {
			System.out.println("Ejecutando finally....");
			try {
				if(fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {}
		}
	}
	
}
