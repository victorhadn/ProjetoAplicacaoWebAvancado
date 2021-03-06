package br.com.distribuidora.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.distribuidora.mode.Usuario;
import br.com.distribuidora.repository.UsuarioRepository;

/**
 * @author victorhadn
 *
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping
	public List<Usuario> listar() {
		return this.repository.findAll();
	}

	@PutMapping("/{id}")
	public Usuario editar(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
		Usuario usuarioDoBancoDeDados = this.repository.findById(id).get();
		BeanUtils.copyProperties(usuario, usuarioDoBancoDeDados, "id");
		this.repository.save(usuarioDoBancoDeDados);
		return usuarioDoBancoDeDados;
		
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Long id) {
		this.repository.deleteById(id);
	}

	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return this.repository.save(usuario);
	}
}
