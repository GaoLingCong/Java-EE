package JDBC快速入门;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class _11jdbc练习事务 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.开启事务
            conn.setAutoCommit(false);

            //定义sql
            //张三-500；
            String sql1 = "update account set balance = balance - ? where id = ?";
            //李四 +500
            String sql2 = "update account set balance = balance - ? where id = ?";
            //获取执行sql对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            //设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setDouble(2,2);

            // 手动制造异常
            int i = 3/0;
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();


        } catch (Exception throwables) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                if (conn!=null) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
