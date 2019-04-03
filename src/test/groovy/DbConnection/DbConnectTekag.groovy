package DbConnection
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DbConnectTekag {

    public String islemYeri = "0";
    public String message = "";
    public Connection connection;
    private java.sql.Statement statement;
    public PreparedStatement pstatement;
    public ResultSet rset;
    public CallableStatement cstmt;
    public Statement statCommitsiz;
    private short ortam = 1;
    public DbConnectTekag() {
    }

    public String getMessage() {
        return message;
    }

    public java.sql.Statement getStatement() {
        return statement;
    }

    public java.sql.PreparedStatement preStatement(String sql) {
        try {
            pstatement = connection.prepareStatement(sql);
            return pstatement;
        } catch (Exception e) {
            return pstatement;
        }
    }

    public java.sql.Statement getStatCommitsiz() {
        try {
            statCommitsiz = connection.createStatement();
            return statCommitsiz;
        } catch (Exception e) {
            return statCommitsiz;
        }
    }

    public boolean getConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                if (ortam == 1)
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@10.248.67.16:1521:PRMDBT04", "PRMADM", "prmadm123");

                else {
                    Context ctx = new InitialContext();
                    DataSource cpds = (DataSource) ctx.lookup("jdbc/CRM");
                    connection = cpds.getConnection();
                }


            statement = connection.createStatement();

            return true;

        } catch (Exception e) {
            message = e.toString();
            System.err.println("JDBC error >> " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void closeConnection() {
        try {
            if (rset != null)
                try {
                    rset.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION RESULTSET KAPATILAMADI: " + e.getMessage());
                }
            if (cstmt != null)
                try {
                    cstmt.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION CALLABLE STATEMENT KAPATILAMADI: " + e.getMessage());
                }
            if (statement != null)
                try {
                    statement.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION STATEMENT KAPATILAMADI: " + e.getMessage());
                }
            if (statCommitsiz != null)
                try {
                    statCommitsiz.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION COMMITSIZ STATEMENT KAPATILAMADI: " + e.getMessage());
                }
            if (pstatement != null)
                try {
                    pstatement.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION PREPARED STATEMENT KAPATILAMADI: " + e.getMessage());
                }
            if (connection != null)
                try {
                    connection.close();
                } catch (Exception e) {
                    System.err.println("__CONNECTION KAPATILAMADI: " + e.getMessage());
                }
        } catch (Exception e) {
            message = e.toString();
        }

    }

    @Override
    protected void finalize() throws Throwable {
        this.closeConnection();
    }

    public boolean setAutoCommit(boolean deger) {
        try {
            connection.setAutoCommit(deger);
            return true;

        } catch (Exception e) {
            message = e.toString();
            return false;

        }
    }

    public boolean commit() {
        try {
            connection.commit();
            return true;

        } catch (Exception e) {
            message = e.toString();
            return false;

        }
    }

    public boolean rollback() {
        try {
            connection.rollback();
            return true;

        } catch (Exception e) {
            message = e.toString();
            return false;

        }
    }
}

