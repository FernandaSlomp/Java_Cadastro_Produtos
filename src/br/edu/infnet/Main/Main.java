package src.br.edu.infnet.Main;
import java.text.SimpleDateFormat;


import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import src.br.edu.infnet.Erros.MenuException;
import src.br.edu.infnet.ModulosPrincipais.Cotacao;
import src.br.edu.infnet.ModulosPrincipais.ProdCota;
import src.br.edu.infnet.ModulosPrincipais.Produto;
import src.br.edu.infnet.Repositorio.RepositorioCotacao;
import src.br.edu.infnet.Repositorio.RepositorioPC;
import src.br.edu.infnet.Repositorio.RepositorioProduto;

// import java

class Main {
  public static void main(String[] args) throws MenuException, IOException {

  try {

  Scanner scan = new Scanner(System.in);
  Scanner scan2 = new Scanner(System.in);

	///boolean criouLista = false;
    int menu;
	Produto objProduto;
   	Cotacao objCotacao;
	ProdCota objProdCota; 
    String nomeProduto, nomeProdutoCota;
	Date dataDeInclusao;
    int idProduto, idCotacao, idProdCota;
	double precoProduto, precoProdutoCota;

    //int x;

    do{

      ExibirMenu();

      menu = scan.nextInt();

        
      switch(menu){
        case 1 : 
          if (RepositorioProduto.numeroAtual() <= 100 ){
          try{
          System.out.println("Digite o nome do Produto: ");
          nomeProduto= scan2.nextLine();

		  try {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a data de inclusão:\n(formato aceito = [dd/MM/yyyy]");
		
		String dataRecebida = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = df.parse(dataRecebida);
		idProduto = RepositorioProduto.numeroAtual();
        objProduto = new Produto(idProduto, nomeProduto, dt );
		RepositorioProduto.addProduto(objProduto);
		System.out.println("Produto adicionado no código: " + RepositorioProduto.numeroAtual());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

          } catch (InputMismatchException ex) {
            System.out.println("Devem ser digitados números inteiros.");
            
          }catch (NullPointerException ex2) {
            System.out.println("erro: ");
          }
          catch (Exception e) {
                System.out.println("teste de erro");
                System.out.println(e.getMessage());
          }
          } else {
            System.out.println("Impossivel adicionar novo Produto!");
          }

          break;
        
        case 2 : 
		try{
		
			System.out.println("Digite o nome do Produto: ");

			nomeProduto= scan2.nextLine();

			for (Cotacao c : RepositorioCotacao.getListaCotacoes()){
				if (c.getNomeProduto().equals(nomeProduto)){
					throw new MenuException("Cotação ja cadastrada para esse produto!");
				} 
		}
			System.out.println("Digite o preço do produto: ");
			precoProduto = scan.nextDouble();
			idCotacao = RepositorioCotacao.numeroAtual();
			objCotacao = new Cotacao(idCotacao, nomeProduto, precoProduto );
  
			RepositorioCotacao.addCotacao(objCotacao);
  
			System.out.println("Cotação adicionada no código: " + RepositorioCotacao.numeroAtual());
  
			} catch (InputMismatchException ex) {
			  System.out.println("Devem ser digitados números inteiros.");
			  
			}catch (NullPointerException ex2) {
			  System.out.println("erro: " + ex2);
			}
			catch (Exception e) {
				  System.out.println("Error.");
				  System.out.println(e.getMessage());
			}
			catch (Throwable e)	{
			  System.out.println("Impossivel adicionar novo Produto!");
			}
  
			break;
        
        case 3 : 
		System.out.println("Listagem das cotação: ");

		try {
		if (RepositorioCotacao.listar().length() <= 0 ){
			throw new MenuException("Nenhum registro encontrado!");
		}else {
						
			System.out.println(RepositorioCotacao.listar());	

		}
		}	catch (MenuException c) {
			System.out.println(c);

		}
		break;
        

		case 4 :

		System.out.println("Digite o nome do Produto que deseja alterar");

		nomeProduto = scan2.nextLine();

		if( ! RepositorioProduto.getListaProdutos().isEmpty()){
			if( RepositorioProduto.alterarProduto(nomeProduto) ){
				System.out.println("Produto alterado!");

			}else {
				System.out.println("Título não encontrado");
			}

		}else {
			System.out.println("Não existem produtos adicionados ");
		}

		break;

		case 5: 

		for (Cotacao c : RepositorioCotacao.getListaCotacoes()){

			precoProdutoCota = c.getPrecoProduto();
			nomeProdutoCota = c.getNomeProduto();

			for (Produto p :  RepositorioProduto.getListaProdutos()){

				if (c.getNomeProduto().equals(p.getNomeProduto())){

					idProdCota =  p.getIdProduto();
					dataDeInclusao = p.getDataDeInclusao();
					objProdCota = new ProdCota(nomeProdutoCota, dataDeInclusao, precoProdutoCota, idProdCota );
					RepositorioPC.addProdCota(objProdCota);
					System.out.println("LISTA CRIADA!");
				}
			}
		}
			break;
		
		case 6: 

			System.out.println("Listagem dos produtos com cotação: ");

		try {
		if (RepositorioPC.listar().length() <= 0 ){
			throw new MenuException("Nenhum registro encontrado!");
		}else {
						
			System.out.println(RepositorioPC.listar());	

		}
		}	catch (MenuException c) {
			System.out.println(c);

		}
		
		break; 
        case 7:
		try {
			System.out.println("Digite o nome ID que você quer excluir: "); 
				int idProd = scan2.nextInt();
	
				if( ! RepositorioPC.getListaProdCotas().isEmpty()){
					if( RepositorioPC.excluirProdCota(idProd) ){
						System.out.println("Produto removido!");
	
					}else {
						System.out.println("ID não encontrado");
					}
	
				}else {
					System.out.println("Não existem produtos adicionados ");
				}
			
			
			}
			catch (Exception exc){
			System.out.println("Codigo invalido");
			System.out.println(exc.getMessage());
	
			} catch (Throwable e) {
			  System.out.println("Erro genérico");
			} finally {
			  System.out.println("FIM");
			}
		  
			break;

		case 8: 
		System.out.println("Digite o código informado no registro do produto com cotação:  ");
		int x = scan.nextInt();
		System.out.println( RepositorioPC.pesquisarProdCota(x));
			
			break;

		case 9:
		System.out.println(RepositorioPC.pesquisar2()); 
		break;
		case 10 : 
          break;

          default:
          //throw new MenuException("Opçao de Menu invalida");
          
      }
    } while(menu != 10);

  } catch (InputMismatchException ex2) {
    System.out.println(ex2.getMessage());
  } catch (IndexOutOfBoundsException ex3 ){
    System.out.println("Opçao de Menu invalida");    
  }finally {
          System.out.println("FIM");
        }
  
  }

  static void ExibirMenu(){
    System.out.println("========== Escolha ======");
    System.out.println("[1] Registrar Produto.");
	System.out.println("[2] Registrar cotação");
    System.out.println("[3] Lista de cotações.");
    System.out.println("[4] Editar produto cadastrado");
	System.out.println("[5] Gerar lista de produtos com cotação!");
	System.out.println("Atenção! Só selecione as opções abaixo caso tenha criado a lista - opção 5!");
	System.out.println("[6] Exibir todos os produtos com cotação");
	System.out.println("[7] Excluir produto cadastrado com cotação.");
	System.out.println("[8] Buscar produto cotado pelo seu ID");
	System.out.println("[9] Listar produtos com cotação com o preço maior que 100");
    System.out.println("[10] Sair.");
    System.out.println("=========================");

  }

}