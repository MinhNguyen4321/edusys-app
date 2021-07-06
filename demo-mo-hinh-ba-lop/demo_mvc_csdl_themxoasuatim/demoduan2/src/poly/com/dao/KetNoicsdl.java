/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LE ANH TU
 */
public class KetNoicsdl 
{ protected Connection con=null;
    public KetNoicsdl()
    {
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           /* String connectionurl=
                   "jdbc:sqlserver://localhost:1433; databaseName=quanlybanhang02;integratedSecurity=true;" ;
            con=DriverManager.getConnection(connectionurl);
            //hoac
*/
          
            String connectionurl= "jdbc:sqlserver://localhost:1433; databaseName=quanlybanhang02;" ;
            con=DriverManager.getConnection(connectionurl,"sa","123");
        }
           catch(Exception ex)
            {
                ex.printStackTrace();
            }        
    }
    
}
