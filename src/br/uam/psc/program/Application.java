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
        
        String sql = "UPDATE comanda_tb SET "
                + "qtd = ?, "
                + "descricao = ?, "
                + "valor = ?"
                + "WHERE id = ?";
        PreparedStatement update = conexao.prepareStatement(sql);
        update.setInt(1, 1);
        update.setString(2, "Caipirinha de vodka");
        update.setDouble(3, 35.0);
        update.setInt(4, 2);
        update.executeUpdate();
        
    }
    
}
