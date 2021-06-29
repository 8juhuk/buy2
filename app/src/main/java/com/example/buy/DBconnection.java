package com.example.buy;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconnection {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=FALSE";
    private static final String DBUSER = "root";
    private static final String DBPASSWORD = "root";

    public static boolean linkMysql() {
        Connection conn=null;
        PreparedStatement stmt=null;
        try {
            Class.forName(DBDRIVER).newInstance();
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        try{
            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
            String sql = "SELECT * from test1";
            stmt= conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String sUser = rs.getString("name");
                Log.i("temp", sUser);
            }
            rs.close();
            stmt.close();;
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            if(conn!=null){
                try {
                    conn.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }

    }
}