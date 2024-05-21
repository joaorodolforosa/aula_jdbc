package br.uam.psc.program;

import br.uam.psc.db.DB;
import java.sql.Connection;
import java.sql.SQLException;

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

    }

}
