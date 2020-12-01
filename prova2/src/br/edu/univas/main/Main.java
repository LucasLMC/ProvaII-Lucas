package br.edu.univas.main;

import java.util.Scanner;

import br.model.AccountModel;
import lucas.vo.AccountController;
import lucas.vo.SeeBalance;

public class Main {

	public static void main(String[] args) {
		AccountModel count [] = new AccountModel[100];
		
		boolean sair = false;
	
	while(sair != true){
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Coloque a Conta");
		System.out.println("2.Ver o Saldo");
		System.out.println("3.Sair");
		
		int escolha = input.nextInt();
		
		switch(escolha) {
		case 1: 
			new  AccountController(count);
			break;
			
		case 2:
			new SeeBalance(count);
			
		case 3:
			sair = true;
			break;
		}
	}

	}}
