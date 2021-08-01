package smbank;

import java.io.Console;

public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta usuario = new Conta(123,4582);
		Cliente cliente = new Cliente("Carlos Monteiro","568.586-41", "Professor");
		
		usuario.setTitular(cliente);
		
		usuario.deposita(450);
		
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
                + usuario.getNumero()+" Titular:"+ usuario.getTitular().getNome()
                +" Saldo:" +usuario.getSaldo() );

		
		usuario.sacar(200);
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
                + usuario.getNumero()+" Titular:"+ usuario.getTitular().getNome()
                +" Saldo:" +usuario.getSaldo() );

		
		usuario.sacar(400);
		System.out.println("Agência:" + usuario.getAgencia()+ " Conta:"
                + usuario.getNumero()+" Titular:"+ usuario.getTitular().getNome()
                +" Saldo:" +usuario.getSaldo() );

		
		
		
		

	}

}
