package com.aulas.rest.servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aulas.rest.dto.UsuarioDTO;
import com.aulas.rest.entidades.Usuario;
import com.aulas.rest.repositorios.UsuarioRepositorio;





@Service
public class UsuarioService {
	@Autowired
	UsuarioRepositorio repo;
	
	
	public List<UsuarioDTO> listTodos() {
		List<UsuarioDTO> lista = new ArrayList<>();
		
		List<Usuario>usuarios = repo.findAll();
		for(Usuario user: usuarios) {
			lista.add(new UsuarioDTO(user));
		}
		return lista;
	}
	public UsuarioDTO pegarPorId (int idusuario) {
		Optional<Usuario> obj = repo.findById(idusuario);
		Usuario user = obj.get();
		return new UsuarioDTO(user);
	}
	
 public UsuarioDTO salvar(Usuario usuario) {
	 Usuario user = repo.save(usuario);
	 return new UsuarioDTO(user);
 }
 
 public UsuarioDTO alterar(int idusuario, Usuario usuario) {
	 Optional<Usuario> obj = repo.findById(idusuario);
	 Usuario user = repo.save(usuario);
	 
	 user.setNome(usuario.getNome());
	 user.setEmail(usuario.getEmail());
	 user.setDatanascimento(usuario.getDatanascimento());
	 user.setGestante(usuario.getGestante());
	 user.setPcd(usuario.getPcd());
	 user.setPerfil(usuario.getPerfil());
	 user.setSenha(usuario.getSenha());
	 user = repo.save(user);
	 return new UsuarioDTO(user);
	 
	 
 }
 
 public void deletar (int idusuario) {
	 repo.deleteById(idusuario);
 }
}
