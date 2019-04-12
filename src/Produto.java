import javax.swing.JOptionPane;

public class Produto {
	private String descricao;
	private String genero;
	private int estoqueDisponivel;
	private double precoCusto;
	private double precoVenda;
	
	public void comprar(int qtde) {
		this.estoqueDisponivel += qtde;
		JOptionPane.showMessageDialog(null, "Estoque: " +getEstoqueDisponivel());
	}
	
	public void vender(int qtde) {
		this.estoqueDisponivel -= qtde;
		JOptionPane.showMessageDialog(null, "Estoque: " +getEstoqueDisponivel());
	}
	
	public void calcularPrecoVenda() {
		this.precoVenda = this.precoCusto * 0.1;
		JOptionPane.showMessageDialog(null, "Preço de venda: " +this.precoVenda);
	}
	
	public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto) {
		super();
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
	}
	
	public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
		super();
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}

	public Produto() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
}
