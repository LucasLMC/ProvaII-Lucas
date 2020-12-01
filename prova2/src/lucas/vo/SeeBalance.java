package lucas.vo;

import br.model.AccountModel;

public class SeeBalance {
	public SeeBalance(AccountModel[] account) {
		int value = 0;
		
		for(int i = 0; i < account.length;i++) {
			if(account[i] !=null) {
				value++;
			}
		}
		
		if(value == 0) {
			System.out.println("Saldo Inexistente");
		}
		System.out.println("Saldo" + account[value -1].Valor);
	}
}
