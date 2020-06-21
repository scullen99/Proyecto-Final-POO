import java.time.Year;

// La clase Responsable es hija de la clase padre Cargos

public class Responsable extends Cargos {

	public static int numeroMaximoPersonas = 3;
	
	private static int requisitoEdad = 25;
	private static int requisitoCHE = 70;
		
	@Override
	public boolean pasaRequisitos(Miembro candidato) {

		return (Year.now().getValue() - candidato.getNacimiento()) > Responsable.requisitoEdad && candidato.getCoeficienteHabEspacial() > Responsable.requisitoCHE;
				
	}

}
