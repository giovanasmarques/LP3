package br.edu.ifsp.cmp.tads.ex6;

public class Livro {
	
	public class ErroLeituraException extends Exception{
		public ErroLeituraException(String msg) {
			super(msg);
		}
	}
	
	public void LerPagina(int pagina) {
		try {
			if(pagina < 1) {
				throw new ErroLeituraException("Valor informado invalido");
			}
			System.out.println("Pagina " + pagina + " lida");
		}catch(ErroLeituraException e){
			System.out.println(e.getMessage());
		}
	}
	
	 public static void main(String[] args) {
        Livro let = new Livro();
        let.LerPagina(0);
    }

}
