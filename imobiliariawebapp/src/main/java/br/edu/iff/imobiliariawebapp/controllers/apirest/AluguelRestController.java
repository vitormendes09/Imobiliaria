package br.edu.iff.imobiliariawebapp.controllers.apirest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(path = "/api/v1/imobiliariawebapp")
public class AluguelRestController {

	@PostMapping("")
	@ResponseBody
	@Operation(summary = "Adicionar um aluguel em expecifíco")
	public String adicionarAluguel(Long id) {
		return "Aluguel adicionado.";
	}

	@PutMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Atualizar um aluguel em expecifíco")
	public String atualizarAluguel(@PathVariable("id") Long id) {
		return "Aluguel atualizado.";
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Deletar um aluguel em expecifíco")
	public String deletarAluguel(@PathVariable("id") Long id) {
		return "Aluguel deletado.";
	}

	@GetMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Retornar um aluguel em expecifíco")
	public String buscarAluguel(@PathVariable("id") Long id) {
		return "Aluguel retornado.";
	}

	@PatchMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Finalizar um aluguel em expecifíco")
	public String finalizarAluguel(@PathVariable("id") Long id) {
		return "Aluguel finalizado.";
	}

	@GetMapping("")
	@ResponseBody
	@Operation(summary = "Listar todos os alugueis")
	public String listarAlugueis() {
		return "Alugueis listados.";
	}

	@PostMapping("/{id}/imovel")
	@ResponseBody
	@Operation(summary = "Adicionar um imovel alugado por um cliente em expecifíco")
	public String adicionarImovelAlugado(@PathVariable("id") Long id, Long aId) {
		return "Imovel alugado adicionado ao cliente.";
	}

	@DeleteMapping("/{id}/imovel")
	@ResponseBody
	@Operation(summary = "Deletar um imovel alugado por um cliente em expecifíco")
	public String deletarImovelAlugado(@PathVariable("id") Long id, Long aId) {
		return "Imovel alugado deletado do cliente.";
	}

	@GetMapping("/{id}/imovel")
	@ResponseBody
	@Operation(summary = "Listar os imoveis alugados de um cliente em expecifíco")
	public String listarImoveisAlugados(@PathVariable("id") Long id) {
		return "Lista de imoveis alugados.";
	}

	@PostMapping("/{id}/fpagamento")
	@ResponseBody
	@Operation(summary = "Adicionar a forma de pagamento em um aluguel em expecifíco")
	public String adicionarFormaDePagamento(@PathVariable("id") Long id, Long aId, Long fpId, String tipo) {
		return "Forma de pagamento adicionada ao aluguel do cliente.";
	}

	@PutMapping("/{id}/fpagamento")
	@ResponseBody
	@Operation(summary = "Atualizar a forma de pagamento em um aluguel em expecifíco")
	public String atualizarFormaDePagamento(@PathVariable("id") Long id, Long aId, Long fpId, String tipo) {
		return "Forma de pagamento atualizada.";
	}
}