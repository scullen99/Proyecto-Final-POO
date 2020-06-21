import java.time.Year;

// La clase Operario es hija de la clase padre Cargos

public class Operario extends Cargos {
	
	private static int requisitoEdad = 20;
	
	public static int numeroMaximoPersonas = 27;

	@Override
	public boolean pasaRequisitos(Miembro candidato) {
		
		return (Year.now().getValue() - candidato.getNacimiento()) > Operario.requisitoEdad;
		
	}

}
