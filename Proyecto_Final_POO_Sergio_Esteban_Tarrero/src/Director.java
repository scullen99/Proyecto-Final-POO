// La clase Director es hija de la clase padre Cargos

public class Director extends Cargos {

	private static int requisitoAniosExperiencia = 20;
	private static boolean requisitoPercel = false;
	
	public static int numeroMaximoPersonas = 1;
	
	@Override
	public boolean pasaRequisitos(Miembro candidato) {

		// Devuelve true en caso de que se cumpla
		// False en caso de que no se cumpla
		return (candidato.getAnosExperiencia() > Director.requisitoAniosExperiencia && candidato.esPerceloNo() == Director.requisitoPercel);
		
	}

}
