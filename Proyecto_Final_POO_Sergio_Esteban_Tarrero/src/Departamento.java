/*
 
Los departamentos existentes son:
o Departamento de direcci�n.
o Departamento de log�stica.
o Departamento de control de robots.
o Departamento m�dico.
o Departamento de investigaci�n biol�gica.
o Departamento de construcci�n y mantenimiento.
o Departamento de sistemas inform�ticos.
o Departamento de investigaci�n astron�mica.
o Departamento de cometolog�a.
o Departamento de navegaci�n.

*/

import java.util.*;



public class Departamento {

	private ArrayList<Miembro> listaDirectores;
	private ArrayList<Miembro> listaSubdirectores;
	private ArrayList<Miembro> listaResponsables;
	private ArrayList<Miembro> listaCoordinadores;
	private ArrayList<Miembro> listaOperarios;
	
	private String nombreDepartamento;
	
	// constructor
	public Departamento(String nombre) {
		this.nombreDepartamento = nombre;
	}
	
	// getter
	public String getNombre() {
		return this.nombreDepartamento;
	}
	
	// metodos
	
	// metodo aniadir Director
	public void aniadirDirector(Miembro director) {
		if(this.listaDirectores.size() >= Director.numeroMaximoPersonas)
			System.out.println("Se ha alacanzado el numero maximo de directores en este departamento (1). ");
		else
			this.listaDirectores.add(director);
	}
	
	// metodo aniadir Subdirector
	public void aniadirSubdirector(Miembro subdirector) {
		if(this.listaSubdirectores.size() >= Subdirector.numeroMaximoPersonas)
			System.out.println("Se ha alacanzado el numero maximo de subdirectores en este departamento (1). ");
		else
			this.listaSubdirectores.add(subdirector);
	}
	
	// metodo aniadir Responsable
	public void aniadirResponsable(Miembro responsable) {
		if(this.listaResponsables.size() >= Responsable.numeroMaximoPersonas)
			System.out.println("Se ha alacanzado el numero maximo de responsables en este departamento (3). ");
		else
			this.listaSubdirectores.add(responsable);
	}
	
	// metodo aniadir Coordinador
	public void aniadirCoordinador(Miembro coordinador) {
		if(this.listaCoordinadores.size() >= Coordinador.numeroMaximoPersonas)
			System.out.println("Se ha alacanzado el numero maximo de coordinadores en este departamento (9). ");
		else
			this.listaSubdirectores.add(coordinador);
	}
	
	// metodo aniadir Operario
	public void aniadirOperario(Miembro operario) {
		if(this.listaOperarios.size() >= Operario.numeroMaximoPersonas)
			System.out.println("Se ha alacanzado el numero maximo de operarios en este departamento (27). ");
		else
			this.listaSubdirectores.add(operario);
	}
	
}
