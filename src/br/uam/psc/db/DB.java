package br.uam.psc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joao Rodolfo
 */
public class DB {

    /*
     * define um atributo conexao da classe Connection estático para que possa 
     * ser instanciado sem que um objeto seja instanciado
     *
    */
    private static Connection conexao = null;

    /*
     * retorna uma conexão com o banco de dados
     * utiliza o método getConnection de DriverManager
     * são passados os parâmetros para a conexão
     */
    public static Connection getConnection() throws SQLException {
        
        if (conexao == null) {
            
            // parâmetros para conexão com o banco
            String dbURL = "jdbc:mysql://localhost:3306/bar_da_esquina_db";
            String usuario = "uam";
            String senha = "uam";
            
            // realiza a conexão com o banco
            conexao = DriverManager.getConnection(dbURL, usuario, senha);
        }
        
        return conexao;
    }
}
