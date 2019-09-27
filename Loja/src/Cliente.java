
public class Cliente extends Pessoa{
	
	private String tipoCliente;
	

	public Cliente(String nome,String endereco,String cpfcnpj, String rg, String tipocliente) {
		// TODO Auto-generated constructor stub
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCpfcnpj(cpfcnpj);
		this.setRg(rg);
		this.setTipoCliente(tipocliente);
	}
	

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	
	
	
	

}
