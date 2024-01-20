package br.com.cotiinformatica.domain.interfaces;

import java.util.UUID;

import br.com.cotiinformatica.domain.dtos.ProjetoPostDTO;

public interface ProjetoService {
	
	UUID criar (ProjetoPostDTO dto);
	
}
