/*
 De cada miembro de la misi�n deber� guardarse la siguiente informaci�n:
  o Nombre.
  o Apellidos.
  o Cargo.
  o A�os de experiencia.
  o A�o de nacimiento.
  o Cociente de habilidad espacial (un n�mero real entre 0 y 100).
  o Departamento al que pertenece.

 */

public class Miembros {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private String cargo;
	private String departamento;
	
	private int anosExperiencia;
	private int coeficienteHabEspacial;
	
	boolean esPerceloNo;
	
	// Metodos
	
	// Constructor
	public Miembros(String nombre, String apellidos, String cargo, String departamento, int anosExperiencia, int coeficienteHabEspacial)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.departamento = departamento;
		this.anosExperiencia = anosExperiencia;
		this.coeficienteHabEspacial = coeficienteHabEspacial;
		this.esPerceloNo = esPerceloNo;
		
	}

	// Getters
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCargo() {
		return cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public int getCoeficienteHabEspacial() {
		return coeficienteHabEspacial;
	}

	public boolean isEsPerceloNo() {
		return esPerceloNo;
	}

}
