package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Naroa_Jauregi
 */
public class Tienda
{
    /**
     * se conecta a una db
     */
    public static void connect()
    {
        Connection conn = null;

        // parametros db
        
        String path = "Tienda.db";
        String url = "jdbc:sqlite:" + path;
        try
        {
            // crea una conexion con una db
        	
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        }
        catch (SQLException e)
        {
            System.out.println("Cannot connect to " + url + "database");
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }


    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        connect();
    }
}
