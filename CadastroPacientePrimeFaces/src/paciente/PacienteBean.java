package paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteBean {
	
	private Long idenditificador = 0L;
	private Paciente paciente = new Paciente();
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	private List<Paciente> pacientes_clone = new ArrayList<Paciente>();
	protected static Long id = 0L;
	
	public PacienteBean() {}
	
	// CRUD -> Create, Read, update e delete.
	
	public void criarPaciente() { // Create
		PacienteBean.id++;
		Paciente p = new Paciente(id, paciente.getNome(), paciente.getCpf(), paciente.getEmail(), paciente.getMedico());
		this.pacientes.add(p);
		this.pacientes_clone.clear();
		this.pacientes_clone.addAll(pacientes);
	}
	
	public List<Paciente> listarPacientes() { // Read
		return this.pacientes;
	}
	
	public void atualizarPaciente(Long id) { // Update
		Paciente p = new Paciente(id, paciente.getNome(), paciente.getNovoCPf(), paciente.getNovoEmail(), paciente.getNovoMedico());
		List<Paciente> pac_s = this.pacientes_clone;
		for (int i = 0; i < pac_s.size(); i++) {
			if ( pac_s.get(i).getId().equals(id) ) {
				this.pacientes.remove(i);
				this.pacientes.add(i, p);
			}
		}
	}
	
	public void deletarPaciente(Long id) { // Delete
		for (Paciente paciente : pacientes_clone) {
			if ( paciente.getId().equals(id) ) {
				this.getPacientes().remove(paciente);
			}
		}
	}

	public Long getIdenditificador() {
		return idenditificador;
	}

	public void setIdenditificador(Long idenditificador) {
		this.idenditificador = idenditificador;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public List<Paciente> getPacientes_clone() {
		return pacientes_clone;
	}

	public void setPacientes_clone(List<Paciente> pacientes_clone) {
		this.pacientes_clone = pacientes_clone;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

}
