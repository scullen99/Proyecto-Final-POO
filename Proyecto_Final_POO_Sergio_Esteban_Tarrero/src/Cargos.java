/*
 
 Los cargos que se pueden ejercer son los siguientes:
  o Director (hasta 1 por departamento)
  o Subdirector (hasta 1 por departamento)
  o Responsable (hasta 3 por departamento)
  o Coordinador (hasta 9 por departamento)
  o Operario (hasta 27 por departamento)
  
 */
public abstract class Cargos {

	// atributo
	public static int numeroMaximoPersonas = -1;
	
	// recibe un miembro
	
	
	public abstract boolean pasaRequisitos(Miembro candidato);
	

	
}
