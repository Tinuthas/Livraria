import javax.swing.JOptionPane;

public class Livro extends Produto {
	
	private String autor;
	private String editora;
	private String edicao;
	
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Livro \n\n"
				+"Descri��o: "+getDescricao()+"\n"
				+"Genero: "+getGenero()+"\n"
				+"Estoque Dispon�vel: "+getEstoqueDisponivel()+"\n"
				+"Pre�o de custo: "+getPrecoCusto()+"\n"
				+"Pre�o de venda: "+getPrecoVenda()+"\n"
				+"Autor: "+getAutor()+"\n"
				+"Editora: "+getEditora()+"\n"
				+"Edi��o: "+getEdicao()+"\n"
				);
	}
	
	public Livro() {
		super();
	}

	public Livro(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String descricao, String genero, int estoqueDisponivel, double precoCusto,
			String autor, String editora, String edicao) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public Livro(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,
			String autor, String editora, String edicao) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	
}
