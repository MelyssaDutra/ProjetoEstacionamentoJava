package com.aulas.rest.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vagas {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
private int idvagas;
private String tipo;
private String status;

public int getIdvagas() {
	return idvagas;
}

public void setIdvagas(int idvagas) {
	this.idvagas = idvagas;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public string Status() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
public Vagas() {
	
}
public Vagas(int idvagas, String tipo, boolean status) {
	
	this.idvagas = idvagas;
	this.tipo = tipo;
	this.status = status;
}
	


}
