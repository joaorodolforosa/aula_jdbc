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
        
        String sql = "INSERT INTO comanda_tb (qtd, descricao, valor) "
                + "VALUES (?, ?, ?)";
        PreparedStatement inserir = conexao.prepareStatement(sql);
        inserir.setInt(1, 2);
        inserir.setString(2, "Polenta");
        inserir.setDouble(3, 20.0);
        inserir.executeUpdate();
        
        
    }
    
}
