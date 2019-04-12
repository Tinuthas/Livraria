import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Livro livro = new Livro("Como se perder por uma floresta", "Aventura", 100, 60.00, "Carlos Filho", "Cia", "1º");
		Cd cd = new Cd("Melhores músicas de 2019", "Eletrônica", 3000, 10.00, "Claudia Santos", "Mix", "Brasil");
		Dvd dvd = new Dvd("Quando três jovens se deparam", "Mistério", 10000, 30.00, "Rogerio Douglas", "1h40min", "12 anos");
		
		for(int i = 0; i != 0;) {
			i = menu();
			
			if(i == 1) {
				menuLivro(livro);
			}else if(i == 2) {
				menuCd(cd);
			}else if(i == 3) {
				menuDvd(dvd);
			}
		}
		
	}
	private static void menuLivro(Livro livro) {
		for(int i = 0; i != 0;) {
			i = menuOpcoes();
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Cadastrado!");
			}else if(i == 2) {
				livro.comprar((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer comprar? "))));
			}else if(i == 3) {
				livro.calcularPrecoVenda();
			}else if(i == 4) {
				livro.vender((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer vender? "))));
			}else if(i == 5) {
				livro.listarProduto();
			}
		}
		
	}
	
	private static void menuCd(Cd cd) {
		for(int i = 0; i != 0;) {
			i = menuOpcoes();
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Cadastrado!");
			}else if(i == 2) {
				cd.comprar((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer comprar? "))));
			}else if(i == 3) {
				cd.calcularPrecoVenda();
			}else if(i == 4) {
				cd.vender((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer vender? "))));
			}else if(i == 5) {
				cd.listarProduto();
			}
		}	
	}
	
	private static void menuDvd(Dvd dvd) {
		for(int i = 0; i != 0;) {
			i = menuOpcoes();
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Cadastrado!");
			}else if(i == 2) {
				dvd.comprar((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer comprar? "))));
			}else if(i == 3) {
				
			}else if(i == 4) {
				dvd.vender((Integer.parseInt(
						JOptionPane.showInputDialog("Quandos quer vender? "))));
			}else if(i == 5) {
				dvd.listarProduto();
			}
		}	
	}

	private static int menu() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Selecione: \n"
				 + "1 - Livro \n" 
				 + "2 - CD \n" 
				 + "3 - Livro \n" 
				 + "0 - Sair \n"));
		return i;
	}
	
	private static int menuOpcoes() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opções: \n"
				 + "1 - Cadastrar \n" 
				 + "2 - Comprar \n" 
				 + "3 - Calcular Preço de Venda \n" 
				 + "4 - Vender \n" 
				 + "5 - Listar \n" 
				 + "0 - Sair \n"));
		return i;
	}

}
