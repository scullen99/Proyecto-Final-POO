// La clase Coordinador es hija de la clase padre Cargos

public class Coordinador extends Cargos {

	private static int requisitoCHE = 80;
	
	public static int numeroMaximoPersonas = 9;
	
	@Override
	public boolean pasaRequisitos(Miembro candidato) {

		return candidato.getCoeficienteHabEspacial() > Coordinador.requisitoCHE;
		
	}

}
