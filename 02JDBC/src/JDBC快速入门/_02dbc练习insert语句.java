package JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _02dbc练习insert语句 {
    public static void main(String[] args) {
        //提前定义变量在外面，如在try里面访问不到
        Statement stmt = null;
        Connection conn = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into account values(3,'啊聪',2000)";
            //3.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3","root","root");
            //4.获取执行sql对象 Statement
            stmt = conn.createStatement();
            //5.执行
            int count = stmt.executeUpdate(sql);//影响行数
            //6.处理结果
            System.out.println(count);
            if (count>0){
                System.out.println("添加成功");
            }else {
                System.out.println(" 添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //stmt.close();
            //7. 释放资源
            //避免空指针异常
            if (stmt!=null){

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

                }
            }
        }
    }
}
