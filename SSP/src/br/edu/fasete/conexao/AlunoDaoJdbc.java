package br.edu.fasete.conexao;

import br.edu.fasete.ssp.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;






public class AlunoDaoJdbc {
    
	
	public void InserirPessoa(Aluno aluno){
		 
		
	  try {
                                     
                           PreparedStatement stmt =  (PreparedStatement) Conexao.getConnection()
                          .prepareStatement("insert into aluno  (nome,matricula,email,senha) values (?,?,?,?)") ;
                   
                             stmt.setString(1, aluno.getNome());
                             stmt.setString(2, aluno.getMatricula());
                             stmt.setString(3, aluno.getEmail());
                             stmt.setString(4, aluno.getSenha());
                                       
		   stmt.executeUpdate();
		   
		   	 	  
	                   JOptionPane.showMessageDialog(null,"Os dados foram inseridos!!!");
		  
	            }catch(Exception e){
		  JOptionPane.showMessageDialog(null,"Os dados não puderam ser inseridos!!!"+e.getMessage());
	               }
	            }
		  
        
	public void ExcluirPessoa(Aluno aluno){
		  	   
	    try {
	       PreparedStatement stmt =  (PreparedStatement) Conexao.getConnection()
	       .prepareStatement( "DELETE FROM aluno WHERE codigo = ?");
                             stmt.setString(1,aluno.getMatricula());
	            stmt.executeUpdate(); 
		    
	     JOptionPane.showMessageDialog(null,"Pessoa excluida!!!");
	     }catch(Exception e){
	        JOptionPane.showMessageDialog(null,"Os dados n�o foram encontrado!!!");
	        } 
	    }
		 
                 /*
		 public void preencher_tabela(JTable Tabela) throws SQLException{
				
				Connection Conn = (Connection) Conexao.getConnection();
				try{
					
					DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
					modelo.setNumRows(0);
					
					Statement statement = (Statement) Conn
							.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
									ResultSet.CONCUR_READ_ONLY);
					ResultSet st = (ResultSet) statement
							.executeQuery("SELECT * FROM Aluno.Aluno");
					while (st.next()){
						modelo.addRow(new Object[]{
								Tabela.getRowCount() + 1,
								st.getInt("codigo"),
								st.getString("nome"),
								st.getString("email"),
								st.getFloat("altura"),
								
								
						});
					}
				 }catch(Exception e){
					    JOptionPane.showMessageDialog(null,"Os dados n�o puderam ser encontrado!!!");
					  } 
				}
				
		
						
		 
		 public void AtualizarPessoa(Pessoa p, int codigo2){
					  try {
					  PreparedStatement stmt =  (PreparedStatement) Conexao.getConnection()
					 .prepareStatement("update Aluno.Aluno set codigo = ?,nome = ?, email = ?, altura = ? where codigo = ?");
				 
				   stmt.setInt(1,p.getCodigo());
				   stmt.setString(2,p.getNome());
				   stmt.setString(3,p.getEmail());
				   stmt.setFloat(4,p.getaltura());
				   
				   stmt.setInt(5,codigo2);
				   
				   stmt.executeUpdate();
				  
				  
				   
				  }catch(Exception e){
				    JOptionPane.showMessageDialog(null,"Os dados n�o puderam ser atualizados!!!");
				  }
			
				 }
				  
				 public void BuscarPessoa(Pessoa p) {
				  
				     
				  try {
				    
					  PreparedStatement stmt =  (PreparedStatement) Conexao.getConnection()
								 .prepareStatement("SELECT * FROM Aluno.Aluno WHERE codigo = ?");
					   stmt.setInt(1,p.getCodigo());
				   ResultSet rs = stmt.executeQuery();
				   
				    while(rs.next())
				    {
				    
				    p.setCodigo(rs.getInt("codigo"));
				   
				    p.setNome(rs.getString("nome"));
				    p.setEmail(rs.getString("email"));
				    p.setAltura(rs.getFloat("altura"));
				     
				    }
				   
				   
				  }catch(Exception e){
				    JOptionPane.showMessageDialog(null,"Os dados n�o puderam ser encontrado!!!");
				  } 
				  
				 }
				 
				 */
				
					
				}
		  


