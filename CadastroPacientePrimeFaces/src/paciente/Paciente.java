package paciente;

public class Paciente {
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String medico;
	
	private String atualizarCPF;
	
	private String novoNome;
	private String novoCPf;
	private String novoEmail;
	private String novoMedico;

	public Paciente() {}

	public Paciente(Long id, String nome, String cpf, String email, String medico) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.medico = medico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getNovoNome() {
		return novoNome;
	}

	public void setNovoNome(String novoNome) {
		this.novoNome = novoNome;
	}
	
	
	
	public String getAtualizarCPF() {
		return atualizarCPF;
	}

	public void setAtualizarCPF(String atualizarCPF) {
		this.atualizarCPF = atualizarCPF;
	}

	
	
	public String getNovoCPf() {
		return novoCPf;
	}

	public void setNovoCPf(String novoCPf) {
		this.novoCPf = novoCPf;
	}

	public String getNovoEmail() {
		return novoEmail;
	}

	public void setNovoEmail(String novoEmail) {
		this.novoEmail = novoEmail;
	}

	public String getNovoMedico() {
		return novoMedico;
	}

	public void setNovoMedico(String novoMedico) {
		this.novoMedico = novoMedico;
	}

}
