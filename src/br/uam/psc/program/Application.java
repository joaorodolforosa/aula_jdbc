package br.uam.psc.program;

import br.uam.psc.db.DB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Joao Rodolfo
 */
public class Application {
    
    public static void main(String[] args) throws SQLException {

        /*
        Utiliza o método getConnection de DB para iniciar uma conexão com o banco
         */
        Connection conexao = DB.getConnection();
        // instancia um objeto Statement para as instruções SQL
        Statement statement = conexao.createStatement();
        // representa o conjunto de resultados da instrução SQL
        ResultSet comanda = statement.executeQuery("SELECT * FROM comanda_tb");
        while (comanda.next()) {
            System.out.println(comanda.getInt("qtd") + ", " + comanda.getString("descricao") + ", " + comanda.getDouble("valor"));
        }
        
    }
    
}
