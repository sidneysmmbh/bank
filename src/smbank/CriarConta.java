package smbank;

import java.io.Console;

public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta usuario = new Conta();
		
		usuario.setAgencia(148);
		usuario.setNumero(562);
		usuario.setTitular("Fernando");
		usuario.depositar(500);
		
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
		                  + usuario.getNumero()+" Titular:"+ usuario.getTitular()
		                  +" Saldo:" +usuario.getSaldo() );
		
		usuario.sacar(200);
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
                + usuario.getNumero()+" Titular:"+ usuario.getTitular()
                +" Saldo:" +usuario.getSaldo() );
		
		usuario.sacar(400);
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
                + usuario.getNumero()+" Titular:"+ usuario.getTitular()
                +" Saldo:" +usuario.getSaldo() );
		
		
		
		

	}

}
