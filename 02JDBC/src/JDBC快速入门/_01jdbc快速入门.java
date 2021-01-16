package JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class _01jdbc快速入门 {
    public static void main(String[] args) throws Exception {
        //导入驱动jar包
        //注册驱动

        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/glc" , "root", "root");
        //定义sql语句
        String sql = "update student set age =55 where id = 3";
        //获取执行sql对象 Statement
        Statement stmt = conn.createStatement();
        //执行sql
        int count = stmt.executeUpdate(sql);
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();

    }

}
