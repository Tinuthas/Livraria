import javax.swing.JOptionPane;

public class Cd extends Produto {
	
	private String artista;
	private String gravadora;
	private String paisOrigem;
	
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "CD \n\n"
				+"Descrição: "+getDescricao()+"\n"
				+"Genero: "+getGenero()+"\n"
				+"Estoque Disponível: "+getEstoqueDisponivel()+"\n"
				+"Preço de custo: "+getPrecoCusto()+"\n"
				+"Preço de venda: "+getPrecoVenda()+"\n"
				+"Artista: "+getArtista()+"\n"
				+"Gravadora: "+getGravadora()+"\n"
				+"Pais de Origim: "+getPaisOrigem()+"\n"
				);
	}
	
	@Override
	public void calcularPrecoVenda() {
		setPrecoVenda(getPrecoCusto()*0.15);
		JOptionPane.showMessageDialog(null, "Preço de venda: " +getPrecoVenda());
	}
	
	public Cd() {
		super();
	}

	public Cd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
	}
	
	public Cd(String descricao, String genero, int estoqueDisponivel, double precoCusto,
			String artista, String gravadora, String paisOrigem) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		this.artista = artista;
		this.gravadora = gravadora;
		this.paisOrigem = paisOrigem;
	}

	public Cd(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda,
			String artista, String gravadora, String paisOrigem) {
		super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.paisOrigem = paisOrigem;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	

}
