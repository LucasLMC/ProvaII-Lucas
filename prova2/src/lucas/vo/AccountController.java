package lucas.vo;

import java.util.Scanner;

import br.model.AccountModel;

public class AccountController {


	AccountModel newAccount [];
	
	public AccountController(AccountModel[] account) {
		System.out.println("Cadastre sua conta");
		newAccount = account;
		this.input();
	}
	
	public void input() {
		Scanner entrada = new Scanner(System.in); 
		boolean sair = false;
		
		int value = 0;
		
		for (int i = 0; i < newAccount.length; i++) {
            if (newAccount[i] != null) {
                value++;
            }
        }
		
		while(sair != true) {
			AccountModel account = new AccountModel();
			System.out.println("Descrição da Conta");
			account.Descricao = entrada.next();
			
		
			System.out.println(" Valor");
			account.Valor = entrada.nextFloat();	
			
			System.out.println("Data de Vencimento");
			account.dataDeVencimento = entrada.next();
			
			System.out.println("Tipo");
			account.Tipo = entrada.next();
			
			account.Valor = this.receita(account.Tipo, value);
			
			newAccount[value] = account;
			
			account.Valor = this.receita(account.Tipo, value);
			
			sair = true;
			System.out.flush();
			
		}
	}
	public float receita(String tipo, int value) {
		float total = 0;
		if (tipo.toUpperCase().contains("receita")) {
			
			for (int i =0; i< newAccount.length; i++) {
				if(i < value) {
					total += newAccount[i].Valor;
				}
			}
			total =  total + newAccount[value].Valor;
			
		}else if(tipo.toUpperCase().contains("despesa")){
			  for (int i = 0; i < newAccount.length; i++) {
		            if (i < value) {
		            	total += newAccount[i].Valor;
		            }
		        }
		        total = total - newAccount[value].Valor;	
	}
		 return total;
}
   
}
