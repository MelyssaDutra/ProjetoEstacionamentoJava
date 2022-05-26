package com.aulas.rest.servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.entidades.Vagas;
import com.aulas.rest.repositorios.UsuarioRepositorio;

@Service
public class VagasService {
	@Autowired
	UsuarioRepositorio repo;
	
	
	public List<Vagas> listTodos() {
		List<Vagas> lista = new ArrayList<>();
		
		List<Vagas>vagas = repo.findAll();
		for(Vagas user: vagas) {
			lista.add(new Vagas(vaga));
		}
		return lista;
	}
	public Vagas pegarPorId (int idvagas) {
		Optional<Vagas> obj = repo.findById(idvagas);
		Vagas user = obj.get();
		return new Vagas(vaga);
	}
	
 public Vagas salvar(Vagas vagas) {
	 Vagas vaga = repo.save(vaga);
	 return new Vagas(vaga);
 }
 
 public Vagas alterar(int idvagas, Vagas vagas) {
	 Optional<Vagas> obj = repo.findById(idvagas);
	 Vagas vaga = repo.save(vagas);
	 
	 vaga.setId(vagas.getId());
	 vaga.setTipo(vagas.getTipo());
	 vaga.setStatus(vagas.geStatus());
	 vaga = repo.save(vaga);
	 return new Vagas (vaga);
	 
	 
 }
 
 public void deletar (int idusuario) {
	 repo.deleteById(idusuario);
 }
}

