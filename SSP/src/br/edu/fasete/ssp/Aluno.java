/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasete.ssp;

/**
 *
 * @author Jean Michel
 */
public class Aluno {
     private String matricula;
     private String nome;
     private String email; 
     private String senha;

    
     
          public String getMatricula(){
            return matricula;
          }
          
          public void setMatricula(String matricula){
                  this.matricula = matricula;
              
          }
          
          public String getNome(){
              return nome;
          }
          
          public void setNome(String nome){
            this.nome = nome;
            
          }
          
          public String getEmail(){
               return email;
          
          }
          
          public void setEmail(String email){
             this.email = email;
             
          }
          
          public String getSenha(){
              return senha;
          }
          
          public void setSenha(String senha){
              this.senha = senha;
          }

    public Aluno(){
    
    }
    
    public Aluno(String matricula, String nome, String email, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
          
            @Override
          public String toString(){
		return "nome " + nome + "matricula" + matricula + "email" + email + "senha" +senha;
		
	}


}
