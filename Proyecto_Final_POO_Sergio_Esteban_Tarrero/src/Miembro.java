/*
 De cada miembro de la misión deberá guardarse la siguiente información:
  o Nombre.
  o Apellidos.
  o Cargo.
  o Años de experiencia.
  o Año de nacimiento.
  o Cociente de habilidad espacial (un número real entre 0 y 100).
  o Departamento al que pertenece.

 */

public class Miembro {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private Class<Cargos> cargo;
	private Departamento departamento;
	
	private int anosExperiencia; // años experiencia
	private int coeficienteHabEspacial; // 0-100
	private int nacimiento; // año de nacimiento
	
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
