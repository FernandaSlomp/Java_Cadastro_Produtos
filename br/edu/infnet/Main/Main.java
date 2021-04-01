package br.edu.infnet.Main;

import java.util.Scanner;

import br.edu.infnet.Erros.MenuException;
import br.edu.infnet.ModulosPrincipais.Produto;
import br.edu.infnet.Repositorio.RepositorioProduto;

import java.io.IOException;
import java.util.*;

import java.util.InputMismatchException;

// import java

class Main {
  public static void main(String[] args) throws MenuException, IOException {

  try {

  Scanner scan = new Scanner(System.in);
  Scanner scan2 = new Scanner(System.in);

    int menu;
	Produto objProduto;
   // AlunoEscola objAluno;
    //ProfessorEscola objProfessor;
    String nomeProduto, dataDeValidade;
    int idProduto;
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
		  System.out.println("Digite a data de validade: ");
          dataDeValidade = scan.next();
		  idProduto = RepositorioProduto.numeroAtual();
          objProduto = new Produto(idProduto, nomeProduto, dataDeValidade );

          RepositorioProduto.addProduto(objProduto);

          System.out.println("Produto adicionado no código: " + RepositorioProduto.numeroAtual());

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
        

          break;
        
        case 3 : 
        try {
        System.out.println("Digite o nome do produto que você quer excluir: "); 
			nomeProduto = scan2.nextLine();

			if( ! RepositorioProduto.getListaProdutos().isEmpty()){
				if( RepositorioProduto.excluirProduto(nomeProduto) ){
					System.out.println("Produto removido!");

				}else {
					System.out.println("Título não encontrado");
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

        case 9 : 
          break;

          default:
          throw new MenuException("Opçao de Menu invalida");
          
      }
    } while(menu != 9);

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
    System.out.println("[1] Registrar Produtos.");
	System.out.println("[2] Registrar cotações por produto.");
    System.out.println("[3] Excluir produto cadastrado.");
    System.out.println("[4] Editar produto cadastrado");
	System.out.println("[5] Consultar cotações cadastrada pelo nome do produto");
	System.out.println("[5] Consultar por data");
    System.out.println("[7] Consultar cotação");
    System.out.println("[8] Exibir todos registros");
    System.out.println("[9] Sair.");
    System.out.println("=========================");

  }

}