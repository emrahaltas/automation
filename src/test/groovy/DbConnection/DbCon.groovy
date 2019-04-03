package DbConnection


import java.sql.*


public class DbCon {
    public static String dbconnect(String sql) { //secil nur sucu - mert aydın - 22.11.2018 -- db bağlantı metodu
        // Creating the connection
        String serverName = "10.248.67.16";
        String portNumber = "1521";
        String sid = "PRMDBT04";
        @SuppressWarnings("unused")
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String user = "PRMADM";
        String pass = "prmadm123";
        //String sql = "SELECT * FROM (SELECT DISTINCT first_name, last_name FROM USER_IDENTITY_INFO WHERE INTL_USER_ID IN ( SELECT INTL_USER_ID FROM USER_POSITION_LIST WHERE POSITION_ID IN (SELECT POSITION_ID FROM POSITION WHERE POSITION_ID IN (SELECT SALES_MNG_POSITION_ID FROM PARTNER_MAIN_COMPANY_MNG WHERE INTL_PARTNER_ID IN (SELECT INTL_PARTNER_ID FROM PARTNER_DEFINITION)))) ORDER BY DBMS_RANDOM.VALUE () )WHERE ROWNUM < 2";
        Connection con = null;
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet m = st.executeQuery();
            while (m.next()) {
                list2.add(m.getString(1));
            }
            for (int i = 0; i < list.size(); i++) {
                String Str = new String(list2.get(i));
                System.out.println(Str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String a = list2.get(0).toString();
        return a;
    }
}