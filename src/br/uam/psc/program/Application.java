package br.uam.psc.program;

import br.uam.psc.db.DB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Joao Rodolfo
 */
public class Application {
    
    public static void main(String[] args) throws SQLException {

        /*
         * Utiliza o método getConnection de DB para iniciar uma conexão com o banco
         */
        Connection conexao = DB.getConnection(); 
        
        // utiliza uma instrução pré-compilada PreparedStatement
        PreparedStatement delecao = conexao.prepareStatement("DELETE FROM comanda_tb WHERE id = ?");
        delecao.setInt(1, 3);
        delecao.executeUpdate();
        
    }
    
}
