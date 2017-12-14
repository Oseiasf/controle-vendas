package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Venda;
import model.VendaDAO;

@Controller
public class FinalizarVendaController {

	@RequestMapping("/finalizarVenda")
	public String finalizarVenda(Venda venda) {
		VendaDAO dao = new VendaDAO();
		dao.Inserir(venda);
		return "finalizarVenda";
	}
}
