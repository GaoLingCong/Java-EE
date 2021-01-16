package JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 修改记录
 */

public class _03jdbc练习update语句 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3","root","root");
            //2.获取连接对象
            String sql = "update account set balance = 1500 where id = 3";
            //3.定义sql
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);
            //4.获取执行sql对象
            System.out.println(count);
            //6.处理结果
            if (count>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }finally {

                }
            }
        }
    }
}
