package controller; 



@Controller
public class AdicionarProdutoVendaController {

	@RequestMapping("/exibirIncluirProdutoVenda")
	
	public String inserirProdutoVenda(){
		
		return("incluirProdutoVenda");
	}
	
}
