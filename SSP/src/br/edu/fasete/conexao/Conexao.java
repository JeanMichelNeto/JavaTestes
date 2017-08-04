
package br.edu.fasete.conexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jean Michel
 */


public class Conexao {

   private static Connection con;
                  private final String driver = "org.postgresql.Driver"; // *Serviço do Banco de Dados*//
	private static String url = "jdbc:postgresql://localhost:5433/SSP";/* Caminho do Banco de Dados */
	private static String user = "postgres"; /*Usuário do Banco de Dados*/
	private static String pass = "457882288"; /*Senha do Banco de Dados*/
	
	static {
                           try {
	             Class.forName("org.postgresql.Driver");
                        JOptionPane.showMessageDialog(null, "Conectado com Sucesso!!");
	         } catch(Exception e) {
	           System.out.println("ERRO: " + e.getMessage());
	     }
	}
	
	public static Connection getConnection() {
	         if(con == null) {
                                try {
		 con = DriverManager.getConnection(url,user, pass);
                                          /*OptionPane.showMessageDialog(null, "Conectado com Sucesso!!");*/
                                } catch (SQLException e) {
		      JOptionPane.showMessageDialog(null, "Impossível Conectar!!"+e.getMessage());
		 }
                                }
	         return con;
		
	}
    
      
    
}
