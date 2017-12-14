package controller; 

import org.springframework.stereotype.Controller;

@Controller
public class AdicionarProdutoVendaController {

	@RequestMapping("/exibirIncluirProdutoVenda")
	
	public String inserirProdutoVenda(){
		
		return("incluirProdutoVenda");
	}
	
}
