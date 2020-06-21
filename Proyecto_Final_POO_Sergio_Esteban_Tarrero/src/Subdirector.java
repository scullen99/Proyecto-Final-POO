// La clase Subdirector es hija de la clase padre Cargos

import java.time.Year;

public class Subdirector extends Cargos {
	
	private static int requisitoAniosExperiencia = 10;
	private static int requisitoEdad = 30;
	
	public static int numeroMaximoPersonas = 1;

	@Override
	public boolean pasaRequisitos(Miembro candidato) {
		//       saco la edad que tiene                              que sea mayor que el requisito de edad(30)                    que sea mauor que el requisto de años experiencia(
		return (Year.now().getValue() - candidato.getNacimiento()) > Subdirector.requisitoEdad && candidato.getAnosExperiencia() > Subdirector.requisitoAniosExperiencia;
	}

}
