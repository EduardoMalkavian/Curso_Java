package com.eduardo.cursojava.aula17;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landig");
		//contato.setTelefone("11-9999.9999");
		
		
		 //criar objeto endereço relacionamente tem um
		Endereco end = new Endereco();
		end.setNomeRua("Rua Baquerubu");
		end.setNumero("141");
		end.setComplemento("Res centro da Serra");
		end.setCidade("Serra");
		end.setCep("29.179-185");
		end.setEstado("Espirito Santo");
		
		//criar objeto telefone relacionamente tem um
				Telefone tel = new Telefone();
				tel.setTipo("Celular");
				tel.setDdd("027");
				tel.setNumero("99999-8765");
				
				Telefone tel2 = new Telefone();
				tel2.setTipo("casa");
				tel2.setDdd("027");
				tel2.setNumero("98878-8765");
		
				Telefone[] telefones = new Telefone[2];		
				telefones[0] = tel;
				telefones[1] = tel2;
				
						
	
	
		
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}
 
}
