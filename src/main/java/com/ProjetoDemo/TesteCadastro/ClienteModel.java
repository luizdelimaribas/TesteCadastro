package com.ProjetoDemo.TesteCadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//O @Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long ID;
String nome;
String email;
int idade;



public ClienteModel() {
}



public ClienteModel(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
}



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



public int getIdade() {
    return idade;
}



public void setIdade(int idade) {
    this.idade = idade;
}



}
