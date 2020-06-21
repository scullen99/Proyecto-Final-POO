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

public class Miembro {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private Class<Cargos> cargo;
	private Departamento departamento;
	
	private int anosExperiencia; // a�os experiencia
	private int coeficienteHabEspacial; // 0-100
	private int nacimiento; // a�o de nacimiento
	
	private boolean esPerceloNo;
	
	// Metodos
	
	// Constructor
	public Miembro(String nombre, String apellidos, Class<Cargos> cargos, Departamento departamento, int anosExperiencia, int coeficienteHabEspacial, int nacimiento, boolean esPerceloNo)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargos;
		this.departamento = departamento;
		this.anosExperiencia = anosExperiencia;
		this.coeficienteHabEspacial = coeficienteHabEspacial;
		this.esPerceloNo = esPerceloNo;
		this.nacimiento = nacimiento;
		
	}

	// Getters
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Class<Cargos> getCargo() {
		return cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public int getCoeficienteHabEspacial() {
		return coeficienteHabEspacial;
	}

	public boolean esPerceloNo() {
		return esPerceloNo;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	
	
	

}
