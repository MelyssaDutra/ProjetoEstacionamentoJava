package com.aulas.rest.dto;

import java.sql.Date;



import com.aulas.rest.entidades.Usuario;



public class UsuarioDTO {
private String nome;
private String email;
private Date datanascimento;
private char gestante;
private char pcd;



public String getNome() {
return nome;
}



public void setNome(String nome) {
this.nome = nome;
}



public String getEmail() {
return email;
}



public void setEmail(String email) {
this.email = email;
}



public char getGestante() {
return gestante;
}



public void setGestante(char gestante) {
this.gestante = gestante;
}



public char getPcd() {
return pcd;
}



public void setPcd(char pcd) {
this.pcd = pcd;
}



public Date getDatanascimento() {
return datanascimento;
}



public void setDatanascimento(Date datanascimento) {
this.datanascimento = datanascimento;
}



public UsuarioDTO() {



}



public UsuarioDTO(String nome, String email, Date datanascimento, char gestante, char pcd) {



this.nome = nome;
this.email = email;
this.datanascimento = datanascimento;
this.gestante = gestante;
this.pcd = pcd;
}



public UsuarioDTO(Usuario usuario) {



this.nome = usuario.getNome();
this.email = usuario.getEmail();
this.datanascimento = usuario.getDatanascimento();
this.gestante = usuario.getGestante();
this.pcd = usuario.getPcd();
}



}


