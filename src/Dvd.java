import javax.swing.JOptionPane;

public class Dvd extends Produto {
	
	private String diretor;
	private String duracao;
	private String censura;
	
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "DVD \n\n"
				+"Descri��o: "+getDescricao()+"\n"
				+"Genero: "+getGenero()+"\n"
				+"Estoque Dispon�vel: "+getEstoqueDisponivel()+"\n"
				+"Pre�o de custo: "+getPrecoCusto()+"\n"
				+"Pre�o de venda: "+getPrecoVenda()+"\n"
				+"Diretor: "+getDiretor()+"\n"
				+"Dura��o: "+getDuracao()+"\n"
				+"Censura: "+getCensura()+"\n"
				);
	}
	
	public void calcularPreco(double contacaoDolar) {
		setPrecoVenda(getPrecoCusto() * contacaoDolar);
		JOptionPane.showMessageDialog(null, "Pre�o de venda: " +getPrecoVenda());
	}
	public Dvd() {
		super();
	}
	public Dvd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
	}
	public Dvd(String descricao, String genero, int estoqueDisponivel, double precoCusto,
			String diretor, String duracao, String censura) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}
	public Dvd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,
			String diretor, String duracao, String censura) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getCensura() {
		return censura;
	}
	public void setCensura(String censura) {
		this.censura = censura;
	}
	
	
}
