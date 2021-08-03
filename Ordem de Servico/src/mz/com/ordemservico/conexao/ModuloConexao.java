/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.ordemservico.conexao;

import java.sql.*;

/**
 *
 * @author Soto.Jr
 */
public class ModuloConexao {

    //metodo responsavel Por estabelecer a conexao com o banco de dados
    public static Connection conector() {//o metodo conector sempre ira requerer um retorno porque nao tem o parametro void
        //Connection vem da biblioteca java.sql
        //conector e o nome do metodo
        java.sql.Connection conexao = null;

        //instrucao para chamar o driver do sql ja esta importaddo
        String driver = "com.mysql.jdbc.Driver";

        //Instrucao para Armazenar informcaoes referentes ao banco de dados
        String url = "jdbc://mysql://localhost:3306/dbinfox"; //informando servidor e a porta e o nome do banco
        String user = "root";//informando o nome do usuario do servidor
        String password = "";       //informando a senha 
        
        //Estabelecendo a conexao com o banco de de dados
        
        try {
            //caso de certo a conexao ele obtem o 
            Class.forName(driver);//driver
            conexao = DriverManager.getConnection(url, user, password);//url, usuario e password
            return conexao;//
            //NB: as tres Linhas Acima Sao Sintaxe de qualquer conexao do Banco de dados com o Java
        } catch (Exception e) {
            return null;
        }
    }

}
